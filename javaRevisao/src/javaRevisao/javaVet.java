package javaRevisao;
import java.util.*;
public class javaVet { 
	public static void main (String args[])
	{ 
		
		int vetor[] = new int [5]; 
		int  codigo=0,x;
		Scanner ler = new Scanner (System.in); 
		
		for (x=0; x<5;x++) 
		{
			System.out.println ("Digite o n�mero");
			vetor[x] = ler.nextInt();} 
		System.out.println("Entre com o c�digo: "); 
		codigo = ler.nextInt();
		if (codigo==0) {
			System.out.println ("Programa finalizado ");
		}
		else if (codigo==1) { 
			for (x=0; x<5;x++) {
				System.out.println("Posi��o" +(x+1)+ " : "+vetor[x]);
			} 
		 if (codigo==2) { 
				for (x=0; x>5; x--) {
					System.out.println ("Posi��o"+(x+1+ " : ")+vetor[x]);
				}
			}
		 
		}
		
		else { 
			System.out.println ("C�digo iv�lido");
		}
	
	}

}
