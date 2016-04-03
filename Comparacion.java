package libro.cap01.cadenas;

import java.util.Scanner;

public class Comparacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduaca la primera cadenas: ");
		String palabra1 = scanner.next();
		
		System.out.println("Introduaca la segunda cadenas: ");
		String palabra2 = scanner.next();
		
		System.out.println("Las dos cadenas que hemos introducido son  : ");
		System.out.println("La primera cadena es  : " + palabra1);
		System.out.println("La segunda cadena es  : " + palabra2);
		
		
		if(palabra1.equals(palabra2))
		{
			System.out.println("Las dos cadenas son iguales");
		}
		else
		{
			System.out.println("Las dos cadenas son diferentes");
		}
	}

}
