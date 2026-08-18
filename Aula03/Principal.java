package Aula03;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samuel", "samuel@email.com");

        Produto p1 = new Produto("Teclado Mecânico", 250.0);
        Produto p2 = new Produto("Mouse Gamer", 150.0);
        Produto p3 = new Produto("Mousepad Extra Grande", 80.0);

        Pedido pedido1 = new Pedido(cliente1);

        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);
        pedido1.adicionarProduto(p3);

        pedido1.exibirResumo();
    }
}