package com.dio.me.desafios.bancoDigitalJava;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta " + conta.getNumero() + " adicionada ao banco.");
    }

    public void listarContas() {
        System.out.println("Lista de contas:");
        for (Conta conta : contas) {
            System.out.println("Número: " + conta.getNumero() + " | Saldo: R$" + conta.getSaldo());
        }
    }
}
