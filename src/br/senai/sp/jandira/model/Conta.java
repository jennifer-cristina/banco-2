package br.senai.sp.jandira.model;

public class Conta {

	public String tipo;
	private String numero;
	public String titular;
	public String numeroAgencia;
	private double saldo;

	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Depóisto não realizado! Valores menor que R$ 0,00 não são aceitos");
		} else {
			saldo += valorDeposito;
		}
	}

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
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);

	}

}
