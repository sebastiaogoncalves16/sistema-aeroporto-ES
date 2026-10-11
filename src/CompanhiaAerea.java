/**
 * Trabalho Prático - Engenharia de Software
 * Grupo composto por:
 * - Sebastião Gonçalves (nº 71326)
 * - Gil Alves (nº 68036)
 */

import java.util.ArrayList;
import java.util.List;

public class CompanhiaAerea {
    private String nome;
    private double custoPorCliente;
    private double taxaLucro;
    private List<Voo> voos = new ArrayList<>();

    public CompanhiaAerea(String nome, double custoPorCliente, double taxaLucro) {
        this.nome = nome;
        this.custoPorCliente = custoPorCliente;
        this.taxaLucro = taxaLucro;
    }


    public double getCustoPorCliente() { return custoPorCliente; }
    public void setCustoPorCliente(double custoPorCliente) { this.custoPorCliente = custoPorCliente; }

    public double getTaxaLucro() { return taxaLucro; }
    public void setTaxaLucro(double taxaLucro) { this.taxaLucro = taxaLucro; }

}
