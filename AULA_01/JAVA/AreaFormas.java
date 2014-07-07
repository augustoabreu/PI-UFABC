/* AreaFormas.java
 * Implementação de algoritmo para cálculo da
 * área e volume de diferentes formas geométricas
 * Entrada: dimensões da forma
 * Saída: área ou volume
 *
 * Author: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
*/

/* Ex. 05: Area e Volume das Formas
 * Complete o código a seguir para, capturar a dimensão de diferentes formas 
 * e retornar a área ou volume dela (dependendo da forma).
 * É interessante, antes de escrever o código, 
 * escrevar um breve passo a passo do que será feito, em forma de comentários.
 * Nesse código isso ainda não foi feito! Mas já foi dado um exemplo para o retângulo.
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

public class AreaFormas{
	public static void main( String[] args ){
		double area, volume;    // todas as formas podem utilizar essas variáveis
		double altura, largura; // declare as variaveis a serem utilizadas
		double PI;
		PI = 3.14159265359f;

		Scanner leitor = new Scanner(System.in); 
		System.out.println( "Entre com a altura do retângulo: " ); // escreva pedindo a altura
		altura = leitor.nextDouble();
		System.out.println( "Entre com a largura do retângulo: " ); // escreva pedindo a largura
		largura = leitor.nextDouble();

		area = altura*largura;
		System.out.println( "Area do retângulo é " + area ); // mostra o resultado

		// triângulo
		System.out.println( "Entre com a altura do triângulo: " ); // solicita altura triangulo
		altura = leitor.nextDouble();
		System.out.println( "Entre com a base do triângulo: " ); // solicita base
		largura = leitor.nextDouble(); // Recebe a base na variável 'largura'

		area = ( largura * altura ) / 2;
		System.out.println( "Área do triângulo: " + area );

		// circunferência
		System.out.println( "Entre com o raio da circunferência: " ); // Solicita o raio da circunferência
		altura = leitor.nextDouble(); // Recebe o raio na variável 'altura'

		area = altura * PI;
		System.out.println( "Área da circunferência: " + area ); // Imprime área da circunferência

		// Cubo
		System.out.println( "Entre com o tamanho da aresta do cubo: " ); // Solicita o tamanho da aresta
		altura = leitor.nextDouble(); // Recebe o tamanho da aresta na variável 'altura'

		area = Math.pow( altura, 2 ) * 6;
		volume = Math.pow( altura, 3 );
		System.out.println( "Área do cubo: " + area );
		System.out.println( "Volume do cubo: " + volume );

		// Esfera
		System.out.println( "Entre com o raio da esfera: " );
		altura = leitor.nextDouble(); // Recebe o raio na variável 'altura'

		area = 4 * PI * Math.pow( altura, 2 );
		volume = ( 4/3 ) * PI * Math.pow( altura, 3 );
		System.out.println( "Área da esfera: " + area );
		System.out.println( "Volume da esfera: " + volume );

		// Pirâmide
		System.out.println( "Entre com o lado da base da pirâmide quadrada: " );
		largura = leitor.nextDouble(); // Recebe a base na variável 'largura'
		System.out.println( "Entre com a altura dos triângulos laterais da pirâmide: " );
		altura = leitor.nextDouble(); // Recebe a altura dos triângulos laterais

		area = Math.pow( largura, 2 ) + 4 * ( largura * altura / 2 );
		volume = ( Math.pow( largura, 2 ) * altura ) / 3;
		System.out.println( "Área da pirâmide: " + area );
		System.out.println( "Volume da pirâmide: " + volume );
	}
}
