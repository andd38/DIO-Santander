package F_EstruturasRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class Aula02While {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada>0){
            Double valorDoce= valorAleatorio();
            if(valorDoce> mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor : "+ valorDoce+" Adcionado no carrinho ");

            mesada = mesada - valorDoce;
        }
        System.out.println("mesada: "+ mesada);
        System.out.println("Joazinho gastou toda a sua mesada em dosces ");

    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }


}
