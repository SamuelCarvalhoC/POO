package Aula03;

public class Cliente {
    String nome;
    String email;

    Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    void exibirCliente() {
        System.out.println("Cliente: " + nome + " | E-mail: " + email);
    }
}
