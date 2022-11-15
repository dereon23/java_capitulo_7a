package Capitulo7a;
import java.util.Scanner;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		
		System.out.print("Introduce 8 palabras: ");
		String[] palabras=new String[8];
		Scanner s=new Scanner(System.in);
		String palabra;
		
		int color=0;
		int nocolor=7;
		for(int i=0;i<8;i++) {
			
			palabra=s.nextLine();
			
			if(
			palabra.equalsIgnoreCase("verde")||
			palabra.equalsIgnoreCase("rojo")||
			palabra.equalsIgnoreCase("azul")||
			palabra.equalsIgnoreCase("amarillo")||
			palabra.equalsIgnoreCase("naraja")||
			palabra.equalsIgnoreCase("rosa")||
			palabra.equalsIgnoreCase("negro")||
			palabra.equalsIgnoreCase("blanco")||
			palabra.equalsIgnoreCase("morado")
			) {
				palabras[color]=palabra;
				color++;
			}else {
				palabras[nocolor]=palabra;
				nocolor--;
			}

			
		}
		System.out.println();
		
		for(String str : palabras) {
			System.out.print(str+" ");
		}
		
	}

}
