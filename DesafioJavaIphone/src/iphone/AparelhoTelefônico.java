package iphone;

public class AparelhoTelefônico {
	
	public static void Ligar(String numero) {
		ReprodutorMusical.Pausar();
		System.out.println("discando: " + numero);
		System.out.println("chamando....");
	}

	public static void Atender() {
		ReprodutorMusical.Pausar();
		System.out.println("Telefone Tocando");
		System.out.println("Ligação Atendida");
	}
	
	public static void CorreioVoz() {
		ReprodutorMusical.Pausar();
		System.out.println("Você tem uma Mensagem não lida");
		System.out.println("A mensagem é .....");
	}
}
