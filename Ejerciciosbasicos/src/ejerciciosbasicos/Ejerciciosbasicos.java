
package ejerciciosbasicos;

import java.util.Scanner;


public class Ejerciciosbasicos{

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  numero;
        
        do{
            System.out.println("sintaxis");  
           System.out.println("1. factura");
          System.out.println("2. condicional 1");
          System.out.println("3. condicional 2");
       System.out.println("4. condicional 3");
           System.out.println("5. condicional 4");
        System.out.println("6. condicional 5");
            System.out.println("7. swich case 1");
        System.out.println("8. swich case 2");
          System.out.println("9. swich case 3");
            System.out.println("10. swich case 4");
            System.out.println("11. swich case 5");
            System.out.println("12.bucle while 1");
            System.out.println("13. bucle while 2");
            System.out.println("14. bucle while 3 ");
            System.out.println("15. bucle while 4");
            System.out.println("16. bucle while 5");
            System.out.println("17. dowhile 1");
            System.out.println("18. dowhile 2");
            System.out.println("19. dowhile 3");
            System.out.println("20. dowhile 4");
            System.out.println("21. dowhile 5");
            System.out.println("22. dowhile 6");
            System.out.println("23. for 1");
            System.out.println("24. for 2");
            System.out.println("25. for 3");
            System.out.println("26. for 4");
            System.out.println("27. for 5");
            
        numero = sc.nextInt();
        ejercicio1 objejercicio1 = new ejercicio1();
        Factura factura = new Factura();
        Condicional1 Ascensor = new Condicional1();
        Condicional2 Peso = new Condicional2();
        Condicional3 temperaturaAsc = new Condicional3();
        Condicional4 SensorEmer = new Condicional4();
        Condicional5 Asc = new Condicional5();
        SwichCase1 alimentos = new SwichCase1();
        SwichCase2 IMC = new SwichCase2();
        SwitchCase3 peliculas = new SwitchCase3();
        SwitchCase4 partido = new SwitchCase4();
        SwitchCase5 menu = new SwitchCase5();
        BucleWhile1 caja = new BucleWhile1();
        BucleWhile2 tienda = new BucleWhile2();
        BucleWhile3 impresora = new BucleWhile3();
        BucleWhile4 viaje = new BucleWhile4();
        BucleWhile5 Regresiva = new BucleWhile5();
        BucleWhile6 adivinanza = new BucleWhile6();
        DoWhile1 biblioteca = new DoWhile1();
        DoWhile2 pedido = new DoWhile2();
        DoWhile3 temperatura = new DoWhile3();
        DoWhile4 notas = new DoWhile4();
        DoWhile5 tareas = new DoWhile5();
        DoWhile6 ventas = new DoWhile6();
        For1 parqueadero = new For1();
        For2 compras = new For2();
        For3 contacto = new For3();
        For4 suma = new For4();
        For5 inventario = new For5();
        switch (numero){
            
            case 1 :
                boolean aux=objejercicio1.tomarDatos();
                System.out.println("estado del cliente " + aux);
                break;
                
            case 2 :
                factura.obtenerDatosCliente();
                factura.mostrarFactura();
                break;
                
            case 3 :
              Ascensor.accederAsensor();
              Ascensor.verificarPiso();
              Ascensor.Agradecimeinto();
                break;
                
            case 4 :
                Peso.ingresarPeso();
                Peso.verificarPeso();
                Peso.finalizar();
                break;
                
            case 5 :
                temperaturaAsc.IngresarTemperatura();
                temperaturaAsc.verificarTemperatura();
                temperaturaAsc.finalizar();
                break;
                
            case 6 :
                SensorEmer.ingresarTemperatura();
                SensorEmer.verificarTemperatura();
                SensorEmer.Finalizar();
                break;
                
            case 7 :
                Asc.irPiso();
                Asc.Verificar();
                Asc.finalizar();
                break;
                
               case 8:
                alimentos.solicitud();
                alimentos.operacion();
                alimentos.Finalizar();
                break;
                
               case 9 :
                 IMC.pedirDatos();
                 IMC.operacion();
                 IMC.finalizar();
                 break;
                 
               case 10 :
                peliculas.Info();
                peliculas.recomendacion();
                peliculas.finalizar();
                break;
                
               case 11:
                partido.ingresar();
                partido.resultados();
                partido.finalizar();
                break;
                
               case 12 :
                menu.menú();
                menu.metodoPago();
                menu.pedidoPlato();
                menu.pedidoBebida();
                menu.operacion();
                menu.finalizar();
                break;
                
               case 13 :
               caja.retirar();
               caja.operacion();
               caja.finalizar();
               break;
               
               case 14 :
                tienda.ingresarDatos();
                tienda.bucle();
                tienda.finalizar();
                break;
                
               case 15 :
               impresora.agregarInfo();
               impresora.verificar();
               impresora.finalizar();
                break;
                
               case 16 :
                viaje.infoViaje();
                viaje.calculo();
                viaje.repetir();
                viaje.finalizar();   
                break;
                
               case 17 :
               Regresiva.empezar();
               Regresiva.cuentaAtras();
               Regresiva.finalizar();
               break;
               
               case 18:
                adivinanza.numeroAleatorio();
                adivinanza.adivinanza();
                adivinanza.bluce();
                adivinanza.finalizar();
                break;
                
               case 19:
               biblioteca.info();
               biblioteca.bluce();
               biblioteca.finalizar();
               break;
               
               case 20:
                pedido.menu();
                pedido.bucle1();
                pedido.finalizar();
                break;
                
               case 21 :
                temperatura.ingresar();
                temperatura.bluce();
                temperatura.finalizar();
                break;
          
               case 22 : 
                notas.ingrear();
                notas.calculo();
                notas.finalizar();
                break;
                
               case 23:
                tareas.ingresar();
                tareas.bluce();
                tareas.finalizar();
                break;
                
               case 24:
              ventas.info();
              ventas.bluce();
              ventas.finalizar();
              break;
              
               case 25:
                parqueadero.solicitar();
                parqueadero.bucle();
                parqueadero.mostrar();
                parqueadero.finalizar();  
                break;
                
               case 26:
               compras.Compra();
               compras.mostrar();
               compras.finalizar();
               break;
               
               case 27:
                contacto.almacenar();
                contacto.mostrarCon();
                contacto.finalizar();
                break;
                
               case 28:
                suma.ingresarnum();
                suma.mostrar();
                suma.finalizar();
                break;
                
               case 29 : 
                inventario.ventas();
                inventario.mostrar();
                inventario.finalizar();
                break;
                
               case 30:
                System.out.println("no tenemos mas ejercicios");
                break;
            default:
               
                System.out.println("opcion invalida");
                break;
        }
     } while (numero != 30);
     
     sc.close();
        }
        }
        

       
       
    
    
   

