package Capitulo7a;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] ards) {
		
		int[] mesas =new int[10];
		Scanner s=new Scanner(System.in);
		int cantidad=0;
		boolean hayVacios=true;
		while(cantidad!=-1) {
			
			System.out.print("Mesas:    ");
			for(int i=0;i<10;i++) {
				System.out.print((i+1)+"  ");
			}
			System.out.println();
			System.out.print("Clientes: ");
			for(int i=0;i<10;i++) {
				System.out.print(mesas[i]+"  ");
			}
			System.out.println("\n\n");
			
			System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
			cantidad=s.nextInt();
			
			if(cantidad<5&&cantidad>-1) {
				for(int i=0;i<10;i++) {
					if(mesas[i]==0&&hayVacios) {
						mesas[i]+=cantidad;
						System.out.println("Por favor, siéntense en la mesa número "+i+"\n\n");
						break;
					}
					if((mesas[i]+cantidad<5)&&!hayVacios) {
						if(mesas[i]>0) {
							System.out.print("Tendrán que compartir mesa. ");
						}
						mesas[i]+=cantidad;
						System.out.println("Por favor, siéntense en la mesa número "+i+"\n\n");
						break;
					}
					
					if(i==9&&hayVacios) {
						i=0;
						hayVacios=false;
					}
					if(i==9&&!hayVacios){
						System.out.println("Lo siento, no nos que espacio");
					}
				}
			}else if(cantidad==1){
				System.out.println("Gracias. Hasta pronto");
				break;
			}else{
				System.out.println("Lo siento, no admitimos grupos de "+cantidad+", haga"+
				" grupos de 4 personas como máximo e intente de nuevo\n\n");
			}
			
		}
		
	}
	
}
