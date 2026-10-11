/**
 * Trabalho Prático - Engenharia de Software
 * Grupo composto por:
 * - Sebastião Gonçalves (nº 71326)
 * - Gil Alves (nº 68036)
 */

import java.util.ArrayList;
import java.util.List;

public class Aeronave {
    private String fabricante;
    private String modelo;
    private int capacidade;
    private List<Voo> voos = new ArrayList<>();

    public Aeronave(String fabricante, String modelo, int capacidade) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

}
