/**
 * Trabalho Prático - Engenharia de Software
 * Grupo composto por:
 * - Sebastião Gonçalves (nº 71326)
 * - Gil Alves (nº 68036)
 */

public class Escala {
    private VooIndireto voo;
    private Aeroporto aeroporto;
    private boolean embarqueNoTransito;

    public Escala(VooIndireto voo, Aeroporto aeroporto, boolean embarqueNoTransito) {
        this.voo = voo;
        this.aeroporto = aeroporto;
        this.embarqueNoTransito = embarqueNoTransito;
    }
}

