import java.util.ArrayList;
 
public class Banco {
 
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    private int proximoNumero = 1; // o banco quem controla a numeração
 
    // abre a conta e devolve o número gerado
    int criarConta(String nome, String cpf, String dataNasc) {
        Titular titular = new Titular(nome, cpf, dataNasc);
        ContaBancaria conta = new ContaBancaria(proximoNumero, titular);
        contas.add(conta);
 
        System.out.println("Conta criada! Número: " + proximoNumero);
        int numeroGerado = proximoNumero;
        proximoNumero++;
        return numeroGerado;
    }
 
    // procura a conta pelo número; devolve null se não achar
    private ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
 
    void sacar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada.");
        } else {
            conta.sacar(valor);
        }
    }
 
    void depositar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada.");
        } else {
            conta.depositar(valor);
        }
    }
 
    void consultarSaldo(int numero) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada.");
        } else {
            conta.exibirSaldo();
        }
    }
 
    void verExtrato(int numero) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada.");
        } else {
            conta.exibirExtrato();
        }
    }
 
    void aplicarRendimento(int numero, double percentual) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada.");
        } else {
            conta.aplicarRendimento(percentual);
        }
    }
 
    void transferir(int numeroOrigem, int numeroDestino, double valor) {
        if (numeroOrigem == numeroDestino) {
            System.out.println("Não é possível transferir de uma conta para ela mesma.");
            return;
        }
 
        ContaBancaria origem = buscarConta(numeroOrigem);
        ContaBancaria destino = buscarConta(numeroDestino);
 
        if (origem == null || destino == null) {
            System.out.println("Conta de origem ou destino não encontrada.");
            return;
        }
 
        // reaproveita o sacar() da própria conta (com tarifa e validação)
        double saldoAntes = origem.getSaldo();
        origem.sacar(valor);
 
        // só deposita no destino se o saque realmente aconteceu
        if (origem.getSaldo() < saldoAntes) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " da conta " + numeroOrigem
                    + " para a conta " + numeroDestino);
        }
    }
 
    void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (ContaBancaria conta : contas) {
                System.out.println("Conta " + conta.getNumero() + " - " + conta.getTitular().getNome()
                        + " - Saldo: R$ " + conta.getSaldo());
            }
        }
    }
}
