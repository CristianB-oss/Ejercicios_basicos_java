
package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class DoWhile1 {
      Scanner sc = new Scanner(System.in);
    
   ArrayList<String>titulos = new ArrayList<>();
   ArrayList<String>autores = new ArrayList<>();
   ArrayList<Integer>paginasd = new ArrayList<>();
    
    int  decicion;
    
    public void info(){
        System.out.println("ingrese el titulo del libro");
        String titulo = sc.nextLine();
        titulos.add(titulo);
        System.out.println("cual es el autor del libro?");
        String autor = sc.nextLine();
        autores.add(autor);
        System.out.println("cuanta paginas tiene el libro?");
        int paginas = sc.nextInt();
        paginasd.add(paginas);
        
        sc.nextLine();
        
    }
    
    public void bluce(){
        
        do{
            
             System.out.println("desea ingresar otro libro?");
             System.out.println("1. si");
             System.out.println("2. no");
             decicion = sc.nextInt();
             sc.nextLine();
             
             if(decicion == 1){
                 info();
             }
             
            
        }while(decicion == 1);
        
        System.out.println("los datos ingresados son:");
        System.out.println("titulos: " + titulos);
        System.out.println("autores: " + autores);
        System.out.println("paginas: " + paginasd);
    }
    
     public void finalizar(){
        System.out.println("fin de dowhile 1");
       
    }
    
}
