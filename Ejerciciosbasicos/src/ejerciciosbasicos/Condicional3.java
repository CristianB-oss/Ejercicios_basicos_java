package ejerciciosbasicos;
import java.util.Scanner;


public class Condicional3 {
      Scanner sc = new Scanner(System.in);
    
    double temperaturaActual;
    double minTemperatura = 15.0;
    double maxTemperatura = 30.0;
    
    public void IngresarTemperatura(){
        System.out.println("cual es la temperatura actual?");
        temperaturaActual = sc.nextDouble();
    }
    
    public void verificarTemperatura(){
        
      if(temperaturaActual >= minTemperatura && temperaturaActual <= maxTemperatura){
            System.out.println("la temperatura es adecuada");
    } else {
      System.out.println("la temperatura esta fuera del rango deseado");
      }
    }
    public void finalizar(){
        System.out.println("gracias hasta luego ");
        
}
}