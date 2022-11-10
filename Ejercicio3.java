package Capitulo7a;
import java.util.Scanner;


public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce 10 numeros: ");
		int num[] = new int[10];
		for(int i=0;i<10;i++) {
			num[i]=s.nextInt();
		}
		for(int i=9;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		
	}

}
