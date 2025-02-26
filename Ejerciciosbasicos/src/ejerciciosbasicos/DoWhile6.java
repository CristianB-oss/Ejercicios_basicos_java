
package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Scanner;


public class DoWhile6 {
  
  Scanner sc = new Scanner(System.in);
    
    ArrayList<String> productos = new ArrayList<>();
    
    int precio, decision;
    int cuenta = 0;
    String producto;
    
    public void info(){
        System.out.println("producto vendido");
        producto = sc.nextLine();
        productos.add(producto);
    
        System.out.println("precio total de la venta del producto");
        precio = sc.nextInt();
        cuenta += precio;
        
    }
    
    public void bluce(){
        do{
            System.out.println("desea continuar?");
            System.out.println("1. si");
            System.out.println("2. no");
            decision = sc.nextInt();
            
            sc.nextLine();
            
            if(decision == 1){
                info();
            }
        } while(decision == 1);
        
        
        System.out.println("total de ventas: " + cuenta);
        System.out.println("estos fueron los productos vendidos");
        System.out.println(productos);
    }
    
     public void finalizar(){
        System.out.println("fin do while 6");
        
}
}