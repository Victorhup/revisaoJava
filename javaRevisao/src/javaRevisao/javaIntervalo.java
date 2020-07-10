package javaRevisao;
import java.util.*;
public class javaIntervalo { 
	public static void main (String args[]) {
		int num=1, interUm=0, interDois=0, interTres=0, interQua=0; 
		Scanner ler = new Scanner (System.in);
	
		
		while (num>=0) 
		{
			System.out.println("Entre com os números ");
			num = ler.nextInt(); 
		if (num>=1 && num<25) 
		{ 
			interUm++;
		}
		
		else if (num>=25 && num<=50) 
		{
		   interDois++; 
		}
		else if (num>50 && num<=75) { 
			interTres++;
		}
		else if (num>75 && num<=100) {
			interQua++;
		} 
		
		}
		System.out.println("Numeros entre 0 e 25: "+interUm);
		System.out.println("Números entre 26 e 50: "+interDois); 
		System.out.println("Números entre 51 e 75: "+interTres);
		System.out.println("Números entre 76 e 100: "+interQua);
	
	}
	
	
}
