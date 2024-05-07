package D_Metodos;

public class main {

    public static void main(String[] args) {
        Ex01metodos ex01metodos = new Ex01metodos(true,50,50);
        ex01metodos.Ligar();
        ex01metodos.aumentarVolume();
        ex01metodos.desligar();

        System.out.println(ex01metodos.toString());

    }



}
