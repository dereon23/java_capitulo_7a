package Capitulo7a;
import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[8];
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce 8 numeros: ");
		
		for(int i=0;i<8;i++) {
			numeros[i]=s.nextInt();
		}
		for(int i=0;i<8;i++) {
			if(numeros[i]%2==0) {
				System.out.print(numeros[i]+"[par] ");
			}else {
				System.out.print(numeros[i]+"[impar] ");
			}
		}
		
		
		
		
	}

}
