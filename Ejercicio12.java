package Capitulo7a;
import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		int[] numeros=new int[10];
		
		System.out.print("Introduce 10 numeros: ");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			numeros[i]=s.nextInt();
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println(); 
		
		for(int n : numeros) {
			System.out.printf("%4d", n);
		}
		System.out.println();
		
		System.out.println("Introduce el indice inicial");
		int inicial = s.nextInt();
		System.out.println("Introduce el indice final");
		int ifinal = s.nextInt();
		
		if(inicial>=0&&inicial<10&&ifinal>=0&&ifinal<10) {
			
			int guardado;
			int siguiente =numeros[ifinal];
			numeros[ifinal]=numeros[inicial];
			
			for(int i=ifinal+1;i<10;i++) {
				if(i==10) {
					i=0;
				}else if(i==inicial) {
					numeros[i]=siguiente;
					break;
				}else if(i==9){
					guardado=numeros[i];
					numeros[i]=siguiente;
					siguiente=guardado;
					i=0;
				}else {
					guardado=numeros[i];
					numeros[i]=siguiente;
					siguiente=guardado;
				}
			}
			for(int n : numeros) {
				System.out.printf("%4d", n);
			}
		
			
			
		}else {
			System.out.println("Valores incorrectos");
		}
		
		
		
	}

}
