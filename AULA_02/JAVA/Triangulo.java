/* Triangulo.java
 * Dada as tr�s dimens�es de um tri�ngulo
 * determinar se � realmente um tri�ngulo e qual tipo ele �
 * Entrada: x,y,z (double)
 * Sa�da:  se � tri�ngulo e qual tipo
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */



import java.util.Scanner;

class Triangulo{
	public static void main(String[] args) {
		double x, y, z; 
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Forne�a as 3 dimens�es: ");
		x = leitor.nextDouble();
		y = leitor.nextDouble();
		z = leitor.nextDouble();

		if( x+y>z && x+z>y && y+z>x ){
			if( x==y && y==z ){
				System.out.println("Equilatero");
			}else if( x==y || y==z || x==z ){
				System.out.println("Is�celes");
			}else{
				System.out.println("Escaleno");
			}
		}else{
			System.out.println("N�o � um tri�ngulo");
		}

	}
}

