package ejerciciosbasicos;

import java.util.Scanner;


public class Condicional1 {
    
Scanner sc = new Scanner (System.in);
    
 int piso;
 int limitepiso = 8;
    
    
    public void accederAsensor(){
        
        System.out.println("Ingrese el piso ");
        piso = sc.nextInt();
    }
    
    public void verificarPiso(){
        
        if(piso <= limitepiso){
            System.out.println("nos dirigimos para el piso "+piso);
        } else {
            System.out.println(" piso incorrecto");
        }
    }
    
    public void Agradecimeinto(){
        System.out.println("Gracias por venir");
       
    }
    
}
