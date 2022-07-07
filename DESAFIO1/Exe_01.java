package AULAS_INICIAIS;

import java.util.Scanner;

public class Exe_01 {
	
	//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		
		int n1,n2,n3;

	   
	        System.out.println("Insira um numero: ");
	        n1= leia.nextInt();
	        
	        System.out.println("Insira um numero: ");
	        n2= leia.nextInt();
	        
	        System.out.println("Insira um numero: ");
	        n3= leia.nextInt();
	        
	        if(n1>n2&&n1>n3) {
	        	 System.out.println("O maior numero é "+n1);
	        }
	        
	        else if(n2>n1&&n2>n3) {
	        	 System.out.println("O maior numero é "+n2);
	        }
	        else if(n3>n1&&n3>n2) {
	        	 System.out.println("O maior numero é "+n3);
	        }
	        
	        else {
	        	System.out.println("Digite um numero válido! ");
	        }
	        
	        
	    
	}

}


