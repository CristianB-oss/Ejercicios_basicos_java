
package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Scanner;


public class For3 {
    
   Scanner sc = new Scanner(System.in);
    
    ArrayList<String>nombreContacto = new ArrayList<>();
    ArrayList<Long>numeroContacto = new ArrayList<>();
    
    int cantContactos;
    
    public void almacenar(){
     System.out.println("cuantos contactos desea guardar");
     cantContactos = sc.nextInt();
     sc.nextLine();
        
        for(int i = 0; i < cantContactos; i++){
            
     System.out.println("nombre del contacto " + (i+1));
    String nombre = sc.nextLine();
     nombreContacto.add(nombre);
     System.out.println("numero del contacto " + (i+1));
     long numcel = sc.nextLong();
 numeroContacto.add(numcel);
           sc.nextLine();
            
        }
    }
    
    public void mostrarCon(){
        
        System.out.println("contactos");
        
        for(int i = 0; i < cantContactos; i++){
            System.out.println("contacto " + (i+1) + " " + nombreContacto.get(i) + " " + numeroContacto.get(i));
        }
    }
    
    public void finalizar(){
        System.out.println("fin de for 3");
        
    }
}
