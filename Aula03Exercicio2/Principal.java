package Aula03Exercicio2;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        // Criando 2 pacientes distintos
        Paciente p1 = new Paciente("Ana Silva", "(11) 98765-4321");
        Paciente p2 = new Paciente("Carlos Souza", "(21) 91234-5678");

        // Criando as 2 consultas
        Consulta c1 = new Consulta(p1, LocalDate.of(2026, 8, 20), 250.00);
        Consulta c2 = new Consulta(p2, LocalDate.of(2026, 8, 22), 300.00);

        // Exibindo os comprovantes
        c1.exibirComprovante();
        c2.exibirComprovante();
    }
}