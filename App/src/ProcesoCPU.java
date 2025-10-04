import java.util.Random;

public class ProcesoCPU extends Proceso{
    private final Random RNG = new Random();

    public ProcesoCPU(String PID, String nombre, int variable_cambio){
        super(PID, nombre, variable_cambio);
    }

    @Override
    public int operar(int num){
        return RNG.nextInt(0, num);
    }
}
