package AULAS_02;

import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa para saber as características
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre:

//o número de pessoas calmas;
//o número de mulheres nervosas;
//o número de homens agressivos;
//o número de outros calmos;
//o número de pessoas nervosas com mais de 40 anos;
//o número de pessoas calmas com menos de 18 anos.

public class exer_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pessoas=1, idade, sexo=0, op, pessoaC=0, pessoaC18=0,outrosC=0,mulheresN=0, pessoasN40=0,homensA=0;
		
		System.out.println("Digite o seu numero de ordem na pesquisa: ");
		 pessoas= leia.nextInt();
		
		while(pessoas!=7) {
			 System.out.println("Qual sua idade");
			 idade= leia.nextInt();
			 
			 System.out.println("Qual seu sexo escolha:\n 1- Feminino \n 2- masculino \n 3- outros ");
			 sexo= leia.nextInt();
			 
			 switch(sexo) {
			 
			 case 1: 
			 System.out.println("1- Feminino");
			 break;
			 
			 case 2: 
				 System.out.println("2- Masculino");
				 break;
				 
			 case 3: 
				 System.out.println("3- Outros");
				 break;
			 
			 }
			 
			 System.out.println("Como você se descreveria:\n 1-Calma \n 2-Nervosa \n 3-Agressiva ");
				op= leia.nextInt();	 
				
				switch(op) {
				 
				 case 1: 
				 System.out.println("1- Calma");
				 break;
				 
				 case 2: 
					 System.out.println("2- Nervosa");
					 break;
					 
				 case 3: 
					 System.out.println("3- Agresiva");
					 break;
				 
				 }
				
				if(sexo==2&&op==3) {
					homensA++;
				}
				
				else if(op==1&&idade<=18) {
					pessoaC18++;
				}
				
				else if(sexo==3&&op==1) {
					outrosC++;
				}
				
				else if(sexo==1&&op==2) {
					mulheresN++;
				}
				
				else if(idade>=40&&op==2) {
					pessoasN40++;
				}
				else if(op==1) {
					pessoaC++;
				}
			
				System.out.println("Digite o seu numero de ordem na pesquisa: ");
				 pessoas= leia.nextInt();
		}

		 System.out.println("Esses são os dados da pesquisa: \n Número de pessoas calmas: "+pessoaC+"\n Número de mulheres nervosas: "+mulheresN+"\nO número de homens agressivos:"+homensA+"\nO número de outros calmos: "+outrosC+"\nO número de pessoas nervosas com mais de 40 anos"+pessoasN40+"\nO número de pessoas calmas com menos de 18 anos"+pessoaC18);
		 		
		 		
	
	}

}
