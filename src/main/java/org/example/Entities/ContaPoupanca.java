package org.example.Entities;
public class ContaPoupanca extends Conta{
        private double taxaDeRendimento = 0.05;

        public ContaPoupanca(Cliente cliente) {
            super(cliente);
        }

        public void renderJuros() {
            double rendimento = getSaldo() * taxaDeRendimento;
            depositar(rendimento);
        }
}
