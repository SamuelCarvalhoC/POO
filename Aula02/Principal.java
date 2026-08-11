package Praticas;

public class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Iphone 15";
        p1.preco = 5000;
        p1.estoque = 10;
        Produto p2 = new Produto();
        p2.nome = "Teclado";
        p2.preco = 100;
        p2.estoque = 50;

        p1.exibirinfo();
        p2.exibirinfo();
        
        p1.vender(1);
        p2.vender(2);
        

    }
}




