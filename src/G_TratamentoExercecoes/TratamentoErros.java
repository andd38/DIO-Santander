package G_TratamentoExercecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoErros {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome ");
            String nome = sc.next();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite a sua idade");
            int idade = sc.nextInt();

            System.out.println("Digite a sua altura: ");
            Double altura = sc.nextDouble();

            System.out.println("Ola me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho "+ idade + " anos");
            System.out.println("Minha altura é "+ altura + " cm ");
            sc.close();
        }

        catch (InputMismatchException e){
            System.out.println("os campos idade e altura precisam ser numericos ");
        }

    }
}
