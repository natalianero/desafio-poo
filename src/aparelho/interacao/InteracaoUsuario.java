package aparelho.interacao;

import aparelho.internet.NavegadorInternet;
import aparelho.ligacao.AparelhoTelefonico;
import aparelho.musica.ReprodutorMusical;

public class InteracaoUsuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		NavegadorInternet navegadorInternet = (NavegadorInternet) iphone;
		ReprodutorMusical reprodutorMusical = (ReprodutorMusical) iphone;
		AparelhoTelefonico aparelhoTelefonico = (AparelhoTelefonico) iphone;
		
		navegadorInternet.exibirPagina("Instagram");
		reprodutorMusical.pausarMusica("Taylor Swift");
		aparelhoTelefonico.iniciarCorreioVoz("*555");
		

	}
}
