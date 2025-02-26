package ejerciciosbasicos;

import java.util.Scanner;

public class BucleWhile5 {
 Scanner sc = new Scanner(System.in);
 int tiempo;
    
    public void empezar(){
        System.out.println("ingrese el numero ");
        tiempo = sc.nextInt();
        
    }
    
    public void cuentaAtras(){
        while(tiempo > 0 ){
            System.out.println(tiempo);
            tiempo--;
        }
        
        System.out.println(" finalizado");
    }
    
    public void finalizar(){
        System.out.println("fin de bucle while 5");
      
    }
}
