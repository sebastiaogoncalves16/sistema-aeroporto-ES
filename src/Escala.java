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

