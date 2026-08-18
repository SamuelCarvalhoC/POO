package Aula03Ex03;

public class Livro {
    String titulo;
    Autor autor; 
    int ano;
    boolean emprestado;

    public Livro(String titulo, Autor autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false; 
    }

    void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }

    void emprestar() {
        if (emprestado == true) {
            System.out.println("Não foi possível emprestar: O livro '" + titulo + "' já está emprestado!");
        } else {
            emprestado = true;
            System.out.println("Empréstimo realizado com sucesso: '" + titulo + "'");
        }
    }
}

