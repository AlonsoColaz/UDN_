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
}
