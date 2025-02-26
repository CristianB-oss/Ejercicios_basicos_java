
package ejerciciosbasicos;

import java.util.Scanner;


public class For4 {
      Scanner sc = new Scanner(System.in);
    
    int cantidad;
    int total = 0;
    
    public void ingresarnum(){
        
        System.out.println("cuantos numero ingresara");
        cantidad = sc.nextInt();
        
        for(int i=0; i<cantidad; i++){
            
            System.out.println("ingrese el numero " + (i+1));
            int numero = sc.nextInt();
            
            if(numero > 0){
            total += numero;
            } else {
                System.out.println("solo se permiten numeros positivos");
                break;
            }
        }
    }
    
    public void mostrar(){
        System.out.println("la sumatoria de los numeros es ");
        System.out.println(total);
    }
    
    public void finalizar(){
        System.out.println("fin de for 4");
        
    
}
}