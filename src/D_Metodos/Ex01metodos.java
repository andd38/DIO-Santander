package D_Metodos;

public class Ex01metodos {

    private boolean ligada;
    private int canal;
    private int volume;

    public Ex01metodos(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public Ex01metodos() {
    }

    public boolean isLigada() {
        return this.ligada == false;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void aumentarVolume(){
        if(this.ligada == false){
            System.out.println( "nao é possivel aumentar o volume");
        } else {
            System.out.println( "voce aumentou o volume para : "+ volume++);
        }

    }
    public void diminuirVolume(){
       if(this.ligada == false){
           System.out.println( "voce nao pode dimuir o volume");
       } else{
           System.out.println( "voce diminuiu o volume para" + this.volume--);
       }

    }

    public void Ligar(){
        setLigada(true);
        System.out.println("voce ligou a sua televisao");
    }
    public void desligar(){
       setLigada(false);
        System.out.println("voce desligou a sua televisao");

    }

    public int mudarCanal(int numCanal){
        return numCanal;
    }
    public void  mudarCanal(){
        if(this.ligada == false){
            System.out.println( "voce nao pode mudar de canal");
        }
        else {
            System.out.println("voce mudou de canal para "+ canal++);
        }

    }

    @Override
    public String toString() {
        return "Ex01metodos{" +
                "ligada=" + this.ligada +
                ", canal=" + this.canal +
                ", volume=" + this.volume +
                '}';
    }
}
