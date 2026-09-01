import java.util.Scanner;
 
public class Principal {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;
 
        do {
            System.out.println("\n--- MENU DO BANCO ---");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
 
            switch (opcao) {
                case 1:
                    sc.nextLine(); // limpa o "enter" que sobrou no buffer
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Data de nascimento: ");
                    String data = sc.nextLine();
                    banco.criarConta(nome, cpf, data);
                    break;
 
                case 2:
                    System.out.print("Número da conta: ");
                    int numeroSaque = sc.nextInt();
                    System.out.print("Valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    banco.sacar(numeroSaque, valorSaque);
                    break;
 
                case 3:
                    System.out.print("Número da conta: ");
                    int numeroDeposito = sc.nextInt();
                    System.out.print("Valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    banco.depositar(numeroDeposito, valorDeposito);
                    break;
 
                case 4:
                    System.out.print("Conta de origem: ");
                    int origem = sc.nextInt();
                    System.out.print("Conta de destino: ");
                    int destino = sc.nextInt();
                    System.out.print("Valor da transferência: ");
                    double valorTransf = sc.nextDouble();
                    banco.transferir(origem, destino, valorTransf);
                    break;
 
                case 5:
                    System.out.print("Número da conta: ");
                    int numeroSaldo = sc.nextInt();
                    banco.consultarSaldo(numeroSaldo);
                    break;
 
                case 6:
                    System.out.print("Número da conta: ");
                    int numeroExtrato = sc.nextInt();
                    banco.verExtrato(numeroExtrato);
                    break;
 
                case 7:
                    System.out.print("Número da conta: ");
                    int numeroRendimento = sc.nextInt();
                    System.out.print("Percentual: ");
                    double percentual = sc.nextDouble();
                    banco.aplicarRendimento(numeroRendimento, percentual);
                    break;
 
                case 8:
                    banco.listarContas();
                    break;
 
                case 0:
                    System.out.println("Saindo...");
                    break;
 
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
 
        } while (opcao != 0);
 
        sc.close();
    }
}
 
