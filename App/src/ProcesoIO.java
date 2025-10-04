public class ProcesoIO extends Proceso{
    
    public ProcesoIO(String PID, String nombre, int variable_cambio){
        super(PID, nombre, variable_cambio);
    }

    @Override
    public int operar(int num){
        return num + Consola.pedirNumeroProceso(nombre);
    }
}
