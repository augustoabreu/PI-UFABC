/* IdadeSegundos.java
 * Implementação de algoritmo para cálculo da
 * idade do usuário em segundos
 * Entrada: int idade
 * Saída: int segundos
 *
 * Author: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

/* Ex. 04: Idade em Segundos
 * Complete o código a seguir para, dada a idade do usuário em anos 
 * converter para o equivalente em segundos.
 * É interessante, antes de escrever o código, 
 * escrevar um breve passo a passo do que será feito, em forma de comentários.
 * Nesse código isso já foi feito para você!
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

public class IdadeSegundos{
	public static void main( String[] args ){
		// declare as variaveis a serem utilizadas
		int i, s;
		// escreva pedindo para o usuário entrar com sua idade
		System.out.println("Insira sua idade: ");

		// capture a idade dele
		Scanner idade = new Scanner(System.in);
		i = idade.nextInt();

		// calcule essa idade em segundos
		s = i * 365 * 24 * 60 * 60;

		// Faça melhorias para aumentar a precisão da resposta

		
		// imprima na tela
		System.out.println("Sua idade em segundos: " + s).
		
	}
}
