package ejerciciosbasicos;

import java.util.Scanner;


public class Condicional4 {
    
      Scanner sc = new Scanner(System.in);
    
    double temperaturaAmbiente;
    double umbralAlerta = 30.0;
    
    public void ingresarTemperatura(){
        System.out.println("cual es la temperatura actual?");
        temperaturaAmbiente = sc.nextDouble();
    }
    
    public void verificarTemperatura(){
        
        if(temperaturaAmbiente >= umbralAlerta){
            System.out.println("peligro");
            System.out.println(" emergencia por favor busca refugio");
            
        } else {
            System.out.println("la temperatura es normal");
            System.out.println("Gracias por usar nuestros servicios");
           
        }
    }
    
    public void Finalizar(){
        
        
       
        System.out.println("   condicional 4  finalizado  ");
     
        
    }
}
