package Capitulo7a;

import java.util.Scanner;

public class Ejercicio18 {
	
public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		System.out.println("Array original: ");

		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			numeros[i]=(int)(Math.random()*201);
			System.out.printf("%4d",numeros[i]);
		}
		System.out.println("\n\nArray resultado: ");
		for(int i=0;i<10;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		
		
		int[] ordenado=new int[10];
		for(int i=0;i<10;i++) {
			ordenado[i]=-1;
		}
				
		int mayorUsado=-1;
		int menorUsado=-1;
		boolean turnoMayor=false;
		if(numeros[0]>100) {
			turnoMayor=true;
		}
		for(int i=0;i<10;i++) {
			if(turnoMayor&&mayorUsado<9){
				turnoMayor=false;
				for(int j=mayorUsado+1;j<10;j++) {
					if(numeros[j]>100) {
						ordenado[i]=numeros[j];
						mayorUsado=j;
						break;
					}
				}
				if(ordenado[i]==-1){
					turnoMayor=false;
					i--;
				}
			}else {
				turnoMayor=true;
				for(int j=menorUsado+1;j<10;j++) {
					if(numeros[j]<=100) {
						ordenado[i]=numeros[j];
						menorUsado=j;
						break;
					}
				}
				if(ordenado[i]==-1){
					turnoMayor=true;
					i--;
				}
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.printf("%4d",ordenado[i]);
		}
	}


}
