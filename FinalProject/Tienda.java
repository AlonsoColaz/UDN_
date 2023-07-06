package FinalProject;
// Ahora crea una clase ejecutable que realice lo siguiente:
public class Tienda {
    public static void main(String[] args) {
        //• Crea un array de Electrodomesticos de 10 posiciones.
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        Electrodomestico[] lavadoras = new Electrodomestico[10];
        Electrodomestico[] televisiones = new Electrodomestico[10];

        //• Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        electrodomesticos[0] = new Lavadora(500,50,"blanco",'A',30);
        electrodomesticos[1] = new Television(500.0,"azul", 'B', (double) 20.0,true, (short) 50);
        electrodomesticos[2] = new Electrodomestico(500, "rojo", 'C', 50);
        electrodomesticos[3] = new Lavadora(400,40,"gris",'D',30);
        electrodomesticos[4] = new Television(400.0,"negro", 'E', (double) 20.0,false, (short) 35);
        electrodomesticos[5] = new Electrodomestico(400, "azul", 'F', 50);
        electrodomesticos[6] = new Lavadora(300,30,"gris",'A',30);
        electrodomesticos[7] = new Television(300.0,"negro", 'B', (double) 20.0,true, (short) 60);
        electrodomesticos[8] = new Electrodomestico(300, "rojo", 'C', 50);
        electrodomesticos[9] = new Lavadora(600,45,"blanco",'D',30);

        //• Ahora, recorre este array y ejecuta el método precioFinal().

        double total = 0;
        for (Electrodomestico electrodomestico : electrodomesticos){
            System.out.println( electrodomestico);
            System.out.println( electrodomestico.precioFinal());
        }
        //• Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y

        // la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos).
    }
}
