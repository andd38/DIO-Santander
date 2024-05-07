package A_anatomiadeClasses;
public class MinhaPrimeiraClasse {
    public static void main(String[] args) {

        String Primeironome = "andre";
        String segundoNome = "mourao";

        String nomeCOmpleto = nomeCompleto(Primeironome,segundoNome);
        System.out.println(nomeCOmpleto);

    }

    public static  String nomeCompleto(String primeiroNome, String segundoNome){

        return primeiroNome.concat(" ").concat(segundoNome);

    }


}
