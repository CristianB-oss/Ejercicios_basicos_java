package ejerciciosbasicos;
import java.util.Random;
import java.util.Scanner;



public class BucleWhile6 {
     Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    
    int aleatorio, numero;
    
    public void numeroAleatorio(){
        aleatorio = rd.nextInt(101);
    }
    
    public void adivinanza(){
        
        System.out.println("vamos a jugar a adivinar un numero");
        System.out.println("cual crees que es el numero correcto?");
        numero = sc.nextInt();
        
    }
    
    public void bluce(){
        //pista si el numero es menor
        while(numero < aleatorio){
            System.out.println("incorrecto, el numero es mayor que el que ingresaste");
            System.out.println("intentalo de nuevo");
            adivinanza();
        }
        
        //pista si el numero es mayor
        while(numero > aleatorio){
            System.out.println("incorrecto, el numero es menor que el que ingresaste");
            System.out.println("intentalo de nuevo");
            adivinanza();
        }
        
        while(numero == aleatorio){
            System.out.println(" numero correcto");
            System.out.println(" haz ganado");
            break;
        }
    }
    
     public void finalizar(){
        System.out.println("fin de bucle while 6");
      
    }
}
