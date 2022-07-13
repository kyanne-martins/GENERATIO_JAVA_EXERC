package AULAS_03_POO;

public class acao_aviao {

	public static void main(String[] args) {
		
		aviao pass1 = new aviao();
		pass1.setPortao(111);
		pass1.setDestino("São Paulo");
		pass1.setCheckin(true);
		pass1.setEnbarque("12C");
		
		pass1.bemvindo();
		
		System.out.println("Sua escolha foi a opção 1!\n");
		
		pass1.partida(1);
		
		System.out.println("Esse é o seu portão de embarque:\n"+pass1.getPortao()+"\n");
		System.out.println("Seu Destino é:\n"+pass1.getDestino()+"\n");
		System.out.println("Check-in realizado!\n");
		System.out.println("Seu assento é:\n"+pass1.getEnbarque());
		

	}

}
