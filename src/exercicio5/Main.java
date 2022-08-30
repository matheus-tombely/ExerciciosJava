package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner leitor = new Scanner (System.in);
            Aluno aluno = new Aluno();

        System.out.println("Cadastrar novo Aluno:");
        System.out.println("");

        System.out.println("Número Matricula:");
        aluno.setMatricula(leitor.nextInt());

        System.out.println("Nome aluno:");
        aluno.setNome(leitor.next());

        System.out.println("Mensalidade:");
        aluno.setMensalidade(leitor.nextDouble());

        System.out.print("Número matrícula: ");
        System.out.print(aluno.getMatricula());
        System.out.println();
        System.out.print("Nome do aluno: ");
        System.out.print(aluno.getNome());
        System.out.println();
        System.out.print("Mensalidade do aluno: ");
        System.out.print(aluno.getMensalidade());

    }
}
