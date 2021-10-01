package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.setNumeroAgencia("7632-9");
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("----> " + contaMaria.getTipo());
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6532-9");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.setNumeroAgencia("4214-9");
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		
		System.out.println("----> " + contaPedro.getTipo());

		// Criação da conta da Ana
		Conta contaAna = new Conta("6148-8");
		contaAna.titular = "Ana Júlia";
		contaAna.setNumeroAgencia("4214-9"); 
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.POUPANCA);
		
		System.out.println("----> " + contaAna.getTipo());

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
