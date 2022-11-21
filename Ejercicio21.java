package Capitulo7a;

public class Ejercicio21 {
	
	public static void main(String[] args) {
		
		System.out.println("Array original: ");
		int[] numeros =new int[15];
		for(int i=0;i<15;i++) {
			numeros[i]=(int)(Math.random()*501);
			System.out.printf("%4d",numeros[i]);
		}
		
		System.out.println("\n\nArray cincuerizado: ");
		for(int i=0;i<15;i++) {
			while(numeros[i]%5!=0) {
				numeros[i]++;
			}
			System.out.printf("%4d",numeros[i]);
		}
		
	}

}
