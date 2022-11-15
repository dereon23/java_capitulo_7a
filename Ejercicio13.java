package Capitulo7a;
import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args){
		
		int[] numeros = new int[100];
		
		int minimo=501;
		int maximo=-1;
		for(int i=0; i<100;i++) {
			numeros[i]=(int)(Math.random()*501);
			System.out.printf("%4d", numeros[i]);
			if(numeros[i]>maximo) {
				maximo=numeros[i];
			}else if(numeros[i]<minimo) {
				minimo=numeros[i];
			}
			if((i+1)%25==0) {
				System.out.println();
			}
		}
		
		System.out.print("\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
		Scanner s=new Scanner(System.in);
		int respuesta=s.nextInt();
		
		int resaltar;
		if(respuesta==1) {
			for(int i=0; i<100;i++) {
				if(numeros[i]==minimo) {
					System.out.printf(" **"+minimo+"** ");
				}else {
					System.out.printf("%4d", numeros[i]);
				}
				if((i+1)%25==0) {
					System.out.println();
				}
			}
		}else if(respuesta==2) {
			for(int i=0; i<100;i++) {
				if(numeros[i]==maximo) {
					System.out.printf(" **"+maximo+"** ");
				}else {
					System.out.printf("%4d", numeros[i]);
				}
				if((i+1)%25==0) {
					System.out.println();
				}
			}
		}else {
			System.out.println("Error con datos introducidos");
		}
		
	}
}
