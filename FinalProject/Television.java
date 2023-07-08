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

        //• Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        electrodomesticos[0] = new Lavadora(500,50,"blanco",'A',30);
        electrodomesticos[1] = new Television(500.0,"azul", 'B', (double) 20.0,true, (short) 50);
        electrodomesticos[2] = new Television(500.0,"azul", 'B', (double) 20.0,true, (short) 50);
        electrodomesticos[3] = new Lavadora(400,40,"gris",'D',30);
        electrodomesticos[4] = new Television(400.0,"negro", 'E', (double) 20.0,false, (short) 35);
        electrodomesticos[5] = new Lavadora(400,40,"gris",'D',30);
        electrodomesticos[6] = new Lavadora(300,30,"gris",'A',30);
        electrodomesticos[7] = new Television(600.0, "azul",'C', (double) 65);
        electrodomesticos[8] = new Lavadora(400,40,"gris",'D',30);
        electrodomesticos[9] = new Lavadora(300,45,30);

        //• Ahora, recorre este array y ejecuta el método precioFinal().
        double total_Electrodomesticos = 0;
        double total_Televisores = 0;
        double total_Lavadoras = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) {
                total_Televisores += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                total_Lavadoras += electrodomestico.precioFinal();
            }
            total_Electrodomesticos += electrodomestico.precioFinal();
        }
        System.out.println("El precio total de Televisiones es de " + formatoPeso.format(total_Televisores));
        System.out.println("El precio total de Lavadoras es de " + formatoPeso.format(total_Lavadoras));
        System.out.println("El precio total de electrodomesticos es de " + formatoPeso.format(total_Electrodomesticos));


        //• Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y

        // la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos).
    }
}
