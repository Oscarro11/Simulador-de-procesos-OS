import java.util.Random;

public class ProcesoDaemon extends Proceso{
    private final Random RNG = new Random();

    public ProcesoDaemon(String PID, String nombre, int variable_cambio){
        super(PID, nombre, variable_cambio);
    }

    @Override
    public int operar(int num){
        return num * RNG.nextInt(0, 10);
    }
}
