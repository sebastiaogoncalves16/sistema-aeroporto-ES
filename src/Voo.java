import java.time.LocalTime;

public abstract class Voo {
    private String numeroVoo;
    private String destino;
    private LocalTime horaPartida;
    private String portaEmbarque;
    private CompanhiaAerea companhia;
    private Aeronave aeronave;

    public double calcularCusto() {
        return 0;
    }
}