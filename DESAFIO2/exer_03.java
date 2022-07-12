package AULAS_02;

import java.util.Scanner;

public class exer_03 {
	
// 	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
// idade for =-99.

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int pessoas,menor21=0,maior50=0;
	
	 System.out.println("Qual sua idade ");
	 pessoas= leia.nextInt();
	 
	while(pessoas!= -99) {
		if(pessoas<=21) {
			menor21++;
		}
		
		else if(pessoas>=50) {
			maior50++;
		}
		System.out.println("Qual a sua idade ");
		 pessoas= leia.nextInt();
	}
	System.out.println("Total de pessoas menores de 21 anos são: "+menor21+", total de pessoas maiores de 50 anos, são: "+maior50+"!");
	}

}
