package areaCasa;

import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double larguraComodo, comprimentoComodo, areaComodo, areaCasa;
		
		String resposta, nomeComodo;
		
		System.out.println("---------------------------");
		System.out.println("Calculo de �rea de uma casa");
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.print("Qual o nome do c�modo? ");
		nomeComodo = leitor.next();
		
		System.out.print("Qual a largura? ");
		larguraComodo = leitor.nextDouble();
		
		System.out.print("Qual o comprimento? ");
		comprimentoComodo = leitor.nextDouble();
		
		areaComodo = larguraComodo * comprimentoComodo;
		
		System.out.println();
		
		System.out.println("O c�modo " + nomeComodo + " tem " + areaComodo + " metros");
		
		System.out.print("Voc� deseja calcular mais c�modos (S/N)? ");
		resposta = leitor.next();
	}

}
