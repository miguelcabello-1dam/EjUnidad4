package ejparte1;

import java.util.Scanner;

public class EjercicioB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PERSONA 1");
		
		System.out.println("Introduce DNI: ");
		String dni = sc.nextLine();
		System.out.println("Introduce nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce primer apellido: ");
		String apellido1 = sc.nextLine();
		System.out.println("Introduce segundo apellido: ");
		String apellido2 = sc.nextLine();
		System.out.println("Introduce edad: ");
		int edad = sc.nextInt();

		ClasePersona persona1 = new ClasePersona(nombre, apellido1, apellido2, dni, edad);
		
		sc.nextLine();
		
		System.out.println("PERSONA 2");
		
		System.out.println("Introduce DNI: ");
		dni = sc.nextLine();
		System.out.println("Introduce nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce primer apellido: ");
		apellido1 = sc.nextLine();
		System.out.println("Introduce segundo apellido: ");
		apellido2 = sc.nextLine();
		System.out.println("Introduce edad: ");
		edad = sc.nextInt();
		
		ClasePersona persona2 = new ClasePersona(nombre, apellido1, apellido2, dni, edad);

		String mayoredad = "";
		
		if (persona1.edad < 18) {
			mayoredad = " no";
		}
		System.out.println(persona1.nombre + " " + persona1.apellido1 + " " + persona1.apellido2 + " con DNI " + persona1.dni + mayoredad + " es mayor de edad.");
		mayoredad = "";
		if (persona2.edad < 18) {
			mayoredad = " no";
		}
		System.out.println(persona2.nombre + " " + persona2.apellido1 + " " + persona2.apellido2 + " con DNI " + persona2.dni + mayoredad + " es mayor de edad.");
		
		sc.close();
	}

}