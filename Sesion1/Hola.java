import java.util.Scanner;

public class Hola{

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String nombre = "";

		System.out.println("Ingresa tu nombresini: ");
		nombre = leer.nextLine();

		System.out.println("Hola "+nombre);
		
	}
	
}