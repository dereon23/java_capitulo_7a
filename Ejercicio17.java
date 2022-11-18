package Capitulo7a;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args){
		
		int[] numeros = new int[10];

		for(int i=0; i<10;i++) {
			numeros[i]=(int)(Math.random()*101);
			System.out.printf("%4d", numeros[i]);
		}
		
		boolean hay=false;
		int aux;
		while(!hay) {
		
			System.out.print("\n\nIntroduce un numero: ");
			Scanner s=new Scanner(System.in);
			int respuesta=s.nextInt();
			
			for(int i=0;i<10;i++) {
				if(respuesta==numeros[i]) {
					hay=true;
				}
			}
			if(hay) {
				while(numeros[0]!=respuesta) {
					
					aux=numeros[9];
					for(int i=9;i>0;i--) {
						numeros[i]=numeros[i-1];
					}
					numeros[0]=aux;
				}
				for(int n: numeros) {
					System.out.printf("%4d", n);
				}
				break;
			}
			
			System.out.println("Pruebe con otro numero");
			
		}
		
	}

	
}
