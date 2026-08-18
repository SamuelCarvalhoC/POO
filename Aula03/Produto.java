package Aula03;

public class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome + " - R$ " + preco);
    }
}