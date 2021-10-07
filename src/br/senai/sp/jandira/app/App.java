package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criar a cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("maria@email.com");
		clienteMaria.setSalario(5000);
		
		// Criar a cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@gmail.com");
		clientePedro.setSalario(4000);
		
		// Criar a cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Júlia");
		clienteAna.setEmail("ana@hotmail.com");
		clienteAna.setSalario(10000);
		
		// Criar Agencia 
		Agencia agencia = new Agencia();
		agencia.setNumeroAgencia("7632-9");
		agencia.setNomeGerente("Roberto carlos");
		agencia.setTelefoneAgencia("11 99271-4575");
		agencia.setCidadeAgencia("Itapevi");
		
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("----> " + contaMaria.getTipo());
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6532-9");
		contaPedro.setCliente(clientePedro);
		contaPedro.setAgencia(agencia);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		
		System.out.println("----> " + contaPedro.getTipo());

		// Criação da conta da Ana
		Conta contaAna = new Conta("6148-8");
		contaAna.setCliente(clienteAna);
		contaAna.setAgencia(agencia);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.POUPANCA);
		
		System.out.println("----> " + contaAna.getTipo());

		// Exibir os detalhes das contas
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
