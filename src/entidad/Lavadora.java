
package entidad;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char letra, double peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("LAVADORA");
        
        super.crearElectrodumestico();
        
        System.out.println("Introduce la carga por favor");
        this.carga = leer.nextDouble();
    }

    public double precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if(this.carga>30){
            this.precio = this.precio + 500;
        }else if(this.carga<30 || this.carga == 30){
            this.precio= this.precio;
        }
        System.out.println("El precio final de la lavadora es: " + this.precio + "$");
       return lavadora.getPrecio(); 
    }
    
    

}
