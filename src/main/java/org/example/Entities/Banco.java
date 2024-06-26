package org.example.Entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarContaPorCpf(String cpf) {
        for (Conta conta : contas) {
            if (conta.getCliente().getCpf().equals(cpf)) {
                return conta;
            }
        }
        return null;
    }
}
