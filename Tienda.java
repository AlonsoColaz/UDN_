package FinalProject_v3;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

// Ahora crea una clase ejecutable que realice lo siguiente:
public class Tienda {
    public static void main(String[] args) {
        // Creando formato de pesos
        Locale mex = new Locale("en", "US");
        Currency pesos = Currency.getInstance(mex);
        NumberFormat formatoPeso = NumberFormat.getCurrencyInstance(mex);

        //• Crea un array de Electrodomesticos de 10 posiciones.
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Television(500.0,"azul", 'B', (double) 20.0,true, (short) 50);
        electrodomesticos[1] = new Lavadora(600,30,"Azul", 'F', 15);
        electrodomesticos[2] = new Television(500.0,"azul", 'E', (double) 20.0,true, (short) 50);
        electrodomesticos[3] = new Lavadora(600,40,"Gris", 'D', 15);
        electrodomesticos[4] = new Television(400.0,"negro", 'F', (double) 20.0,false, (short) 35);
        electrodomesticos[5] = new Lavadora(600,50,"Azul", 'A', 15);
        electrodomesticos[6] = new Television(500.0,"azul", 'C', (double) 20.0,false, (short) 50);
        electrodomesticos[7] = new Lavadora(600,30,"Blanco", 'C', 15);
        electrodomesticos[8] = new Television(500.0,"azul", 'A', (double) 20.0,true, (short) 50);
        electrodomesticos[9] = new Lavadora(600,40,"Rojo", 'D', 15);

        //• Ahora, recorre este array y ejecuta el método precioFinal().
        double total_Electrodomesticos = 0;
        double total_Televisores = 0;
        double total_Lavadoras = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) {
                total_Televisores += electrodomestico.precioFinal();
                total_Televisores += electrodomestico.comprobarConsumoEnergetico();
            } else if (electrodomestico instanceof Lavadora) {
                total_Lavadoras += electrodomestico.precioFinal();
                total_Lavadoras += electrodomestico.comprobarConsumoEnergetico();
            }
            total_Electrodomesticos += electrodomestico.precioFinal();
            total_Electrodomesticos += electrodomestico.comprobarConsumoEnergetico();
        }
        System.out.println("El precio total de Televisiones es de " + formatoPeso.format(total_Televisores));
        System.out.println("El precio total de Lavadoras es de " + formatoPeso.format(total_Lavadoras));
        System.out.println("El precio total de electrodomesticos es de " + formatoPeso.format(total_Electrodomesticos));


        //• Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y
        // la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos).
    }
}