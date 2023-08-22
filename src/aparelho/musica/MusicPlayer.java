package aparelho.musica;

public class MusicPlayer implements ReprodutorMusical{

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("ESTOU SELECIONANDO UMA MÚSICA");
		
	}

	@Override
	public void tocarMusica(String musica) {
		System.out.println("ESTOU TOCANDO UMA MÚSICA");
		
	}

	@Override
	public void pausarMusica(String musica) {
		System.out.println("ESTOU PAUSANDO UMA MÚSICA");
		
	}

}
