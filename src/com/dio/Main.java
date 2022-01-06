package com.dio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");
		
		Conta corrente = new ContaCorrente(gabriel);
		Conta poupanca = new ContaPoupanca(gabriel);
		
		//escolha entre conta corrente (CC) ou conta poupança (CI)
		String tipoConta;
		System.out.print("Escolha qual o tipo de conta (CC ou CI): ");
		tipoConta = leitor.nextLine();
		switch (tipoConta) {
			case "cc":
				System.out.print("Quanto quer depositar?: ");
				corrente.depositar(leitor.nextDouble());
				break;
			case "ci":
				System.out.print("Quanto quer depositar?: ");
				poupanca.depositar(leitor.nextDouble());
				break;	
		}
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		leitor.close();
	}
}