package aparelho.ligacao;

public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void iniciarCorreioVoz(String numero);

}
