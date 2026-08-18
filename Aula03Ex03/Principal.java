package Aula03Ex03;


public class Principal {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Autor autor2 = new Autor("J. R. R. Tolkien", "Britânica");

        Livro livro1 = new Livro("Dom Casmurro", autor1, 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", autor1, 1881);
        Livro livro3 = new Livro("O Senhor dos Anéis", autor2, 1954);

        livro1.emprestar();

        livro1.emprestar();

        System.out.println("\n=== ACERVO DA BIBLIOTECA ===");
        livro1.exibirFicha();
        livro2.exibirFicha();
        livro3.exibirFicha();
    }
}