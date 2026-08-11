package Praticas;

public class Aluno {
        String nome;
        int idade;
        String curso;
    // método
    void apresentarDados () {
        System.out.println("Nome do Aluno:" + nome + "\nIdade:" + idade + "\nCurso:" + curso);
    }



    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Augusto";
        a1.idade = 20;
        a1.curso = "Sistemas de Informação";
        
        Aluno a2 = new Aluno(); 
        a2.nome = "Zé";
        a2.idade = 19;
        a2.curso = "Sistemas de Informação";

        a1.apresentarDados();
        System.out.println();
        a2.apresentarDados();
    }

}