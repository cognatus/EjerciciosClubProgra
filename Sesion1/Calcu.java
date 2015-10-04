import java.util.Scanner;

public class Calcu{

	public static void main(String[] args){

		int a;
		int b;
		int suma;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese un numero 7u7");
		a = leer.nextInt();
		System.out.println("Ingrese otro numero numero 7u7");
		b = leer.nextInt();

		suma = a + b;

		System.out.println("El resultado de la suma es: " + suma);

	}
	
}