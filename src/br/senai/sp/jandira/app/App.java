package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta da Maria
		Conta contaMaria = new Conta();
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numero = "7845-8";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.saldo = 500.0;
		contaMaria.tipo = "Corrente";

		// Criação da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.titular = "Pedro Cabral";
		contaPedro.numero = "6532-9";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.saldo = 200.0;
		contaPedro.tipo = "Poupança";

		// Criação da conta da Ana
		Conta contaAna = new Conta();
		contaAna.titular = "Ana Júlia";
		contaAna.numero = "6148-8";
		contaAna.numeroAgencia = "4214-9";
		contaAna.saldo = 2000.0;
		contaAna.tipo = "Poupança";

		// Exibir os detalhes da conta da Maria
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();

	}

}
