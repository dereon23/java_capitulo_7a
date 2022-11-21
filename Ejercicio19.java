package Capitulo7a;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args){
		
		int[] numeros = new int[12];

		
		for(int i=0; i<12;i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		for(int i=0; i<12;i++) {
			numeros[i]=(int)(Math.random()*101);
			System.out.printf("%4d", numeros[i]);
		}
		
		System.out.print("\n\nIntroduzca el número que quiere insertar: ");
		Scanner s=new Scanner(System.in);
		int respuesta=s.nextInt();
		int numero=respuesta;
		System.out.print("Introduzca la posición donde lo quiere insertar(0 – 11): ");
		respuesta=s.nextInt();

		for(int i=11;i>respuesta;i--) {
			numeros[i]=numeros[i-1];
		}
		numeros[respuesta]=numero;
		
		
		System.out.println();
		for(int i=0; i<12;i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		for(int n: numeros) {
			System.out.printf("%4d", n);
		}
		
	}
	
}
