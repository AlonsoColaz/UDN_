package ProyectoFinal;

public class Television extends Electrodomestico {
    private final double RESOLUCION_DEFECTO = 20;
    private final boolean SINTONIZADOR_TDT_DEFECTO = false;

    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    public Television(double resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal += precioBase * 0.3;
        }

        if (sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}