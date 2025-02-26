package ejerciciosbasicos;

import java.util.Scanner;


public class BucleWhile3 {
 
     Scanner sc = new Scanner(System.in);
    
    int paginas;
    int capacidad = 30;
    
    public void agregarInfo(){
      System.out.println("cuantas paginas desea imprimir");
      paginas = sc.nextInt();
      capacidad -= paginas;
        
        
    }
    
    public void verificar(){
        while(paginas > 30){
       System.out.println("no se pueden imprimir más de 30 paginas");
        System.out.println("por favor modifique la cantidad");
         capacidad += paginas;
            
         agregarInfo();
        }
        
        
        while(capacidad > 0){
         System.out.println("imprimiento " + paginas + " paginas");
       agregarInfo();
        }
        
        
        
    }
    
    public void finalizar(){
        while(capacidad < 1){
            break;
        }
        System.out.println("no tiene papel la impresora, porfavor insertar");
        System.out.println("fin del bucle while 3");
     
            
            
    }

}
