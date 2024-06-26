package org.example.Entities;

public class ContaCorrente extends Conta{

        private double taxaDeOperacao = 0.10;

        public ContaCorrente(Cliente cliente) {
            super(cliente);
        }

        @Override
        public void sacar(double valor) {
            double valorComTaxa = valor + taxaDeOperacao;
            if (valorComTaxa <= getSaldo()) {
                super.sacar(valorComTaxa);
            } else {
                System.out.println("Saldo insuficiente para saque com taxa de operação.");
            }
        }
    }


