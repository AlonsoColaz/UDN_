package ProyectoFinal;

public class Electrodomestico {
    private final double PRECIO_BASE = 100;
    private final String COLOR_DEFECTO = "blanco";
    private final char CONSUMO_ENERGETICO_DEFECTO = 'F';
    private final double PESO_DEFECTO = 5;

    protected double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        char[] letrasValidas = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char letraValida : letrasValidas) {
            if (Character.toUpperCase(letra) == letraValida) {
                return Character.toUpperCase(letra);
            }
        }
        return CONSUMO_ENERGETICO_DEFECTO;
    }

    private String comprobarColor(String color) {
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String colorValido : coloresValidos) {
            if (color.toLowerCase().equals(colorValido)) {
                return color.toLowerCase();
            }
        }
        return COLOR_DEFECTO;
    }
    public double precioFinal() {
        double precioFinal = precioBase;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        if (peso >= 0 && peso <= 19) {
            precioFinal += 10;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 50;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 80;
        } else if (peso > 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }
}
