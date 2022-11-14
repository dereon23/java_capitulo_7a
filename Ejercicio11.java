package Capitulo7a;
import java.util.Scanner;

public class Ejercicio11 {
	
public static void main(String[] args) {
		
		int[] numeros = new int[10];

		System.out.print("Introduce 10 numeros: ");
		Scanner s = new Scanner(System.in);
		System.out.println();
		for(int i=0;i<10;i++) {
			numeros[i]=s.nextInt();
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.printf("%4d",numeros[i]);
		}
		System.out.println();
		
		int[] ordenado=new int[10];
		int contador=-1;
		boolean primo;
		for(int i=0;i<10;i++) {
			primo=true;
			for(int j=2;j<numeros[i]/2;j++) {
				if(numeros[i]%j==0) {
					primo=false;
				}
			}
			if(primo){
				contador++;
				ordenado[contador]=numeros[i];
			}
		}
		if(contador<9) {
			for(int i=0;i<10;i++) {
				primo=true;
				for(int j=2;j<numeros[i]/2;j++) {
					if(numeros[i]%j==0) {
						primo=false;
					}
				}
				if(!primo){
					contador++;
					ordenado[contador]=numeros[i];
				}
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.printf("%4d",ordenado[i]);
		}
	}

}
