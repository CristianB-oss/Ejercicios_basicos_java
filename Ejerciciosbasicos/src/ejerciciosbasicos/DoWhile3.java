
package ejerciciosbasicos;

import java.util.Scanner;


public class DoWhile3 {
 
     Scanner sc = new Scanner(System.in);
    
    double temperatura;
    
    
    public void ingresar(){
        System.out.println("ingrese la temperatura actual");
        temperatura = sc.nextDouble();
    }
    
    public void bluce(){
       do{ 
        System.out.println("alerta");
        ingresar();
        } while(temperatura <= 18 && temperatura >= 25);
        System.out.println("la temperatura es aceptable");
       
    }
    
    public void finalizar(){
        System.out.println("fin dowhile 3");
        
    }
}
