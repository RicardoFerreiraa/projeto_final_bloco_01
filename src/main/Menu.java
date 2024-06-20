package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);

		int opcao =0;

		while(true) {

			System.out.println("                GERENCIAMENTO DE ESTOQUE             ");
			System.out.println("                      E-commerce                     ");
			System.out.println("|***************************************************|");
			System.out.println("|                                                   |");
			System.out.println("|            1 - Adicionar produtos                 |");
			System.out.println("|            2 - Listar todos os produtos           |");
			System.out.println("|            3 - Buscar produtos por número         |");
			System.out.println("|            4 - Deletar produtos                   |");
			System.out.println("|            5 - Sair                               |");
			System.out.println("|                                                   |");
			System.out.println("|***************************************************|");
			System.out.println("           Entre com a opção desejada: ");

			try {
				opcao=sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println(" Digite uma opção válida! ");
				sc.nextLine();
			}

			if (opcao == 5) {
				System.out.println("\n Programa Finalizado! ");
				sobre();
				sc.close();
				System.exit(0);
				
			}

			switch (opcao) {
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			default:
				System.out.println("\n Opção inválida!");
				break;				
			}
		}
	}
	public static void sobre() {
		System.out.println("|*************************************************************|");
		System.out.println("|Projeto Desenvolvido por:                                    |");
		System.out.println("|Ricardo S. Ferreira                                          |");
		System.out.println("|github.com/ricardoferreiraa                                  |");
		System.out.println("|*************************************************************|");
	}

}
