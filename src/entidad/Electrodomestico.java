
package entidad;

import java.util.Scanner;


public abstract class Electrodomestico {
    protected double precio;
    protected String color;
    protected char letra = 'A';
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char letra, double peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumoEnergetico(char letra){
        if(letra=='A' || letra=='B' || letra=='C' || letra=='D' || letra=='E'){
            System.out.println("Correcta");
            
        }else{
            letra = 'F';
            System.out.println(letra);
        }
    }
    
    private void comprobarColor(String color){
        if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")){
            System.out.println("Correcto");
        }else{
           color = "Blanco";
            System.out.println( color);
        }
    }
    
    
   public void crearElectrodumestico(){
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     System.out.println("Ingrese el color");
     this.color = leer.next();
       comprobarColor(color);
       
       System.out.println("Ingrese el consumo energetico (letra A-F)");
       this.letra = leer.next().charAt(0);
       comprobarConsumoEnergetico(letra);
       
       System.out.println("Introduce el peso");
       this.peso = leer.nextDouble();
       
      
       
    }
   
   public double precioFinal(Electrodomestico electrodomestico){
       
       if (this.letra == 'A') {
           this.precio = this.precio + 1000;
           
       }

       if (this.letra == 'B') {
           this.precio = this.precio + 800;
           
       }
       if(this.letra == 'C'){
           this.precio = this.precio + 600;
           
       }
       if(this.letra == 'D'){
           this.precio = this.precio + 500;
           
       }
       if(this.letra == 'E'){
           this.precio = this.precio + 300;
           
       }
       if(this.letra == 'F'){
           this.precio = this.precio + 100;
          
       }

       if(this.peso>=1 && this.peso<=19){
           this.precio = this.precio + 100;
           
       }
       if(this.peso>=20 && this.peso<=49){
           this.precio = this.precio + 500;
           
       }
       if(this.peso>=50 && this.peso<=79){
           this.precio = this.precio + 800;
           
       }
       if(this.peso>80){
           this.precio = this.precio + 1000;
          
       }
       
       return electrodomestico.getPrecio();
       
       }
       
}
