public abstract class Proceso {
    protected final String nombre;
    protected final int variable_cambio;
    protected final String PID;

    protected Proceso(String PID, String nombre, int variable_cambio){
        this.PID = PID;
        this.nombre = nombre;
        this.variable_cambio = variable_cambio;
    }

    protected int operar(int num){return num;};

    public int tipoProceso(Proceso proceso){
        int tipo_proceso = 0;

        switch (proceso) {
            case ProcesoCPU procesoCPU:
                tipo_proceso = 1;
                break;

            case ProcesoIO procesoIO:
                tipo_proceso = 2;
                break;

            case ProcesoDaemon procesoDaemon:
                tipo_proceso = 3;
                break;
        
            default:
                break;
        }
        
        return tipo_proceso;
    }

    public String toString(Proceso proceso){
        return "Nombre: " + nombre + ", Identificador: " + PID + ", Tipo: " + proceso.getClass() + ", Cantidad de cambio: " + variable_cambio;
    }

    public String getNombre() {
        return nombre;
    }
    public String getPID() {
        return PID;
    }
    public int getVariable_cambio() {
        return variable_cambio;
    }
}