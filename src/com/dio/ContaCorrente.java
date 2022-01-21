package com.dio;

public class ContaCorrente extends Conta {

	static final double LIMITE = 1000.00;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("== Extrato Conta Corrente ==");
		super.imprimirInfosComuns();
		System.out.println(String.format("Limite: R$ %.2f\n", ContaCorrente.LIMITE + saldo));
	}
}