
package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Scanner;


public class DoWhile5 {
  
   Scanner sc = new Scanner(System.in);
    
    ArrayList<String>tareas = new ArrayList<>();
    ArrayList<String>descripciones = new ArrayList<>();
    ArrayList<String>fechas = new ArrayList<>();
    
    
    String tarea, descripcion, fecha;
    int decision;
    
    public void ingresar(){
        System.out.println("tarea");
        tarea = sc.nextLine();
        tareas.add(tarea);
        System.out.println("descripcion");
        descripcion = sc.nextLine();
        descripciones.add(descripcion);
        System.out.println("fecha de vencimiento");
        fecha = sc.nextLine();
        fechas.add(fecha);
    }
    
    public void bluce(){
        do{
            System.out.println("desea agregar otra tarea?");
            System.out.println("1. si");
            System.out.println("2. no");
            decision = sc.nextInt();
            sc.nextLine();
            
            if(decision == 1){
                ingresar();
            }
            
        } while(decision == 1);
        
        System.out.println("tareas: " + tareas);
        System.out.println("descripsiones: " + descripciones);
        System.out.println("fechas: " + fechas);
    }
    
    public void finalizar(){
        System.out.println("fin del do while 5");
        
}
}