
package ejerciciosbasicos;

import java.util.Scanner;


public class Factura {
  
 public String cliente;
  public String producto;
 public int cantidad;
 public double precioUnitario;
 public boolean esEstudiante;
 public char tipoCliente;

public void obtenerDatosCliente(){

Scanner sc = new Scanner(System.in);
    System.out.println("ingrese el nombre del cliente");
  cliente = sc.nextLine();
    System.out.println("ingrese el producto");
  producto = sc.nextLine();
    System.out.println("ingrese la cantidad");
  cantidad = sc.nextInt();
    System.out.println("ingrese el precio unitario");
  precioUnitario = sc.nextInt();
    System.out.println("el cliente es estudiante?");
  esEstudiante = sc.hasNextBoolean();
    System.out.println("ingrese el tipo de cliente (A,B,C");
  tipoCliente = sc.next().charAt(0);
}

public double CalcularSubtotal(){
        return cantidad * precioUnitario;
}
 public double calcularImpuesto(double subtotal) {
        if (esEstudiante) {
            return subtotal * 0.05;  // 5% si es estudiante
        } else {
            return subtotal * 0.13;  // 13% si no es estudiante
        }
    }

 public double calcularTotal(double subtotal, double impuesto) {
        return subtotal + impuesto;
    }

 public void mostrarFactura() {
        double subtotal = CalcularSubtotal();
        double impuesto = calcularImpuesto(subtotal);
        double total = calcularTotal(subtotal, impuesto);

        // Mostrar la factura
        System.out.println("Factura:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
}

