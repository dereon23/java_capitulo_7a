package Capitulo7a;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		int[] numeros= new int[100];
		
		for(int i=0; i<100;i++) {
			numeros[i]=(int)(Math.random()*19+1);
			System.out.print(numeros[i]+" ");
		}
		
		System.out.println();
		System.out.print("Introduce un numero que quieres cambiar: ");
		Scanner s = new Scanner(System.in);
		int numerocambiar=s.nextInt();
		System.out.print("Introduce que quieres poner en su lugar: ");
		int numeroponer=s.nextInt();
		
		
		for(int i=0; i<100;i++) {
			if(numeros[i]==numerocambiar) {
				numeros[i]=numeroponer;
			}
			System.out.print(numeros[i]+" ");
		}
		
	}

}
