/* Ex. 04: DeathStar.java
 * Dado o centro (cx, cy) e o raio (r) de duas circunfer�ncias
 * determinar se elas formam uma Estrela da Morte
 *
 * Um objeto tem chances de ser uma Estrela da Morte se:
 * - um dos raios � 10x maior que o outro
 * - o contorno da circunfer�ncia menor encontra-se 
 *   a pelo menos duas unidades da maior.
 *
 * Verifique se um dado objeto tem chance de ser
 * uma estrela da morte. Que a for�a esteja com voc�.
 *
 * Dica: estude geometria.
 *
 * Entrada:  cx1, cy1, r1, cx2, cy2, r2 (double)
 * Sa�da:  Chame o Luke!
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class DeathStar{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    double cx1, cy1, r1, cx2, cy2, r2;
    System.out.println("Entre com as coordenadas do centro e o raio da circunfer�ncia maior: ");
    cx1 = leitor.nextDouble();
    cy1 = leitor.nextDouble();
    r1 = leitor.nextDouble();
    
    System.out.println("Entre com as coordenadas do centro e o raio da circunfer�ncia menor: ");
    cx2 = leitor.nextDouble();
    cy2 = leitor.nextDouble();
    r2 = leitor.nextDouble();


	}
}

