package D_Metodos;

public class main {

    public static void main(String[] args) {
        Ex01metodos ex01metodos = new Ex01metodos(false,50,50);
        ex01metodos.Ligar();
        ex01metodos.aumentarVolume();
        ex01metodos.desligar();
        ex01metodos.aumentarVolume();

        ex01metodos.mudarCanal();

        ex01metodos.toString();

    }



}
