package ProyectoFinal;
public class Television extends Electrodomestico {
    //Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
    private short resolucion;
    private boolean sintonizadorTDT;

    //Por defecto, la resolucion sera de 20 pulgadas y el sintonizador sera false.
    private static final boolean sintonizadorTDT_por_defecto = false;
    private static final short resolucion_por_defecto = 20;

    // Un constructor por defecto
    public Television() {
            this.sintonizadorTDT = sintonizadorTDT_por_defecto;
            this.resolucion = resolucion_por_defecto;
            }
    //Un constructor con el precio y peso. El resto por defecto.
    public Television(double precioBase, double peso){
            super(precioBase, peso);
            this.sintonizadorTDT = sintonizadorTDT_por_defecto;
            this.resolucion = resolucion_por_defecto;
            }
    // Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Television(double precioBase,String color,char consumoEnergetico ,double peso, boolean sintonizadorTDT, short resolucion){
            super(precioBase, color,consumoEnergetico,peso);
            this.sintonizadorTDT = sintonizadorTDT;
            this.resolucion = resolucion;
            }
    // Método get de resolución y sintonizador TDT.
    public short getresolucion() { return resolucion; }
    public boolean getsintonizadorTDT() { return sintonizadorTDT; }
    @Override
    public double precioFinal() {
        double precio_final = super.precioFinal();
        if (resolucion > 40) {
            precio_final += (int) (precio_final * (30.0f / 100.0f));
        }
        if (sintonizadorTDT == true){
            precio_final += 50;
        }
        return precio_final;
    }
}
