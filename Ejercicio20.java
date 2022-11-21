package Capitulo7a;
import java.util.Scanner;


public class Ejercicio20 {

	public static void main(String[] args) {
		
		System.out.print("Introduzca el número total de nombres de reyes: ");
		Scanner s =new Scanner(System.in);
		int cant=Integer.parseInt(s.nextLine());
		System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
		
		String[] reyes= new String[cant];
		
		for(int i=0;i<cant;i++) {
			s.reset();
			reyes[i]=s.nextLine();
		}
		
		System.out.println("Los reyes introducidos son: ");
		
		int num;
		for(int i=0;i<cant;i++) {
			num=0;
			for(int j=0;j<i;j++) {
				if(reyes[i].equalsIgnoreCase(reyes[j])) {
					num++;
				}
			}
			System.out.println(reyes[i]+" "+(num+1)+"º");
		}
		
		
		
		
		
	}
	
}
