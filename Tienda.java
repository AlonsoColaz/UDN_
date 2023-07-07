package ProyectoFinal;

public class Tienda {

	public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Television(300, 50);
        electrodomesticos[1] = new Lavadora(200, 30);
        electrodomesticos[2] = new Lavadora(250, 0, "rojo", 'E', 40);
        electrodomesticos[3] = new Television(500, false, 0, "azul", 'A', 60);
        electrodomesticos[4] = new Lavadora(150, 0, "blanco", 'C', 35);
        electrodomesticos[5] = new Television(400, false, 0, "negro", 'B', 55);
        electrodomesticos[6] = new Electrodomestico(150, "gris", 'D', 25);
        electrodomesticos[7] = new Television(350, 45);
        electrodomesticos[8] = new Lavadora(180, 32);
        electrodomesticos[9] = new Lavadora(220, 0, "azul", 'F', 38);

        double totalElectrodomesticos = 0;
        double totalTelevisores = 0;
        double totalLavadoras = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) {
                totalTelevisores += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                totalLavadoras += electrodomestico.precioFinal();
            }
            totalElectrodomesticos += electrodomestico.precioFinal();
        }

        System.out.println("Precio total de los electrodomésticos: " + totalElectrodomesticos + " euros");
        System.out.println("Precio total de las lavadoras: " + totalLavadoras + " euros");
        System.out.println("Precio total de los televisores: " + totalTelevisores + " euros");
   }
}