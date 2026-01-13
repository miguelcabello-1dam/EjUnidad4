package ejparte1;

public class EjercicioB3 {

	public static void main(String[] args) {
		
		ClaseRectangulo rectangulo1 = new ClaseRectangulo(0, 0, 5, 5);
		ClaseRectangulo rectangulo2 = new ClaseRectangulo(7, 9, 2, 3);
		int[] r1 = new int[2];
		int[] r2 = new int[2];
		
		r1[0] = rectangulo1.x1 > rectangulo1.x2 ? rectangulo1.x1 - rectangulo1.x2 : rectangulo1.x2 - rectangulo1.x1;
		r1[1] = rectangulo1.y1 > rectangulo1.y2 ? rectangulo1.y1 - rectangulo1.y2 : rectangulo1.y2 - rectangulo1.y1;
		
		r2[0] = rectangulo2.x1 > rectangulo2.x2 ? rectangulo2.x1 - rectangulo2.x2 : rectangulo2.x2 - rectangulo2.x1;
		r2[1] = rectangulo2.y1 > rectangulo2.y2 ? rectangulo2.y1 - rectangulo2.y2 : rectangulo2.y2 - rectangulo2.y1;
		
		System.out.println("CUADRADO 1");
		System.out.println("Coordenadas: ("+rectangulo1.x1+","+rectangulo1.y1+")("+rectangulo1.x2+","+rectangulo1.y2+")");
		System.out.println("Perimetro: " + (r1[0]*2 + r1[1]*2));
		System.out.println("Area: " + (r1[0]*r1[1]));
		
		System.out.println("=======================");
		
		System.out.println("CUADRADO 2");
		System.out.println("Coordenadas: ("+rectangulo2.x1+","+rectangulo2.y1+")("+rectangulo2.x2+","+rectangulo2.y2+")");
		System.out.println("Perimetro: " + (r2[0]*2 + r2[1]*2));
		System.out.println("Area: " + (r2[0]*r2[1]));
		
	}

}