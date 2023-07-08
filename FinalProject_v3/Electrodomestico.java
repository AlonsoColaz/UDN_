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

    public abstract double comprobarConsumoEnergetico();
    public abstract void comprobarColor();
    public abstract double precioFinal();

}


/*
package FinalProject;

public abstract class Electrodomestico {
    //Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
    private double precioBase = 100;
    private String color = "Blanco", consumoEnergético = "F";
    private int peso = 5;
    public Electrodomestico() { // constructor por defecto
    }
    public Electrodomestico( double precioBase, int peso) { //constructor con el precio y peso. El resto por defecto.
         this.precioBase = precioBase;
         this.peso = peso;
    }
    public Electrodomestico( double precioBase, String color, String consumoEnergético, int peso) { // constructor con todos los atributos
         this.precioBase = precioBase;
         this.color = color;
         this.consumoEnergético = consumoEnergético;
         this.peso = peso;
    }
    // //Indica que se podrán heredar.  // Métodos get de todos los atributos.
    public double getPrecioBase() { return precioBase;    }
    public String getColor() { return color;    }
    public String getConsumoEnergético() { return consumoEnergético;    }
    public int getpeso() { return peso;    }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase;    }
    public void setColor(String color) { this.color = color;    }
    public void setConsumoEnergético(String consumoEnergético) { this.consumoEnergético = consumoEnergético;    }
    public void setPeso(int peso) { this.peso = peso;    }

    public abstract void comprobarConsumoEnergetico(String letra); //comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
    public abstract void comprobarColor(String color); //comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera visible.
    public abstract void precioFinal(); //según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
    /*  A 100 € |    B 80 € |    C 60 €  |    D 50 €  |    E 30 €  |    F 10 €    */
/*  Entre 0 y 19 kg : 10 € | Entre 20 y 49 kg : 50 € | Entre 50 y 79 kg : 80 € | Mayor que 80 kg : 100 €  */
