package ejerciciosbasicos;

import java.util.Scanner;


public class BucleWhile1 {
    
    Scanner sc = new Scanner(System.in);
    
    int montoRetiro;
    int saldo = 80000;
   
    
    public void retirar(){
        System.out.println("Cuando dinero desea retirar");
        montoRetiro = sc.nextInt();
    }
    
    public void operacion(){
        while(montoRetiro > saldo){
            System.out.println("No tienes saldo suficiente");
            retirar();
        }
        
       saldo -= montoRetiro;
        System.out.println("retiraste " + montoRetiro + " saldo disponible: " + saldo);
        
        
    }
    
    public void finalizar(){
        System.out.println("fin del bucle while 1");
       
    }
    
}
