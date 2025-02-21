package com.dio.me.desafios.bancoDigitalJava;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("12345");
        ContaPoupanca cp = new ContaPoupanca("67890");

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(1000);
        cp.depositar(500);

        cc.transferir(cp, 300);

        banco.listarContas();
    }
}
