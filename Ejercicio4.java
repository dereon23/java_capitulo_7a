package Capitulo7a;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		long[] numero=new long[20];
		long[] cuadrado=new long[20];
		long[] cubo=new long[20];
		
		for(int i=0; i<20;i++) {
			System.out.printf("%7d", i+1);
		}
		System.out.println();
		
		for(int i=0; i<20;i++) {
			numero[i]=(long)(Math.random()*99+1);
			System.out.printf("%7d", numero[i]);
		}
		System.out.println();
		
		for(int i=0; i<20;i++) {
			cuadrado[i]=numero[i]*numero[i];
			System.out.printf("%7d", cuadrado[i]);
		}
		System.out.println();
		
		for(int i=0; i<20;i++) {
			cubo[i]=cuadrado[i]*numero[i];
			System.out.printf("%7d", cubo[i]);
		}
		System.out.println();
		
	}

}
