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