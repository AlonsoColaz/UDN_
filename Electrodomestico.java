package ProyectoFinal;

public class Electrodomestico {

	// VARIABLES //
	private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    // CONSTANTES //
    private static final String COLOR_DEFECTO = "blanco";
    private static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
    private static final double PRECIO_BASE_DEFECTO = 100.0;
    private static final double PESO_DEFECTO = 5.0;

    // CONSTRUCTORES //
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // METODOS GETTERS //
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

    // METODOS PRIVADOS PARA COMPROBAR EL CONSUMO Y EL COLOR //
    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMO_ENERGETICO_DEFECTO;
        }
    }

    private String comprobarColor(String color) {
        String colorLowerCase = color.toLowerCase();
        switch (colorLowerCase) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return colorLowerCase;
            default:
                return COLOR_DEFECTO;
        }
    }

    // METODO DEL PRECIO FINAL //
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

        if (peso >= 0 && peso < 20) {
            precioFinal += 10;
        } else if (peso >= 20 && peso < 50) {
            precioFinal += 50;
        } else if (peso >= 50 && peso < 80) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }
    
}
