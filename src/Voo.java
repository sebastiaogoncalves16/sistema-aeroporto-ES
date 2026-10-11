/**
 * Trabalho Prático - Engenharia de Software
 * Grupo composto por:
 * - Sebastião Gonçalves (nº 71326)
 * - Gil Alves (nº 68036)
 */

import java.time.LocalTime;

public abstract class Voo {
    private String numeroVoo;
    private String destino;
    private LocalTime horaPartida;
    private String portaEmbarque;
    private CompanhiaAerea companhia;
    private Aeronave aeronave;

    public Voo(String numeroVoo, String destino, LocalTime horaPartida,
               String portaEmbarque, CompanhiaAerea companhia, Aeronave aeronave) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.portaEmbarque = portaEmbarque;
        this.companhia = companhia;
        this.aeronave = aeronave;
    }


    public double calcularCusto() {
        return companhia.getCustoPorCliente() * (1 + companhia.getTaxaLucro());
    }
}
