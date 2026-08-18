package Aula03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Cliente cliente;
    List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }


    void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.nome + " adicionado ao pedido.");
    }

    double calcularTotal() {
        double total = 0.0;
        for (Produto p : produtos) {
            total += p.preco;
        }
        return total;
    }

    void exibirResumo() {
        System.out.println("\n RESUMO DO PEDIDO ");
        cliente.exibirCliente();
        System.out.println("Itens:");
        for (Produto p : produtos) {
            System.out.println(" - " + p.nome + ": R$ " + p.preco);
        }
        System.out.println("TOTAL: R$ " + calcularTotal());
    }
}