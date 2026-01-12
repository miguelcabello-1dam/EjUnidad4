package ejerciciosparte1;

public class EjercicioA4 {

	public static void main(String[] args) {
		
		Articulo articulo1 = new Articulo();
		
		articulo1.nombre = "Pijama";
		articulo1.precio = 10.0;
		
		System.out.println(articulo1.nombre + " - Precio:" + articulo1.precio + "€ - IVA:" + articulo1.IVA + "% - PVP:" + (articulo1.precio += articulo1.precio*articulo1.IVA/100) + "€");
	}

}