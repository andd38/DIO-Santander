package Desafio02.Candidatura;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
      /* analisarCanditado(1900.0);
       analisarCanditado(2200.0);
       analisarCanditado(2000.0);*/

    //selecaoCanditado();
    //imprimirSelecionados();
        String [] canditados = {"Felipe", "marcia", "Julia ","Paulo","augusto"};
        for(String candidato: canditados){
            entrandoEmcontato(candidato);
        }

    }

    static void entrandoEmcontato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTetando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTetando = !atendeu;
            if(continuarTetando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado");
        }while (continuarTetando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("Conseguimos contato com "+ candidato+ " Na " + tentativasRealizadas);
        else
            System.out.println("Nao conseguimos contato com "+ candidato+ ", numero maximo tentativas "+ tentativasRealizadas+ "Realizada");
    }

    static boolean atender(){
        return new Random().nextInt(3) ==1;
    }

    static void imprimirSelecionados(){
        String [] canditados = {"Felipe", "marcia", "Julia ","Paulo","augusto"};
        for(String candidato: canditados){
            System.out.println("Forma abreviada de interação com for " + candidato);
        }

        for (int i = 0; i < canditados.length ; i++) {
            System.out.println(canditados[i]);
        }

    }
    static void selecaoCanditado(){
        String [] canditados = {"Felipe", "marcia", "Julia ","Paulo","augusto",
                "monica","fabricio","mirela","daniela","jorge"};
        int canditadosSelecionados = 0;
        int canditadosAtual = 0;
        double salarioBase = 2000.0;
        while(canditadosSelecionados<5 && canditadosAtual < canditados.length){
            String canditado = canditados[canditadosAtual];
            double salarioPretendido = valorPrentendido() ;

            System.out.println("O canditado "+ canditado+ " Solicitou este valor de salario "+ String.format("2.%f",salarioPretendido));

            if(salarioBase>= salarioPretendido){
                System.out.println("O canditado " + canditado + "foi selecionado para a vaga ");
                canditadosSelecionados++;
            }
            canditadosAtual++;
        }
    }

    static  double valorPrentendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCanditado(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase> salarioPretendido){
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Aguardando demais candidatos");
        } else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }


}
