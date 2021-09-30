package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Cria��o da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.depositar(500);
		contaMaria.tipo = "Corrente";

		// Cria��o da conta do Pedro
		Conta contaPedro = new Conta("6532-9");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.depositar(200);
		contaPedro.tipo = "Poupan�a";

		// Cria��o da conta da Ana
		Conta contaAna = new Conta("6148-8");
		contaAna.titular = "Ana J�lia";
		contaAna.numeroAgencia = "4214-9";
		contaAna.depositar(2000);
		contaAna.tipo = "Poupan�a";

		// Exibir os detalhes da conta da Maria
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();

		System.out.println();
		System.out.println("____________________________________");
		System.out.println();

		// Depositar 100 reais na conta da Maria
		contaMaria.depositar(200);
		contaMaria.exibirDetalhes();

		System.out.println();
		System.out.println("____________________________________");
		System.out.println();

		// Saque de 100 reais na conta da Maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();

		System.out.println();
		System.out.println("_________Transferindo_________");
		System.out.println();

		// Transferencia de 200 reais de Maria para Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();

	}

}
