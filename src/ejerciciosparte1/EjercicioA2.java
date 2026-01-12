package ejerciciosparte1;

import java.util.Scanner;

public class EjercicioA2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		String mayoredad = "";
		
		System.out.println("PERSONA 1");
		
		System.out.println("Introduce DNI: ");
		persona1.dni = sc.nextLine();
		System.out.println("Introduce nombre: ");
		persona1.nombre = sc.nextLine();
		System.out.println("Introduce primer apellido: ");
		persona1.apellido1 = sc.nextLine();
		System.out.println("Introduce segundo apellido: ");
		persona1.apellido2 = sc.nextLine();
		System.out.println("Introduce edad: ");
		persona1.edad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("PERSONA 2");
		
		System.out.println("Introduce DNI: ");
		persona2.dni = sc.nextLine();
		System.out.println("Introduce nombre: ");
		persona2.nombre = sc.nextLine();
		System.out.println("Introduce primer apellido: ");
		persona2.apellido1 = sc.nextLine();
		System.out.println("Introduce segundo apellido: ");
		persona2.apellido2 = sc.nextLine();
		System.out.println("Introduce edad: ");
		persona2.edad = sc.nextInt();
		
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