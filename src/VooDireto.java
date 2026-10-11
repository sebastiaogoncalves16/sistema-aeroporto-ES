import java.time.LocalTime;

public class VooDireto extends Voo {

    public VooDireto(String numeroVoo, String destino, LocalTime horaPartida,
                     String portaEmbarque, CompanhiaAerea companhia, Aeronave aeronave) {
        super(numeroVoo, destino, horaPartida, portaEmbarque, companhia, aeronave);
    }
}
