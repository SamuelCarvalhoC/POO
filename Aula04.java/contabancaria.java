import java.util.ArrayList;
 
public class ContaBancaria {
 
    // 1. todos os atributos private (a "porta dos fundos" fechada)
    private int numero;
    private Titular titular;
    private double saldo;
    private ArrayList<Double> movimentacoes = new ArrayList<>();
 
    // construtor normal: toda conta nasce com saldo 0
    ContaBancaria(int numero, Titular titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }
 
    // DESAFIO da parte 1: construtor com saldo inicial, recusando valor negativo
    ContaBancaria(int numero, Titular titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
 
        if (saldoInicial < 0) {
            System.out.println("Saldo inicial inválido, conta criada com R$ 0.00");
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }
 
    // 2. getters
    public int getNumero() {
        return numero;
    }
 
    public Titular getTitular() {
        return titular;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    // DESAFIO da parte 2: em vez de um contador separado, o número de
    // operações é sempre o tamanho da lista de movimentações
    public int getOperacoes() {
        return movimentacoes.size();
    }
 
    // 3. setter com validação -> quem valida o nome é o próprio Titular
    public void setTitular(String novoNome) {
        titular.setNome(novoNome);
    }
 
    // 4. repare que NÃO existe setSaldo()! o saldo só muda por depositar(),
    // sacar() e aplicarRendimento() (as regras de negócio da conta)
 
    void exibirExtrato() {
        for (Double mov : movimentacoes) {
            System.out.println("\nMovimentacao: " + mov);
        }
    }
 
    double totalDepositado() {
        double valorTotal = 0.0;
        for (Double mov : movimentacoes) {
            if (mov > 0) {
                valorTotal += mov;
            }
        }
        return valorTotal;
    }
 
    double maiorSaque() {
        double maior = 0.0; // 0 = "ainda não teve saque"
        for (Double mov : movimentacoes) {
            if (mov < 0 && mov < maior) {
                maior = mov;
            }
        }
        return maior;
    }
 
    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido na conta de " + titular.getNome() + ": R$ " + valor);
        } else {
            saldo = saldo + valor;
            movimentacoes.add(valor);
            System.out.println("Depósito de R$ " + valor + " na conta de " + titular.getNome());
        }
    }
 
    void sacar(double valor) {
        double custo = valor + 0.50;
        if (custo > saldo) {
            System.out.println("Saldo insuficiente na conta de " + titular.getNome()
                    + ": saque R$ " + valor + " mais tarifa, saldo R$ " + saldo);
        } else {
            saldo = saldo - custo;
            movimentacoes.add(valor * -1);
            System.out.println("Saque de R$ " + valor + " (tarifa R$ 0.5) na conta de " + titular.getNome());
        }
    }
 
    void aplicarRendimento(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido: " + percentual);
        } else {
            saldo = saldo + saldo * percentual / 100;
            System.out.println("Rendimento de " + percentual + "% na conta de " + titular.getNome());
        }
    }
 
    void exibirSaldo() {
        System.out.println("Conta " + numero + " de " + titular.getNome() + ": R$ " + saldo
                + " em " + movimentacoes.size() + " transações");
    }
}
 
