package org.example;

import org.example.Entities.Banco;
import org.example.Entities.Cliente;
import org.example.Entities.Conta;
import org.example.Entities.ContaCorrente;
import org.example.Entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João Silva", "12345678900");
        Conta conta1 = new ContaCorrente(cliente1);
        banco.adicionarConta(conta1);

        Cliente cliente2 = new Cliente("Maria Oliveira", "09876543211");
        Conta conta2 = new ContaPoupanca(cliente2);
        banco.adicionarConta(conta2);

        conta1.depositar(500);
        conta2.depositar(1000);

        conta1.sacar(100);
        ((ContaPoupanca) conta2).renderJuros();

        conta1.transferir(200, conta2);

        System.out.println("Saldo Conta Corrente: " + conta1.getSaldo());
        System.out.println("Saldo Conta Poupança: " + conta2.getSaldo());
    }
}