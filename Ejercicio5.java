package Capitulo7a;
import java.util.*;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros: ");
		int[] numero= new int[10];
		
		numero[0]=s.nextInt(); int maximo=0; int minimo=0;

		for(int i=1;i<10;i++) {
			numero[i]=s.nextInt();
			if(numero[i]>numero[maximo]) {
				maximo=i;
			}
			if(numero[i]<numero[minimo]) {
				minimo=i;
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(numero[i]+" ");
			if(i==maximo){
				System.out.print("maximo  ");
			}
			if(i==minimo) {
				System.out.print("minimo  ");
			}
		}
		
	}

}
