package FinalProject;
public class Lavadora extends Electrodomestico {
    private int carga; //Su atributo es carga, ademas de los atributos heredados
    private final int carga_por_defecto = 5; // Por defecto, la carga es de 5 kg. Usa una constante para ello.

    //Un constructor con el precio y peso. El resto por defecto.
    public Lavadora( double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga_por_defecto;
    }
    //Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    //Método get de carga.
    public int getCarga() { return carga;}

    //si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y
    // añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
    public double precioFinal(){
        double precio_final = super.precioFinal();
        if (carga > 30){
            precio_final += 50;
        }
        return precio_final;
    }

}
