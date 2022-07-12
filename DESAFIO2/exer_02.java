package AULAS_02;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

public class exer_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num,par=0,imp=0;
	
		
		 for(int i=1;i<=10;i++) 
		 {
			 System.out.println("Insira um numero: ");
		        num= leia.nextInt();
		        
		  if(num%2==0) 
		  {      
	       par++;
	      
		  }
		  
		  else 
		  {
			imp++;
		        
		  }
		
		 }
		 System.out.println("Foram digitados "+par+" numeros pares!");
		  System.out.println("Foram digitados "+imp+" numeros impares!");
	}
}
