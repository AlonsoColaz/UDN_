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
        }
        System.out.println("El precio total de Televisiones es de " + formatoPeso.format(total_Televisores));
        System.out.println("El precio total de Lavadoras es de " + formatoPeso.format(total_Lavadoras));
        System.out.println("El precio total de electrodomesticos es de " + formatoPeso.format(total_Electrodomesticos));


        //• Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y

        // la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos).
    }
}

    //• Crea un array de Electrodomesticos de 10 posiciones.
        /*
    String[] Nombres = {"TV_LG","TV_Samsung","TV_Sony","TV_TVC","TV_Panasonic","Lavadora_LG","Lavadora_Samsung","Lavadora_Mabe","Lavadora_Wabe","Lavadora_Sabe"};

        Electrodomestico tv = new Television(100.0,"blanco", 'A', (double) 20.0,true, (short) 50);
        tv.precioFinal();
        Electrodomestico lavadora = new Lavadora(100,30,"blanco",'D',30);
        lavadora.precioFinal();
    Electrodomestico tv = new Television(100,"blanco","A",20,50,true);
    Electrodomestico tv1 = new Television(100,"negro","B",45,50,false);
    Electrodomestico tv2 = new Television(100,"rojo","C",65,50,true);
    Electrodomestico tv3 = new Television(100,"azul","D",75,50,false);
    Electrodomestico tv4 = new Television(100,"gris","E",85,50,true);
    Electrodomestico tv5 = new Television(100,"","F",35,50,false);
    Electrodomestico tv6 = new Television(100,"gris","",25,50,true);
    Electrodomestico tv7 = new Television(100,"rojo","D",15,50,false);
    Electrodomestico tv8 = new Television(100,"negro","C",30,50,true);
    Electrodomestico tv9 = new Television(100,"azul","B",35,50,false);

    tv.precioFinal();
    tv1.precioFinal();
    tv2.precioFinal();
    tv3.precioFinal();
    tv4.precioFinal();

    }

}

         */
