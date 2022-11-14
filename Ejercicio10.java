package Capitulo7a;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int[] numeros = new int[20];
		for(int i=0;i<20;i++) {
			System.out.printf("%4d",i+1);
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			numeros[i]=(int)(Math.random()*99+1);
			System.out.printf("%4d",numeros[i]);
		}
		
		int[] ordenado=new int[20];
		int posordenadopares=0;
		int posordenadoimpares=19;
		for(int i=0;i<20;i++) {
			if(numeros[i]%2==0) {
				ordenado[posordenadopares]=numeros[i];
				posordenadopares++;
			}else {
				ordenado[posordenadoimpares]=numeros[i];
				posordenadoimpares--;
			}
		}
		
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.printf("%4d",ordenado[i]);
		}
		
		
	}
	
}
