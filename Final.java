package ProyectoFinal;

// Ahora crea una clase ejecutable que realice lo siguiente:
public class Tienda {
    public static void main(String[] args) {
        //• Crea un array de Electrodomesticos de 10 posiciones.
        //• Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        //• Ahora, recorre este array y ejecuta el método precioFinal().
        //• Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y 
        // la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos). 
        // Recuerda el uso operador instanceof.
        
        Electrodomestico tv = new Television(100.0,"blanco", 'A', (double) 20.0,true, (short) 50);
        tv.precioFinal();
        Electrodomestico lavadora = new Lavadora(100,30,"blanco",'D',30);
        lavadora.precioFinal();
    }
}
