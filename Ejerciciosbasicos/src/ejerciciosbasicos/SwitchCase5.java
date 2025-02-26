package ejerciciosbasicos;

import java.util.Scanner;


public class SwitchCase5 {

  Scanner sc = new Scanner (System.in);
    
    int platos, bebidas, metodoPago;
    int cuenta = 0;
    
    public void menú(){
        System.out.println("Bienvenido al restaurante del sabor");
        System.out.println("  selecciona el plato que quieras  ");
        System.out.println("PLATOS");
        System.out.println("1. bandeja paisa : $30.000");System.out.println("2. sancocho : $20.000");
        System.out.println("3. arroz chino : $15.000"); System.out.println("4. pollo broaster: 50.000");
        platos = sc.nextInt();
        System.out.println("BEBIDAS");
        System.out.println("1. Coca-cola familiar : $10.000"); System.out.println("2. Batidos : $9.000");
        System.out.println("3. Jugos citricos : $8.000"); System.out.println("4. Pepsi familiar : $7.000");
        bebidas = sc.nextInt();
    }
    
    public void metodoPago(){
        System.out.println("Seleccione su metodo de pago");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("3. Cheque");
        metodoPago = sc.nextInt();
          
    }
    
    public void pedidoPlato(){
        switch(platos){
            case 1:
                cuenta += 30000;
                break;
            case 2:
                cuenta += 20000;
                break;
            case 3:
                cuenta += 15000;
                break;
            case 4:
                cuenta += 50000;
                break;
            default:
                System.out.println("plato no disponible");
                break;
        }
       
    }
    
    public void pedidoBebida(){
        switch (bebidas) {
            case 1:
                cuenta += 10000;
                break;
            case 2:
                cuenta += 9000;
                break;
            case 3:
                cuenta += 8000;
                break;
            case 4:
                cuenta += 7000;
                break;
            default:
                System.out.println("bebida no disponible");
                break;
        }
    }
    
    public void operacion(){
        switch (metodoPago) {
            case 1:
                System.out.println("no tiene descuento");
                System.out.println("el total a pagar es: " + cuenta);
                break;
            case 2:
                System.out.println("tienes un descuento del 5%");
                double total = cuenta * (1 - 0.05);
                System.out.println("el total a pagar es: " + total);
                break;
            case 3:
                System.out.println("tienes un descuento del 10%");
                double total1 = cuenta * (1 - 0.10);
                System.out.println("el total a pagar es: " + total1);
                break;
            default:
                System.out.println("no aceptamos ese metodo de pago");
                break;
        }
    }
    public void finalizar(){
        System.out.println("fin del switch case 5");
       
    }
 
    
}
