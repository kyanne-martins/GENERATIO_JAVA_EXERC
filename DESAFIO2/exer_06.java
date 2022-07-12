package AULAS_02;

import java.util.Scanner;


//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).


public class exer_06 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0;
		
		do {
			System.out.println("Digite um numero: ");
			num= leia.nextInt();
			
			if(num%3==0) {
				soma+=num;
			}
		 
	}while(num!=0);
		
		System.out.println("A soma dos numeros divisiveis por 3 é: "+soma+"!");
}
	
}
