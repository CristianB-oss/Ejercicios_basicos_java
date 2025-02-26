package ejerciciosbasicos;

import java.util.Scanner;


public class BucleWhile4 {
  
 Scanner sc = new Scanner(System.in);
    
    double distancia;
    int velocidad, decicion;
    
    public void infoViaje(){
        System.out.println("ingrese la distancia total del viaje");
        distancia = sc.nextDouble();
        System.out.println("a que velocidad va el coche");
        velocidad = sc.nextInt();
    }
    
    public void calculo(){
    double tiempo = distancia/velocidad;
        System.out.println("el viaje durará " + tiempo + " horas");
    }
    
    public void repetir(){
        System.out.println("desea hacer otro viaje?");
        System.out.println("1. si");
        System.out.println("2. no");
        decicion = sc.nextInt();
        
        while(decicion == 1){
            infoViaje();
            calculo();
            
            System.out.println("desea hacer otro viaje?");
            System.out.println("1. si");
            System.out.println("2. no");
            decicion = sc.nextInt();
        }
        
        System.out.println("viaje exitoso");
    }
    
    public void finalizar(){
        System.out.println("fin del bucle while 4");
       
    }
    
    
}
