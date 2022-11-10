package Capitulo7a;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		char[] num=new char[10];
		num[0]='a'; num[1]='x';num[4]='@';num[6]=' ';num[8]='+';num[8]='Q';
		
		for(char n : num) {
			System.out.print(n+"_");
		}
		
	}
	
}
