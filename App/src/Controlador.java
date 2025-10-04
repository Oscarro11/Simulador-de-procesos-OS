import java.util.ArrayList;

public class Controlador {
    static int cont_PID = 1;

    public static Proceso crearProceso() {
        Proceso procesoNuevo;

        String nombre = Consola.pedirNombre();
        int cantCambio = Consola.pedirCambio();
        int tipo = Consola.pedirTipo();

        switch (tipo) {
            case 1:
                procesoNuevo = new ProcesoCPU(String.format("%06d", cont_PID), nombre, cantCambio);
                break;
        
            case 2:
                procesoNuevo = new ProcesoIO(String.format("%06d", cont_PID), nombre, cantCambio);
                break;

            case 3:
                procesoNuevo = new ProcesoDaemon(String.format("%06d", cont_PID), nombre, cantCambio);
                break;

            default:
                procesoNuevo = null;
                break;
        }
        cont_PID += 1;

        return procesoNuevo;
    }

    public static void ejecutarProcesos(ArrayList<Proceso> lista_procesos, int num_inicial) {
        int num = num_inicial;
        int res = 0;

        for (Proceso proceso : lista_procesos) {
            res = proceso.operar(num);
            Consola.mostrarResultado(proceso.getNombre(), num, proceso.tipoProceso(proceso), res);
            num = res;
        }
    }
}
