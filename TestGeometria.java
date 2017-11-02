/** Programa que calcula
 * el área de los objetos
 * @author Julio Navarro
 * @version 1.0
 */

import java.util.Scanner;

public class TestGeometria {

	public static void main (String [] args) {
		
		System.out.println("\nIntroduzca la longitud de los lados de un cuadrado para calcular su area \n");

		System.out.println("Valor del lado");
		Scanner in = new Scanner (System.in);
		double lado = in.nextDouble();
		
		double resultadoCuadrado = Geometria.areaDeCuadrado (lado);
		System.out.println("El area del cuadrado es: " + 
				resultadoCuadrado + " m\u00B2");
		
		
		System.out.println("\n\nIntroduzca la longitud de los lados de un triangulo para calcular su area \n");

		System.out.println("Valor de la base:");
		double base = in.nextDouble();
		System.out.println("Valor de la altura:");
		double altura = in.nextDouble();
		
		double resultadoTriangulo = Geometria.areaDeTriangulo (base, altura);
		System.out.println("El area del triangulo es: " +
				 resultadoTriangulo + " m\u00B2");

	
		System.out.println("\n\nIntroduzca la longitud de los lados de un rectangulo para calcular su area\n");	

		System.out.println("Valor de la base:");
		double baseRectangulo = in.nextDouble();
		System.out.println("Valor de la altura:");
		double alturaRectangulo = in.nextDouble();
		
		double resultadoRectangulo = Geometria.areaDeRectangulo (baseRectangulo, alturaRectangulo);
		System.out.println("El area del rectangulo es: " +
				 resultadoRectangulo + " m\u00B2");



		System.out.println("\n\nIntroduzca la longitud del radio de un circulo para calcular su area\n");	

		System.out.println("Valor del radio:");
		double radio = in.nextDouble();
		
		double resultadoCirculo = Geometria.areaDeCirculo(radio);
		System.out.println("El area del circulo es: " + 
				resultadoCirculo + " m\u00B2");


	}

}

