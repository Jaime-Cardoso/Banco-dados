package org.example.Entities;

public abstract class Conta {

    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido.");
        }
    }
}
