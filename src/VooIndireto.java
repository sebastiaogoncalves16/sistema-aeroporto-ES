/**
 * Trabalho Prático - Engenharia de Software
 * Grupo composto por:
 * - Sebastião Gonçalves (nº 71326)
 * - Gil Alves (nº 68036)
 */

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class VooIndireto extends Voo {
    private double taxaReabastecimento;
    private List<Escala> escalas = new ArrayList<>();

    public VooIndireto(String numeroVoo, String destino, LocalTime horaPartida,
                       String portaEmbarque, CompanhiaAerea companhia, Aeronave aeronave,
                       double taxaReabastecimento) {
        super(numeroVoo, destino, horaPartida, portaEmbarque, companhia, aeronave);
        this.taxaReabastecimento = taxaReabastecimento;
    }

    @Override
    public double calcularCusto() {
        return super.calcularCusto() + taxaReabastecimento;
    }

}
