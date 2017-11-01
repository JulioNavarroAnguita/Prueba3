/**
 * Clase que contiene
 * los diferentes métodos
 * para calcular el área
 * de los objetos
 * @author Julio Navarro
 * @version 1.0
 */

public class Geometria {
	
	//declaracion e iniciacion de la constante PI
	public static final double PI = 3.14;
	
	/**
	 * Método que calcula
	 * el área de un cuadrado
	 * @return área de un cuadrado
	 */

	public static double areaDeCuadrado (double lado) {
		return lado * lado;
	}
	
	/**
	 * Método que calcula
	 * el área de un triangulo
	 * @return área de un triangulo
	 */

	public static double areaDeTriangulo (double base, double altura) {
		return (base * altura) / 2;
	}
	
	/**
	 * Método que calcula
	 * el área de un rectangulo
	 * @return área de un rectangulo
	 */

	public static double areaDeRectangulo (double baseRectangulo, double alturaRectangulo) {
		return baseRectangulo * alturaRectangulo;
	}

	/**
	 * Método que calcula
	 * el área de un circulo
	 * @return área de un circulo
	 */

	public static double areaDeCirculo (double radio) {
		return radio * radio * PI;
	}

}
