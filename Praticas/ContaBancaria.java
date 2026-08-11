package Praticas;

public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println(" Saldo atual: R$" + valor );
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + "\nSaldo Atual: R$ " + saldo);
    }


    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Samuel";
        conta1.saldo = 1000;
        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Maria";
        conta2.saldo = 500;

        conta1.exibirSaldo();

    }

}
