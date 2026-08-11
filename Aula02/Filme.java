package Praticas;

public class Filme {
    String titulo;
    int duracao;
    double nota;
    boolean assistido;
    void exibirFicha(){
        System.out.println("Título:" + titulo + "\nDuração:" + duracao 
        + "\nNota: " + nota + "\nAssistido:" + assistido);
    }
    void marcarAssistido() {
        assistido = true;
    }
    void avaliar(double novaNota) {
        nota = novaNota;
    }


    public static void main(String[] args) {
        Filme f1 = new Filme ();
        f1.titulo = "Odissey";
        f1.nota = 9.5;
        f1.assistido = false;

        Filme f2 = new Filme ();
        f2.titulo = "Dia D";
        f2.nota = 8;
        f2.assistido = true;

        Filme f3 = new Filme ();
        f3.titulo = "O Mentalista";
        f3.nota = 10;
        f3.assistido = true;

        f1.exibirFicha();
        f2.exibirFicha();
        f3.exibirFicha();

    }
}