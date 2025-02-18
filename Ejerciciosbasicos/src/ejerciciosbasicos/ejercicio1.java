package ejerciciosbasicos;
import java.util.Scanner;

//1. crear la clase
public class ejercicio1 {
    // 2. crear atributos
    //crear constructor
    // da el estado inicial del objeto
    
    public ejercicio1(){
        
    }
    //crear metodos
    public boolean tomarDatos (){
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("escriba el nombre del cliente");
        String nombreCliente = objTeclado.nextLine();
        System.out.println("escriba el apellido del cliente");
        String apellidoCliente = objTeclado.nextLine();
        
        //Ejercicio1 objAux=new Ejercicio1();
        ejercicio1.calcularDatos(nombreCliente,apellidoCliente);
        return true;
    }
    private static void calcularDatos(String datoNombre,String datoApellido){
        System.out.println("nombre cliente " + datoNombre);
        System.out.println("apellido cliente " + datoApellido);
        
    }
    public void mostrarResultados(){
        
    }
}