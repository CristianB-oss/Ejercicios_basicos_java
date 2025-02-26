
package ejerciciosbasicos;

import java.util.Scanner;


public class DoWhile2 {
    
     Scanner sc = new Scanner(System.in);
    
    int menu, cantidad;
    int cuenta = 0;
    
    public void menu(){
        
        System.out.println("------menu------");
        System.out.println("1. hamburguesas = $8.000");
        System.out.println("2. perros = $4.000");
        System.out.println("3. finalizar pedido");
        menu = sc.nextInt();
        sc.nextLine();
    }
    
    public void bucle1(){
        do{
           
        switch(menu){
            case 1:
                System.out.println("cuantas hamburguesas desea llevar");
                cantidad = sc.nextInt();
                cuenta += cantidad*8000;
                menu();
                break;
            case 2:
                System.out.println("cuantos perros quiere llevar");
                cantidad = sc.nextInt();
                cuenta += cantidad*4000;
                menu();
                break;
            
            default:
                System.out.println("opcion no valida");
                break;
        }
        
        
        }while(menu != 3);
        
        System.out.println("su pedido va en camino");
                System.out.println("total a pagar: " + cuenta);
    }
    
    public void finalizar(){
        System.out.println("fin dowhile 2");
    
    }
}
