package ejparte1;

public class EjercicioB1 {

	public static void main(String[] args) {
		
		ClasePunto punto1 = new ClasePunto(5, 0);
		ClasePunto punto2 = new ClasePunto(10, 10);
		ClasePunto punto3 = new ClasePunto(-3, 7);
		
		System.out.println("(" + punto1.x + "," + punto1.y + ")");
		System.out.println("(" + punto2.x + "," + punto2.y + ")");
		System.out.println("(" + punto3.x + "," + punto3.y + ")");
	}

}