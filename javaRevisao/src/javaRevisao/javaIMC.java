package javaRevisao;
import java.util.*;
public class javaIMC { 
	public static void main (String args[]) {
		
		float altura=0, peso, calculo=0; 
		Scanner ler = new Scanner (System.in); 
		System.out.println("Digite seu peso: ");
		peso = ler.nextFloat(); 
		System.out.println("Digite sua altura");
		altura = ler.nextFloat(); 
		calculo = peso/(altura*altura); 
		System.out.println("Seu c�lculo IMC � de "+calculo);
		if (calculo<18.5) {
			System.out.println("Voc� est� baixo do peso");
		} 
		else if (calculo>=18.5 && calculo<25) {
			System.out.println("Voc� est� no seu peso normal");
		}
		else if (calculo>25 && calculo<30) {
			System.out.println("Voc� est� acima do peso");
		}
		else if (calculo>30) {
			System.out.println("Obeso");
		}
	}

}
