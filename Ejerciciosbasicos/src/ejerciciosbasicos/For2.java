package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Scanner;


public class For2 {
     Scanner sc = new Scanner(System.in);
    ArrayList<String> carritoCompras = new ArrayList<>();
    
    int total, cantidadgeneral;
    int cuenta = 0;
    
    public void Compra(){
        System.out.println("cuantos productos diferentes desea comprar");
        cantidadgeneral = sc.nextInt();
        
        sc.nextLine();
        
        for(int i=0; i < cantidadgeneral; i++){
        
        
        System.out.println("que desea comprar en la compra " + (i+1));
        String producto = sc.nextLine();
        carritoCompras.add(producto);
        System.out.println("cuanta unidades del producto " + (i+1));
        int cantidad = sc.nextInt();
        System.out.println("precio por unidad  " +(i+1));
        int precio = sc.nextInt();
        
        total = cantidad * precio;
        cuenta += total;
        
        sc.nextLine();
        
        
        
        }
        
        
    }
    
    public void mostrar(){
        
        for(int i = 0; i  <  cantidadgeneral; i++){
            System.out.println("los productos fueron :" + carritoCompras.get(i));
        }
        
        System.out.println("total a pagar: " + cuenta);
    }
    
    public void finalizar(){
        System.out.println("fin de for 2 ");
      
    }
}
