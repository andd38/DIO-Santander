package F_EstruturasRepeticao;

public class Aula01 {

    public static void main(String[] args) {

        String alunos[] = {
                "Andre", "Fulano1","Fulano2","Fulano3","Fulano4","Fulano5","Fulano6"
        };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
        for (String alu: alunos) {
            System.out.println(alu);
        }
    }

}
