package H_Debugging;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []alunos = {"camila", "Lucas", "Bruna", "Pedro"};

        int media = calculaMediaDaTurma(alunos,sc);

        System.out.printf("Média da turma %d", media);

    }
    public static int calculaMediaDaTurma(String[] alunos, Scanner sc){

        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = sc.nextInt();
            soma += nota;

        }
        return  soma/alunos.length;

    }




}
