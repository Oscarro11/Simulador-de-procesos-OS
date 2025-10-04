import java.util.Scanner;

public class Consola {
    static Scanner teclado = new Scanner(System.in);

    public static String pedirNombre(){
        String nombre = "";
        boolean nombre_valido = false;
        
        while (!nombre_valido) {
            System.out.println("Por favor, ingrese el nombre que el nuevo proceso tendra: ");
            try {
                nombre = teclado.nextLine();
                nombre_valido = true;
            } catch (Exception e) {
                System.out.println("El nombre ingresado no es valido, intentelo de nuevo\n");
            }
        }
        System.out.println("");

        return nombre;
    }

    public static int pedirCambio(){
        int numero_ingresado = 0;
        boolean numero_valido = false;
        
        while (!numero_valido){
            System.out.println("Ingrese el numero que el nuevo proceso usara en sus calculos: ");
            try {
                numero_ingresado = teclado.nextInt();
                teclado.next();
                numero_valido = true;
            } catch (Exception e) {
                System.out.println("El numero ingresado no es valido, intentelo de nuevo\n");
            }
        }
        System.out.println("");

        return numero_ingresado;  
    }

    public static int pedirTipo(){
        int tipo_ingresado = 0;
        boolean numero_valido = false;
        
        while (!numero_valido){
            System.out.println("Ingrese el tipo de metodo que quiere crear. Los tipos de metodo se basan en el siguiente codigo: " +
                                "\n1. Proceso del CPU" +
                                "\n2. Proceso de I/O" +
                                "\n3. Proceso de Daemon");
            try {
                tipo_ingresado = teclado.nextInt();
                if (tipo_ingresado == 1 || tipo_ingresado == 2 || tipo_ingresado == 3) {
                    teclado.next();
                    numero_valido = true;    
                }
                else {
                    System.out.println("El numero ingresado no pertenece a los tipos de procesos del sistema, intentelo de nuevo\n");
                }
                
            } catch (Exception e) {
                System.out.println("El numero ingresado no es valido, intentelo de nuevo\n");
            }
        }
        System.out.println("");

        return tipo_ingresado;  
    }

    public static int pedirNumeroProceso(String nombre){
        int numero_ingresado = 0;
        boolean numero_valido = false;
        
        while (!numero_valido){
            System.out.println("El proceso '" + nombre + "'' necesita que ingrese un numero: ");
            try {
                numero_ingresado = teclado.nextInt();
                teclado.next();
                numero_valido = true;
            } catch (Exception e) {
                System.out.println("El numero ingresado no es valido, intentelo de nuevo\n");
            }
        }
        System.out.println("");

        return numero_ingresado;  
    }

    public static void mostrarResultado(String nombre, int numero_original, int tipo, int resultado){
        String tipo_proceso = "";

        switch (tipo) {
            case 1:
                tipo_proceso = "proceso de CPU";
                break;

            case 2:
                tipo_proceso = "proceso de IO";
                break;

            case 3:
                tipo_proceso = "proceso de Daemon";
                break;
        
            default:
                break;
        }

        System.out.println("El " + tipo_proceso + " llamado '" + nombre + "' recibio el numero '" + numero_original + "'', y dio como resultado '" + resultado + "'");
    }
}
