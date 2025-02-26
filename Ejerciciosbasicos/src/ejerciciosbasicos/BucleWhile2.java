package ejerciciosbasicos;

import java.util.Scanner;


public class BucleWhile2 {
      Scanner sc = new Scanner(System.in);
    
    String producto;
    int precio, cantidad,repetir;
    int cuenta = 0;
    
    public void ingresarDatos(){
        System.out.println("ingrese el nombre del producto");
        sc.nextLine();
        producto = sc.nextLine();
        System.out.println("ingrese el precio del producto");
        precio = sc.nextInt();
        System.out.println("cuantas unidades desea llevar");
        cantidad = sc.nextInt();
        
        int total = precio * cantidad;
        cuenta += total;
        System.out.println("el total es: " + total);
    }
    
    public void calculo(){
        System.out.println("el total a pagar es: " + cuenta);
    }
    
    public void bucle(){
        System.out.println("desea agregar otro producto");
        System.out.println("1. si");
        System.out.println("2. no");
        repetir = sc.nextInt();
        
        while (repetir == 1) {  
            ingresarDatos();

            System.out.println("Desea agregar otro producto? (1. Si / 2. No)");
            repetir = sc.nextInt();
        }
        
        System.out.println("Gracias por comprar en nuestra tienda");
        calculo();
        
    }
    
    public void finalizar(){
        System.out.println("fin del bucle while 2");
       
    }
}
