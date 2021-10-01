package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	public Cliente titular;
	private String numeroAgencia;
	private double saldo;
	
	// M�todo construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	public void setTipo(TipoConta tipo){
		this.tipo = tipo;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	
	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Dep�isto n�o realizado! Valores menor que R$ 0,00 n�o s�o aceitos");
		} else {
			saldo += valorDeposito;
		}
	}

	public boolean sacar(double valorSaque) {
		if (valorSaque <= 0) {
			System.out.println("Saque n�o realizado! Valores menor que R$ 0,00 n�o s�o aceitos");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente!!");
			return false;
		} else {
			saldo -= valorSaque;
			return true;
		}
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {
       boolean resultado = sacar(valorTransferencia);
       if (resultado) {
    	   contaDestino.depositar(valorTransferencia);
       }else {
    	   System.out.println("N�o foi poss�vel efetuar a transfer�ncia");
       }
       
	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("____________________________________");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);

	}

}
