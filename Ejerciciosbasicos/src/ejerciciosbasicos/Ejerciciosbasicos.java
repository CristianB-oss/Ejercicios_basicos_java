
package ejerciciosbasicos;


public class Ejerciciosbasicos {

    
    public static void main(String[] args) {
      //EXPLICACION PASO A PASO DE LA TEMATICA 
      // 5. llamar objeto  
        ejercicio1 objejercicio1 = new ejercicio1();
      // 6. llamar metodo
            
        boolean aux=objejercicio1.tomarDatos();
        System.out.println("estado del cliente " + aux);

      //EJERCICIO FACTURA
       Factura factura = new Factura();
       factura.obtenerDatosCliente();
        
        
        factura.mostrarFactura();
    }
    
   
}
