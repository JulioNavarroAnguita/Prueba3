public class TestGeometria {

	public static void main (String [] args) {

		int lado = 15;
		int base = 12;
		int altura = 10;
		int radio = 25;

		double resultadoCuadrado = Geometria.areaDeCuadrado (lado);
		System.out.println("El area del cuadrado es: " + 
				resultadoCuadrado);
		
		double resultadoTriangulo = Geometria.areaDeTriangulo (base, altura);
		System.out.println("El resultado del area del triangulo es: " +
				 resultadoTriangulo);

		double resultadoRectangulo = Geometria.areaDeRectangulo (base, altura);
		System.out.println("El resultado del area del rectangulo es: " +
				 resultadoRectangulo);

		double resultadoCirculo = Geometria.areaDeCirculo(radio);
		System.out.println("El area del circulo es: " + 
				resultadoCirculo);

	}

}

