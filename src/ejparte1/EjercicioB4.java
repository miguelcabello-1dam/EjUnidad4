package ejparte1;

public class EjercicioB4 {

	public static void main(String[] args) {
		
		ClaseArticulo articulo1 = new ClaseArticulo("Pijama", 10.0);
		
		articulo1.nombre = "Pijama";
		articulo1.precio = 10.0;
		
		System.out.println(articulo1.nombre + " - Precio:" + articulo1.precio + "€ - IVA:" + articulo1.iva + "% - PVP:" + (articulo1.precio += articulo1.precio*articulo1.iva/100) + "€");
	}

}