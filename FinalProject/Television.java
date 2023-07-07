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
    public void comprobarConsumoEnergetico() {
        switch (getConsumoEnergetico()) {
            case 'A': PrecioTotal += 100 ;break;
            case 'B':PrecioTotal += 80   ;break;
            case 'C':PrecioTotal += 60   ;break;
            case 'D':PrecioTotal += 50   ;break;
            case 'E':PrecioTotal += 30   ;break;
            case 'F':PrecioTotal += 10   ;break;
        }
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

