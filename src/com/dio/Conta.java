package com.dio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected BigDecimal saldo = BigDecimal.ZERO;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(BigDecimal valor) {
		saldo = saldo.subtract(valor).setScale(2, RoundingMode.HALF_UP);
	}

	@Override
	public void depositar(BigDecimal valor) {
		saldo = saldo.add(valor).setScale(2, RoundingMode.HALF_UP);
	}

	@Override
	public void transferir(BigDecimal valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: R$ " + this.saldo);
	}
}