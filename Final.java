package ProyectoFinal;

public class Tienda {
    public static void main(String[] args) {
        Electrodomestico tv = new Television(100.0,"blanco", 'A', (double) 20.0,true, (short) 50);
        tv.precioFinal();
    }
}
