import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Proceso> lista_procesos = new ArrayList<Proceso>();

        System.out.println("¡Bienvenido al menu principal!");
        while (opcion != 4) {
            System.out.println("Ingrese el numero de la opcion que desea realizar: " + 
                                "\n1. Crear un nuevo proceso" + 
                                "\n2. Mostrar los procesos en espera" + 
                                "\n3. Ejecutar los procesos en espera" + 
                                "\n4. Terminar programa");
            
            try {
                opcion = teclado.nextInt();
                //teclado.next();
            } catch (Exception e) {
                System.out.println("La opcion que ha ingresado no es un numero valido. Intentelo de nuevo\n");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    lista_procesos.add(Controlador.crearProceso());
                    System.out.println("Proceso creado exitosamente\n");
                    break;

                case 2:
                    for (Proceso proceso : lista_procesos) {
                        System.out.println(proceso.toString(proceso));
                    }
                    System.out.println("");
                    break;

                case 3:
                    boolean num_valido = false;
                    int num_inicial = 0;

                    while (!num_valido) {
                        System.out.println("Ingrese el numero con el cual quiere empezar los procesos");
                        try {
                            num_inicial = teclado.nextInt();
                            teclado.nextLine();
                        } catch (Exception e) {
                            System.out.println("El dato que ha ingresado no es un numero valido. Intentelo de nuevo\n");
                            continue;
                        }

                        if (num_inicial <= 0){
                            System.out.println("El numero ingresado debe ser mayor a 0. Intentelo de nuevo");
                        }
                        else{
                            Controlador.ejecutarProcesos(lista_procesos, num_inicial);
                        }

                    }
                    break;
  
                case 4:
                    System.out.println("\nMuchas gracias por usar el programa. ¡Esperamos verlo otra vez!");
                    teclado.close();
                    break;
            
                default:
                    System.out.println("La opcion ingresada no corresponde con ninguna del sistema. Intentelo de nuevo");
                    break;
            }

        }
    }
}
