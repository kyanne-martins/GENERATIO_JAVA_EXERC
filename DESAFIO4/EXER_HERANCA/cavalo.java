package AULAS_04_HERANCA;

//herança de animal
public class cavalo extends animal {

	private String correr;
	
//construtor de cavalo

	public cavalo (String nome,int idade,String emitirSom,String subir) 
	{
		super(nome,idade,emitirSom);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	// gets e setts	
	

	
}
