package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private Cliente cliente;
	private Agencia agencia;
	private double saldo;
	
	// Método construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	//
	public void setTipo(TipoConta tipo){
		this.tipo = tipo;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	// Agência 
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia setAgencia() {
		return this.agencia;
	}
	
	//
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	//
	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Depóisto não realizado! Valores menor que R$ 0,00 não são aceitos");
		} else {
			saldo += valorDeposito;
		}
	}

	//
	public boolean sacar(double valorSaque) {
		if (valorSaque <= 0) {
			System.out.println("Saque não realizado! Valores menor que R$ 0,00 não são aceitos");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente!!");
			return false;
		} else {
			saldo -= valorSaque;
			return true;
		}
	}

	//
	public void transferir(Conta contaDestino, double valorTransferencia) {
       boolean resultado = sacar(valorTransferencia);
       if (resultado) {
    	   contaDestino.depositar(valorTransferencia);
       }else {
    	   System.out.println("Não foi possível efetuar a transferência");
       }
       
	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("____________________________________");
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia.getNumeroAgencia());
		System.out.printf("Agência: %s\n", agencia.getNomeGerente());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);

	}

}
