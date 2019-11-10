package manejoDeExecpciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//el programa lanzara una excepcion si se intenta dividir por 0
		//try intenta ejecutar codigo
		//catch caputra las excepciones
		//finaly ejecuta codigo pase lo que pase
		
		try {
			Integer a;
			Integer b;
			Integer c;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Bienvenido al programa manejo de excepciones");
			System.out.println("Ingrese un numero: ");
			
			a = teclado.nextInt();
			
			System.out.println("Ingrese otro numero: ");
			
			b = teclado.nextInt();
			
			c = a/b;
			
			System.out.println("El resultado es "+c);
			
			
		}
		
		catch (Exception e) {
			System.out.println("No es posible dividir por 0");
		}
		
		finally {
			System.out.println("El programa ha finalizado");
		}
	}

}
