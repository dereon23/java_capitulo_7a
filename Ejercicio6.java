package Capitulo7a;

import java.util.Scanner;

public class Ejercicio6 {
	
public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Introduce 15 numeros: ");
		int[] numero= new int[15];

		for(int i=0;i<15;i++) {
			numero[i]=s.nextInt();
		}
		
		int aux=numero[14];
		for(int i=14;i>0;i--) {
			numero[i]=numero[i-1];
		}
		numero[0]=aux;
		
		for(int i=0;i<15;i++) {
			System.out.print(numero[i]+" ");
		}
	}

}
