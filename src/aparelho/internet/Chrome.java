package aparelho.internet;

public class Chrome implements NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("ESTOU EXIBINDO UMA PÁGINA");
		
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("ESTOU ADICIONANDO UMA NOVA ABA");
		
	}

	@Override
	public void atualizarPagina(String url) {
		System.out.println("ESTOU ATUALIZANDO UMA PÁGINA");
		
	}

}
