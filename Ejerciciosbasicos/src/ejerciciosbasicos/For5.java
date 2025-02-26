
package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Scanner;


public class For5 {
     Scanner sc = new Scanner(System.in);
    
    ArrayList<String> productos = new ArrayList<>();
    
    int ventascan;
    int cuenta = 0;
    
    public void ventas(){
        
        System.out.println("cuantas ventas se realizaron");
        ventascan = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<ventascan; i++){
            
            System.out.println("nombre del producto " + (i+1));
            String nomproducto = sc.nextLine();
            productos.add(nomproducto);
            
            System.out.println("precio");
            int precio = sc.nextInt();
            
            System.out.println("cantidades vendidas");
            int cantidad = sc.nextInt();
            
            int total = precio*cantidad;
            cuenta += total;
            
            sc.nextLine();
        }
    }
    
    public void mostrar(){
        System.out.println("total de ventas");
        System.out.println(cuenta);
        
        System.out.println("productos vendidos");
        
        for(int i=0; i<ventascan; i++){
            System.out.println(productos.get(i));
        }
    }
    
    public void finalizar(){
        System.out.println("fin for 4");
       
    }
}
