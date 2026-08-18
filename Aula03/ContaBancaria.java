package Aula03;

public class ContaBancaria {
    String titular;
    double saldo;
    int operacoes = 0;
    double tarifa = 0;
    double caixinha; 
    
    ContaBancaria(String nome, double saldoInicial) {
        this.titular = nome;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        if (valor >= 0) { //verificar se o valor depositado é maior que zero
            saldo += valor;
            operacoes += 1;
            System.out.println(" Saldo atual: R$" + valor );
        } else {
            System.out.println("Valor de depósito inválido.");

        int_operacoes(0);
        }
    }
    void aplicarRendimento(double percentual){
        if (percentual > 0 && percentual < 100);
           caixinha +=   saldo *= (percentual / 100);
        System.out.println("Titular" + titular + "Aplicação de: " + percentual + "%");

    }
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            operacoes += 1;
            saldo -= 0.5;
            tarifa += 0.5;
        } else {
            System.out.println("Saldo insuficiente!");
        
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + "\nSaldo Atual: R$ " + saldo);
        System.out.println("\nTotal de Operações: " + operacoes);
    }


    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Samuel", 1000);
        ContaBancaria c2 = new ContaBancaria("Maria", 500);
        c2.exibirSaldo();
        c2.aplicarRendimento(50);
    }


    void int_operacoes(int sacar){
        
    }





}