package com.dio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaCorrente extends Conta {

	static final BigDecimal LIMITE = new BigDecimal("1000.00");

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("== Extrato Conta Corrente ==");
		super.imprimirInfosComuns();
		System.out.println("Limite: R$ " + ContaCorrente.LIMITE.add(saldo).setScale(2, RoundingMode.HALF_UP));
	}
}