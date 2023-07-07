package FinalProject_v3;
public class Lavadora extends Electrodomestico {
    private double carga; //Su atributo es carga, ademas de los atributos heredados
    private final int carga_por_defecto = 5; // Por defecto, la carga es de 5 kg. Usa una constante para ello.
    double PrecioTotal = getPrecioBase();

    //Un constructor con el precio y peso. El resto por defecto.
    public Lavadora( double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga_por_defecto;
    }
    //Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Lavadora(double precioBase,double peso,String color, char consumoEnergetico, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    //Método get de carga.
    public double getCarga() { return carga;}

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

    //si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y
    // añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
    @Override
    public double precioFinal() {
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
public class Lavadora extends Electrodomestico { //Su atributo es carga, ademas de los atributos heredados
    private int carga = 5;  // Por defecto, la carga es de 5 kg. Usa una constante para ello.
    public Lavadora() {  //Un constructor por defecto.
    }
    public Lavadora( double precioBase, int peso) { //Un constructor con el precio y peso. El resto por defecto.
        super(precioBase, peso);
    }
    //Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Lavadora( double precioBase, String color, String consumoEnergético, int peso, int carga) {
        super(precioBase, color, consumoEnergético, peso);
        this.carga = carga;
    }
    public int getCarga() {return carga;}  //Método get de carga.

    @Override
    public void precioFinal() {    }
    //si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y
    // añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
    @Override
    public void comprobarConsumoEnergetico(String letra) {    }
    @Override
    public void comprobarColor(String color) {    }



}
        */
