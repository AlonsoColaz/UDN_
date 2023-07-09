package FinalProject_v3;
public class Television extends Electrodomestico {
    //Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
    //Por defecto, la resolucion sera de 20 pulgadas y el sintonizador sera false.
    private short resolucion = 20;
    private boolean sintonizadorTDT = false;
    double PrecioTotal = getPrecioBase();
    // Un constructor por defecto
    public Television() {
            }
    //Un constructor con el precio y peso. El resto por defecto.
    public Television(double precioBase, double peso){
            super(precioBase, peso);
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
    public double comprobarConsumoEnergetico() {
        switch (getConsumoEnergetico()) {
            case 'A': PrecioTotal += 100 ;break;
            case 'B':PrecioTotal += 80   ;break;
            case 'C':PrecioTotal += 60   ;break;
            case 'D':PrecioTotal += 50   ;break;
            case 'E':PrecioTotal += 30   ;break;
            case 'F':PrecioTotal += 10   ;break;
        }
        return PrecioTotal;
    }
    @Override
    public void comprobarColor() {
        String colorLowerCase = getColor().toLowerCase();
        switch (colorLowerCase) {
            case "negro": setColor("Negro");
            case "rojo": setColor("Rojo");
            case "azul": setColor("Azul");
            case "gris": setColor("Gris");
            default: setColor("Blanco");
        }
    }
    @Override
    public double precioFinal() {

        if (sintonizadorTDT == true){
            PrecioTotal += 50;
        }
        if (resolucion > 40) {
            PrecioTotal += (int) (PrecioTotal * (30.0f / 100.0f));
        }
        if (getPeso() > 80) {
            PrecioTotal += 100;
        } else if (getPeso() > 50) {
            PrecioTotal += 80;
        } else if (getPeso() > 20) {
            PrecioTotal += 50;
        } else {
            PrecioTotal += 10;
        }
        return PrecioTotal;
    }

}