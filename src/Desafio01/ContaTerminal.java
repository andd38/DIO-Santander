package Desafio01;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor digite o seu nome: \n");
        String name = sc.next();

        System.out.println("Digite o numero da agencia: \n");
        int numero = sc.nextInt();

        System.out.println("Digite a agencia : \n");
        String agencia = sc.next();

        System.out.println("Digite o seu saldo: \n");
        double saldo =sc.nextDouble();

        ContaBanco contaBanco = new ContaBanco(numero,agencia,name,saldo);

        sc.close();

        System.out.println("olá "+ name + ", obrigado por criar uma conta em nosso banco , " +
                "sua agencia é: " + agencia+ ", sua conta é :"+numero +" e seu saldo é : " + saldo +"Já está disponível para saque");


    }
}
