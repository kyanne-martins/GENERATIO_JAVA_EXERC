package AULAS_INICIAIS;

import java.util.Scanner;

public class exer_02 {

	//Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		
		int idade;

	   
	        System.out.println("Informe sua idade");
	        idade= leia.nextInt();
	        
	      	        
	        if(idade>=10&&idade<=14) {
	        	 System.out.println("Sua categoria é Infantil!");
	        }
	        
	        else if(idade>=15&&idade<=17) {
	        	 System.out.println("Sua categoria é Juvenil!");
	        }
	        else if(idade>=18&&idade<=25) {
	        	 System.out.println("Sua categoria é Adulto!");
	        }
	        
	        else {
	        	System.out.println("Desculpe no momento não há categorias abertas para sua faixa étaria! ");
	        }

	}

}
