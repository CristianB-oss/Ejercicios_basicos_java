package ejerciciosbasicos;

import java.util.Scanner;


public class SwitchCase4 {
    
    Scanner sc = new Scanner(System.in);
    
    String estadoPartido;
    int ganado = 7;
    int empatado = 4;
    int perdido = 2;
   
    
    public void ingresar(){
        System.out.println("ingrese el resultado del partido");
        System.out.println("ganado, perdido o empatado");
        estadoPartido = sc.nextLine().toUpperCase();
    }
    
    public void resultados(){
        switch (estadoPartido) {
            case "GANADO":
            System.out.println("se ha ganado " + ganado + " puntos");
        System.out.println("vas en primer lugar");
                
                break;
          case "PERDIDO":
                System.out.println("se ha ganado " + perdido + " puntos");
                System.out.println("vas en segundo lugar");
        case "EMPATADO":
                System.out.println("se ha gando " + empatado + " puntos");
                System.out.println("vas de ultimo lugar");
        default:
                System.out.println("Opcion no valida");
        }
    }
    
     public void finalizar(){
        System.out.println("fin del swich case 4");
       
    }
}
