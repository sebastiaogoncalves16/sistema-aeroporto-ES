/**
 * Trabalho Prático - Engenharia de Software
 * Grupo composto por:
 * - Sebastião Gonçalves (nº 71326)
 * - Gil Alves (nº 68036)
 */

import java.time.LocalTime;

public class VooDireto extends Voo {

    public VooDireto(String numeroVoo, String destino, LocalTime horaPartida,
                     String portaEmbarque, CompanhiaAerea companhia, Aeronave aeronave) {
        super(numeroVoo, destino, horaPartida, portaEmbarque, companhia, aeronave);
    }
}
