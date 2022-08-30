package exercicio5;

import java.util.Scanner;

public class Aluno {

    int matricula;
    String nome;
    double mensalidade;

//Criar Classe exercicio5.Aluno

//Atributos:
//int numMatricula;
//String nomeAluno;
//double vlrMensalidade;

//Criar Classe CadAluno
//Ler os dados;
//Mostrar os dados lidos;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

}
