package Capitulo7a;

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void main(String[] args){
		
		int[] numeros = new int[20];

		for(int i=0; i<20;i++) {
			numeros[i]=(int)(Math.random()*401);
			System.out.printf("%4d", numeros[i]);
		}
		System.out.println();
		System.out.print("\n¿Qué quiere destacar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		Scanner s=new Scanner(System.in);
		int respuesta=s.nextInt();
		
		int resaltar;
		if(respuesta==5) {
			for(int i=0; i<20;i++) {
				if(numeros[i]%5==0) {
					System.out.print("["+numeros[i]+"]");
				}else {
					System.out.printf("%4d", numeros[i]);
				}
			}
		}else if(respuesta==7) {
			for(int i=0; i<20;i++) {
				if(numeros[i]%7==0) {
					System.out.print(" ["+numeros[i]+"] ");
				}else {
					System.out.printf("%4d", numeros[i]);
				}
			}
		}else {
			System.out.println("Error con datos introducidos");
		}
		
	}

}
