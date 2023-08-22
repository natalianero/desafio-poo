package aparelho.ligacao;

public class Telefone implements AparelhoTelefonico{

	@Override
	public void fazerChamada(String numero) {
		System.out.println("ESTOU FAZENDO UMA CHAMADA");
		
	}

	@Override
	public void receberChamada(String numero) {
		System.out.println("ESTOU RECEBENDO UMA CHAMADA");
		
	}

	@Override
	public void iniciarCorreioVoz(String numero) {
		System.out.println("ESTOU INICIANDO UM CORREIO DE VOZ");
		
	}

}
