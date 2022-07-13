package AULAS_03_POO;

public class cliente {

	private String nome;
	private String destino;
	private String pagamento;	
	private boolean sozinho;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public String getPagamento() {
		return pagamento;
	}



	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}



	public boolean getSozinho() {
		return sozinho;
	}



	public void setSozinho(boolean sozinho) {
		this.sozinho = sozinho;
	}



	void boaviagem()
	{
		if(this.sozinho==true)
		{
			System.out.println("Sua passagem foi emitida, Boa Viagem!");
		}
		
		else
		{
			System.out.println("Suas passagens foram emitidas, Boa Viagem!");
		}
		
	}

		
	
	
	
}
