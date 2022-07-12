package AULAS_02;

import java.util.Scanner;

//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

public class exer_01 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);	
		
		int num, x=1000, res=0;
		
		for(num=x;num<=1999;num++)
		{   
			if(num%11==5) {
				res=num;
				
		System.out.println("O resultado é:"+res);
			}
			
		
		}
		
	        
	}

}
