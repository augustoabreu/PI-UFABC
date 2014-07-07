/* Temperatura.java
 * Implementação de algoritmo para conversão 
 * de temperatura em Celsius para Kelvin e Fahrenheit
 * Entrada: tempCelsius
 * Saída: tempKelvin e tempFahrenheit
 *
 * Author: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

/* Ex. 03: Conversão de Temperatura
 * Complete o código a seguir para, dada uma temperatura em Celsius 
 * converter para o equivalente em Kelvin e Fahrenheit.
 * É interessante, antes de escrever o código, 
 * escrevar um breve passo a passo do que será feito, em forma de comentários.
 * Nesse código isso já foi feito para você!
 *
 * Dica: use double
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

public class Temperatura{
	public static void main( String[] args ){
		// declare as variaveis a serem utilizadas
		double c, f, k;

		// escreva pedindo para o usuário entrar com a temperatura em Celsius
		Scanner temp = new Scanner(System.in);

		System.out.println("Insira a temperatura em ºC: ");
		c = temp.nextDouble();

		// calcule a temperatura em Kelvin
		k = c + 273.15;

		// calcule a temperatura em Fahrenheit 
		f = c * 1.8 + 32;

		// imprima os resultados na tela
		System.out.println(c + "ºC em Kelvin: " + k);
		System.out.println(c + "ºC em Fahrenheit: " + f);

	}
}
