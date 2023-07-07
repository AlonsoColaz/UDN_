package FinalProject_v3;
public abstract class Electrodomestico {
    //Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
    private double precioBase, peso;
    private String color;
    private char consumoEnergetico;
    //Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello
    private static final String color_por_defecto = "blanco";
    private static final char consumoEnergetico_por_defecto = 'F';
    private static final double precioBase_por_defecto = 100.0, peso_por_defecto = 5.0;
    // constructor por defecto
    public Electrodomestico() {
        this.precioBase = precioBase_por_defecto;
        this.color = color_por_defecto;
        this.consumoEnergetico = consumoEnergetico_por_defecto;
        this.peso = peso_por_defecto;
    }
    //constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color_por_defecto;
        this.consumoEnergetico = consumoEnergetico_por_defecto;
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

    public abstract void comprobarConsumoEnergetico();
    public abstract void comprobarColor();
    public abstract double precioFinal();

}

