package ejparte1;

public class ClaseArticulo {
	
	ClaseArticulo (String nombre, double precio, int iva, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	ClaseArticulo (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	int iva = 21;
	String nombre = "Pera";
	double precio = 0.30;
	int cuantosQuedan = 73;

}
