package AULAS_04_HERANCA;

// herenaça de animal

public class preguica extends animal {
	
	private String subir;
	
//construtor preguiça:
	
public preguica (String nome,int idade,String emitirSom,String subir) 
{
	super(nome,idade,emitirSom);
	this.subir = subir;
}

//gets e setts
public String getSubir() {
	return subir;
}

public void setSubir(String subir) {
	this.subir = subir;
}

// Método

@Override
public void emitirSom() {
	
	System.out.println("Preguiça não emite som!");
	
}




	

}
