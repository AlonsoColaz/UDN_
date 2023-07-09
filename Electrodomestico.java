package FinalProject_v3;
public abstract class Electrodomestico {
    //Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
    //Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello
    private double precioBase = 100.0, peso = 5.0;
    private String color = "blanco";
    private char consumoEnergetico = 'F';

    // constructor por defecto
    public Electrodomestico() {
    }
    //constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    // constructor con todos los atributos
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    // //Indica que se podrán heredar.  // Métodos get de todos los atributos.
    public double getPrecioBase() { return precioBase; }
    public String getColor() { return color; }
    public char getConsumoEnergetico() { return consumoEnergetico; }
    public double getPeso() { return peso; }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double comprobarConsumoEnergetico();
    public abstract void comprobarColor();
    public abstract double precioFinal();

}