package ejerciciosbasicos;

import java.util.Scanner;


public class Condicional2 {
  
       Scanner sc = new Scanner(System.in);
    
    double limitePeso = 60;
    double pesoUsuario;
    int piso;
    
    public void ingresarPeso(){
        System.out.println("digite el piso al que desea ir");
        piso = sc.nextInt();
        System.out.println("Cuanto pesa usted?");
        pesoUsuario = sc.nextDouble();
    }
    
    public void verificarPeso(){
        
        if(pesoUsuario <= limitePeso){
            System.out.println("nos dirijimos al piso " + piso);
        } else {
            System.out.println("Exceso de peso, use las escaleras por favor");
        }
    }
    
    public void finalizar(){
        System.out.println("Gracias ");
        
    }
}
  

