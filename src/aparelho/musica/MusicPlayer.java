package aparelho.musica;

public class MusicPlayer implements ReprodutorMusical{

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("ESTOU SELECIONANDO UMA M�SICA");
		
	}

	@Override
	public void tocarMusica(String musica) {
		System.out.println("ESTOU TOCANDO UMA M�SICA");
		
	}

	@Override
	public void pausarMusica(String musica) {
		System.out.println("ESTOU PAUSANDO UMA M�SICA");
		
	}

}
