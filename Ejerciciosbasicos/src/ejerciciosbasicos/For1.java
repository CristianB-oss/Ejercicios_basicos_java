
package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Scanner;


public class For1 {
 
     Scanner sc = new Scanner(System.in);
    
    ArrayList<String> placas = new ArrayList<>();
    ArrayList<String> horas = new ArrayList<>();
    
    int vehiculos;
    
    public void solicitar(){
        System.out.println("cuantos vehiculos ingresan");
        vehiculos = sc.nextInt();
        
        sc.nextLine();
    }
    
    public void bucle(){
        for(int i = 0; i<vehiculos; i++){
            System.out.println("ingrese la placa del vehiculo " + (i+1));
            String placa = sc.nextLine();
            placas.add(placa);
            System.out.println("ingrese la hora " + (i+1));
            String hora = sc.nextLine();
            horas.add(hora);
          
        }
        
        
    }
    
    public void mostrar(){
        System.out.println("vehiculos ingresados");
        for (int i = 0; i < vehiculos; i++){
            System.out.println("vehiculo " + (i+1) + ": placa = " + placas.get(i) + ", hora = " + horas.get(i));
        }
    }
    
    public void finalizar(){
        System.out.println("fin de for 1");
        
}
}