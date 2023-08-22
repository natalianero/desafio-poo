package aparelho.interacao;

import aparelho.internet.NavegadorInternet;
import aparelho.ligacao.AparelhoTelefonico;
import aparelho.musica.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


@Override
public void selecionarMusica(String musica) {
	System.out.println("SELECIONANDO MÚSICA PELO IPHONE DA " + musica);
	
}

@Override
public void tocarMusica(String musica) {
	System.out.println("TOCANDO MÚSICA PELO IPHONE DA " + musica);
	
}

@Override
public void pausarMusica(String musica) {
	System.out.println("PAUSANDO MÚSICA PELO IPHONE DA " + musica);
	
}

@Override
public void exibirPagina(String url) {
	System.out.println("EXIBINDO PÁGINA PELO IPHONE DO " + url);
	
}

@Override
public void adicionarNovaAba(String url) {
	System.out.println("ADICIONANDO ABA PELO IPHONE DO " + url);
	
}

@Override
public void atualizarPagina(String url) {
	System.out.println("ATUALIZANDO PÁGINA PELO IPHONE DO " + url);
	
}

@Override
public void fazerChamada(String numero) {
	System.out.println("FAZENDO CHAMADA PELO IPHONE PARA O NÚMERO " + numero);
	
}

@Override
public void receberChamada(String numero) {
	System.out.println("RECEBENDO CHAMADA PELO IPHONE DO NÚMERO " + numero);
	
}

@Override
public void iniciarCorreioVoz(String numero) {
	System.out.println("INICIANDO CORREIO DE VOZ PELO IPHONE DO NÚMERO " + numero);
	
}

}
