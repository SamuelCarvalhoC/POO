package Aula03Exercicio2;

import java.time.LocalDate;

public class Consulta {
    Paciente paciente;
    LocalDate data; 
    double valor;
    Consulta(Paciente nome, LocalDate data, double valor){
        this.paciente = nome;
        this.data = data;
        this.valor = valor;
    }
    void exibirComprovante(){
        System.out.println("Paciente" + paciente + "\nValor da consulta: R$" + valor
           + "\n Data da consulta: " + data);
        
    }


}
