package AULAS_04_HERANCA;

// herança de animal
public class cachorro extends animal{
	
	private String correr;
	
//construtor de cachorro
		
	public cachorro (String nome,int idade,String emitirSom,String subir) 
	{
		super(nome,idade,emitirSom);
		this.correr = correr;
	}
	
// gets e setts	

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}


	
	
}
