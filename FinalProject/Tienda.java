package FinalProject;
// Ahora crea una clase ejecutable que realice lo siguiente:
public class Tienda {
    public static void main(String[] args) {
    //• Crea un array de Electrodomesticos de 10 posiciones.
    String[] Nombres = {"TV_LG","TV_Samsung","TV_Sony","TV_TVC","TV_Panasonic","Lavadora_LG","Lavadora_Samsung","Lavadora_Mabe","Lavadora_Wabe","Lavadora_Sabe"};

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

    }

}
