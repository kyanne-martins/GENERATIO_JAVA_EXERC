package AULAS_04_HERANCA;

/* 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

// Atributos de animal

public class animal {
	
	private String nome;
	private int idade;
	private String emitirSom;
	
//construtor de animal
	
	public animal(String nome,int idade,String emitirSom)
	{
		this.nome = nome;
		this.idade = idade;
		this.emitirSom =emitirSom;
	}
	
//gets e setts

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	
	

}
