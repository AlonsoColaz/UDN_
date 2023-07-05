package FinalProject;

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
