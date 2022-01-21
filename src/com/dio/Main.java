package com.dio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Faz a leitura do banner que está dentro do arquivo: banner.txt
		LeitorBanner banner = new LeitorBanner();
		banner.lerBanner();
		
		Scanner leitor = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.print("Digite o nome do titular: ");
		cliente.setNome(leitor.nextLine());

		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		// escolha entre conta corrente (CC) ou conta poupança (CI)
		String tipoConta;
		System.out.print("Escolha qual o tipo de conta (CC ou CI): ");
		tipoConta = leitor.nextLine();

		switch (tipoConta) {
		case "CC":
			System.out.print("Quanto quer depositar?: ");
			corrente.depositar(leitor.nextDouble());
			System.out.println();
			corrente.imprimirExtrato();
			poupanca.imprimirExtrato();
			break;
		case "CI":
			System.out.print("Quanto quer depositar?: ");
			poupanca.depositar(leitor.nextDouble());
			System.out.println();
			corrente.imprimirExtrato();
			poupanca.imprimirExtrato();
			break;
		default : 
			System.out.println("Voce digitou errado! Inicie novamente.");
		}

		leitor.close();
	}
}