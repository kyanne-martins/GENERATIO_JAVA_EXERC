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
	
	// gets e setts	

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	// Método 

	@Override
	public void emitirSom() {
		
		System.out.println("Relinxando.....");
		
	}
	
	// gets e setts	
	

	
}
