package areaCasa;

import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int larguraComodo, comprimentoComodo, areaComodo, areaCasa;
		
		String resposta = "S", nomeComodo;
		
		System.out.println("---------------------------");
		System.out.println("Calculo de �rea de uma casa");
		System.out.println("---------------------------");
		System.out.println();
		
		System.out.print("Qual o nome do c�modo? ");
		nomeComodo = leitor.next();
		
		System.out.print("Qual a largura? ");
		larguraComodo = leitor.nextInt();
		
		System.out.print("Qual o comprimento? ");
		comprimentoComodo = leitor.nextInt();
		
		areaComodo = larguraComodo * comprimentoComodo;
		areaCasa = areaComodo;
		
		System.out.println("O c�modo " + nomeComodo + " tem " + areaComodo + " metros quadrados");
		
		System.out.println();
		
		System.out.print("Voc� deseja calcular mais c�modos (S/N)? ");
		resposta = leitor.next();
		
		while (resposta.equals("S")){
			
			System.out.print("Qual o nome do c�modo? ");
			nomeComodo = leitor.next();
			
			System.out.print("Qual a largura? ");
			larguraComodo = leitor.nextInt();
			
			System.out.print("Qual o comprimento? ");
			comprimentoComodo = leitor.nextInt();
			
			areaComodo = larguraComodo * comprimentoComodo;
			areaCasa = areaComodo;
			
			System.out.println("O c�modo " + nomeComodo + " tem " + areaComodo + " metros quadrados");
			
			System.out.println();
			
			System.out.print("Voc� deseja calcular mais c�modos (S/N)? ");
			resposta = leitor.next();
			
			areaCasa++;
		}
		
		leitor.close();
		
		System.out.println("A �rea total da casa � " + areaCasa + " metros quadrados");
	}

}
