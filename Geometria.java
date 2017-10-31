public class Geometria {

	public static final double PI = 3.14;

	public static double areaDeCuadrado (double lado) {
		return lado * lado;
	}

	public static double areaDeTriangulo (double base, double altura) {
		return (base * altura) / 2;
	}

	public static double areaDeRectangulo (double base, double altura) {
		return base * altura;
	}

	public static double areaDeCirculo (double radio) {
		return radio * radio * PI;
	}

}
