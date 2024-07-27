package iphone;

public class TestarIphone {
	
	
	public static void main(String[] args) {
		
		
		
		
	//Pacote 
		

	//Reprodutor Musical
	//Métodos: tocar(), pausar(), selecionarMusica(String musica)
	ReprodutorMusical.Tocar(": Musica Totando");
	System.out.println("");
	
	ReprodutorMusical.Pausar();
	System.out.println("");
	
	ReprodutorMusical.SelecionarMusica("Musica 1");
	System.out.println("");
	
	//Aparelho Telefônico
	//Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
	
	AparelhoTelefônico.Ligar("999-999999");
	System.out.println("");
	
	AparelhoTelefônico.Atender();
	System.out.println("");
	
	AparelhoTelefônico.CorreioVoz();
	System.out.println("");
	
	
	//Navegador na Internet
	//Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()
	
	NavegadorInternet.exibirPagina("url Teste");
	System.out.println("");
	
	NavegadorInternet.adicionarNovaAba();
	System.out.println("");
	
	NavegadorInternet.atualizarPagina();
	System.out.println("");
	
	System.out.println("Testes Finalizados Corretamente!!!!");
	
		
		
	}
	
	
	
	
	

	
	
	
	

}
