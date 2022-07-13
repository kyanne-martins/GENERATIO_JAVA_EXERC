package AULAS_03_POO;

public class aviao {
	
	private int portao;
	private String destino;
	private boolean checkin;	
	private String enbarque;
	int num;
	
	
	
	public int getPortao() {
		return portao;
	}

	public void setPortao(int portao) {
		this.portao = portao;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean getCheckin() {
		return checkin;
	}

	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}

	public String getEnbarque() {
		return enbarque;
	}

	public void setEnbarque(String enbarque) {
		this.enbarque = enbarque;
	}

	void  bemvindo() {
		
		System.out.println("Bem Vindo ao Aeroporto Internacional! \n Escolha uma opção para iniciar o check in:\n1- Online;\n2- Atendimento.\n");
		
	}
	
	void partida(int num)
	{
		 switch(num) {
		 
		 case 1: 
			 System.out.println("Suas passagens serão emitidas!\n Aguarde....\n");
		 break;
		 
		 case 2: 
			 System.out.println("Dirija-se ao bancão de atendimento!\n");
		 break;
		 }
	}

}
