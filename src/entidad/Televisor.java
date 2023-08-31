
package entidad;

import java.util.Scanner;


public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char letra, double peso) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("TELEVISOR");
        
        super.crearElectrodumestico();
        
        System.out.println("Introduce la resolucion (pulgadas)");
        this.resolucion = leer.nextInt();
        
        System.out.println("Tiene sintonizador TDT? (true/false)");
        this.TDT = leer.nextBoolean();
    }
    
    public double precioFinal(Televisor televisor){
        super.precioFinal(televisor);
        if (this.resolucion > 40) {
            double pre = this.precio * 0.3;
            this.precio = this.precio + pre;
        }
        if (this.TDT) {
            this.precio = this.precio + 500;
        }

        System.out.println("El precio final del televisor es: " + this.precio + "$");

        return televisor.getPrecio();
    }

}
