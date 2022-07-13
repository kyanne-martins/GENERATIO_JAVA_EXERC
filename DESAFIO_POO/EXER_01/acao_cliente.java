package AULAS_03_POO;

public class acao_cliente {

	public static void main(String[] args) {
		
		cliente cliente1= new cliente();
		cliente1.setNome("Gustavo Maia"); 
		cliente1.setDestino("Grecia");
		cliente1.setPagamento("Cartão");
		cliente1.setSozinho(false);
		
		System.out.println("Nome do cliente:\n"+cliente1.getNome());
		System.out.println("Destino do cliente:\n"+cliente1.getDestino());
		System.out.println("Forma de pagamento:\n"+cliente1.getPagamento());
		System.out.println("Viajará sozinho?:\n"+cliente1.getSozinho());
		
		cliente1.boaviagem();
		

	}

	
}
