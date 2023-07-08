package FinalProject_v3;
public class Television extends Electrodomestico {
    //Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
    private short resolucion;
    private boolean sintonizadorTDT;
    double PrecioTotal = getPrecioBase();

    //Por defecto, la resolucion sera de 20 pulgadas y el sintonizador sera false.
    private static final boolean sintonizadorTDT_por_defecto = false;
    private static final short resolucion_por_defecto = 20;

    // Un constructor por defecto
    public Television(double precioBase, String color, char consumoEnergetico, double peso) {
            super(precioBase, color,consumoEnergetico,peso);
            this.sintonizadorTDT = sintonizadorTDT_por_defecto;
            this.resolucion = resolucion_por_defecto;
            }
    //Un constructor con el precio y peso. El resto por defecto.
    public Television(double precioBase, double peso){
            super(precioBase, peso);
            this.sintonizadorTDT = sintonizadorTDT_por_defecto;
            this.resolucion = resolucion_por_defecto;
            }
    // Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Television(double precioBase,String color,char consumoEnergetico ,double peso, boolean sintonizadorTDT, short resolucion){
            super(precioBase, color,consumoEnergetico,peso);
            this.sintonizadorTDT = sintonizadorTDT;
            this.resolucion = resolucion;
            }
    // Método get de resolución y sintonizador TDT.
    public short getresolucion() { return resolucion; }
    public boolean getsintonizadorTDT() { return sintonizadorTDT; }

    @Override
    public double comprobarConsumoEnergetico() {
        switch (getConsumoEnergetico()) {
            case 'A': PrecioTotal += 100 ;break;
            case 'B':PrecioTotal += 80   ;break;
            case 'C':PrecioTotal += 60   ;break;
            case 'D':PrecioTotal += 50   ;break;
            case 'E':PrecioTotal += 30   ;break;
            case 'F':PrecioTotal += 10   ;break;
        }
        return PrecioTotal;
    }
    @Override
    public void comprobarColor() {
        String colorLowerCase = getColor().toLowerCase();
        switch (colorLowerCase) {
            case "negro": setColor("Negro");
            case "rojo": setColor("Rojo");
            case "azul": setColor("Azul");
            case "gris": setColor("Gris");
            default: setColor("Blanco");
        }
    }
    @Override
    public double precioFinal() {

        if (sintonizadorTDT == true){
            PrecioTotal += 50;
        }
        if (resolucion > 40) {
            PrecioTotal += (int) (PrecioTotal * (30.0f / 100.0f));
        }
        if (getPeso() > 80) {
            PrecioTotal += 100;
        } else if (getPeso() > 50) {
            PrecioTotal += 80;
        } else if (getPeso() > 20) {
            PrecioTotal += 50;
        } else {
            PrecioTotal += 10;
        }
        return PrecioTotal;
    }
}

/*
{

double precioFinal = precioBase;



                }
                return precioFinal;
                }

                ********Color
                {
        String colorLowerCase = color.toLowerCase();
        switch (colorLowerCase) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return colorLowerCase;
            default: return color_por_defecto;
        }
    }
                *********** Letra
                 {
            switch (letra) {
                case 'A' :
                case 'B' :
                case 'C' :
                case 'D' :
                case 'E' :
                case 'F' : return letra;
                default:
                    return letra = 'F';
            }
        }
 */


/*
    public class Television extends Electrodomestico{ //Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
    private int resolucion = 20; // Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
    private boolean sintonizadorTDT = false;

    public Television( ) { // Un constructor por defecto.
    }
    public Television(int precioBase, int peso) { // Un constructor con el precio y peso. El resto por defecto.
        super(precioBase, peso);
    }
    //Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Television(int precioBase, String color, String consumoEnergético, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergético, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    // Método get de resolución y sintonizador TDT.
    public boolean isSintonizadorTDT() { return sintonizadorTDT;}
    public int getResolucion() { return resolucion; }

    @Override
    public void comprobarConsumoEnergetico(String letra) {
        switch (letra) {
            case "A" : System.out.println(100); setConsumoEnergético("100"); break;
            case "B" : System.out.println(80); setConsumoEnergético("80"); break;
            case "C" : System.out.println(60); setConsumoEnergético("60"); break;
            case "D" : System.out.println(50); setConsumoEnergético("50"); break;
            case "E" : System.out.println(30); setConsumoEnergético("30"); break;
            case "F" : System.out.println(10); setConsumoEnergético("10"); break;
            default:
                System.out.println("El precio base del electronico es de " + 100); setConsumoEnergético("100"); break;
        }
    }
    @Override
    public void comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color) {
            case "negro" : System.out.println("El Color del electronico es Negro"); break;
            case "rojo" : System.out.println("El Color del electronico es Rojo"); break;
            case "azul" : System.out.println("El Color del electronico es Azul"); break;
            case "gris" : System.out.println("El Color del electronico es Gris"); break;
            case "blanco" : System.out.println("El Color del electronico es Blanco"); break;
            default:
                System.out.println("El Color del electronico es " + getColor()); break;
        }
    }
    @Override
    public void precioFinal() {
        // Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
        int consumo = Integer.parseInt(getConsumoEnergético()), peso = getpeso();
        if (getpeso() > 80) {
            setPeso(100);
        } else if (getpeso() > 50) {
            setPeso(80);
        } else if (getpeso() > 20) {
            setPeso(50);
        } else {
            setPeso(10);
        }
        int sintonizador;
        if (sintonizadorTDT = true){
            sintonizador = 50; //si tiene un sintonizador TDT incorporado, aumentara 50
        }else { sintonizador = 0;}

        double base = getPrecioBase();
        int porcentajeAgregado = 0;
        if (resolucion > 40) {
            porcentajeAgregado = (int)(getPrecioBase()*(30.0f/100.0f));//si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30%
        }
        System.out.println("Precio final del electronico $" + (base + peso + consumo + porcentajeAgregado + sintonizador));

        System.out.println("Precio base " + getPrecioBase());
        System.out.println("Precio agregado por Consumo "+ getConsumoEnergético());
        System.out.println("Precio agregado por Peso " + getpeso());
        System.out.println("Precio agregado por Sintonizador " + sintonizador);
        System.out.println("Precio agregado por Resolucion " + resolucion);


    }


}
 */