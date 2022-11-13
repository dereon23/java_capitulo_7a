package Capitulo7a;
import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		int temperaturasmes[] = new int[12];
		
		System.out.println("Introduce doce temperaturas");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<12;i++) {
			temperaturasmes[i]=s.nextInt();
		}
		
		for(int i=0;i<12;i++) {
			System.out.print("\nmes "+(i+1)+":");
			for(int j=0;j<temperaturasmes[i];j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
