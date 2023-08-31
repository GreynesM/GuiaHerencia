package ejercicio002electrodomestico;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;



public class Ejercicio002Electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
//        Lavadora lavadora = new Lavadora();
//        Televisor tele = new Televisor();
//        lavadora.crearLavadora();
//        tele.crearTelevisor();
//        lavadora.precioFinal(lavadora);
//        tele.precioFinal(tele);
       
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        Lavadora lavadora1 = new Lavadora(35, 1500.00, "Gris", 'B', 25);
        Lavadora lavadora2 = new Lavadora(30, 1200.00, "Negra", 'A', 20);
        Televisor tele1 = new Televisor(42, true, 800.00, "Negro", 'C', 2);
        Televisor tele2 = new Televisor(32, false, 500.00, "Negro", 'D', 1);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);

        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electrodomestico;
                double precioLavadora = lavadora.precioFinal(lavadora);
                precioTotalLavadoras += precioLavadora;
            } else if (electrodomestico instanceof Televisor) {
                Televisor televisor = (Televisor) electrodomestico;
                double precioTelevisor = televisor.precioFinal(televisor);
                precioTotalTelevisores += precioTelevisor;
            }

        }

        System.out.println("El precio total de las lavadoras es " + precioTotalLavadoras + "$");
        System.out.println("El precio total de los televisores es " + precioTotalTelevisores + "$");
        System.out.println("");
        System.out.println("El precio total de todos los electrodomesticos es : " + (precioTotalLavadoras + precioTotalTelevisores) + "$");

    }

}
