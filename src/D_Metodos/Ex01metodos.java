package D_Metodos;

public class Ex01metodos {

    private boolean ligada;
    private int canal;
    private  int volume;

    public Ex01metodos(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public Ex01metodos() {
    }

    public boolean isLigada() {
        return ligada;
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

    public String aumentarVolume(){
        if(this.ligada == false){
            return "nao é possivel aumentar o volume";
        }
        return "voce aumentou o volume para : "+ volume++;
    }
    public String diminuirVolume(){
       if(this.ligada == false){
           return "voce nao pode dimuir o volume";
       }
       return "voce diminuiu o volume para" + this.volume--;
    }

    public boolean Ligar(){
        return true;
    }
    public boolean desligar(){
        return false;
    }

    public int mudarCanal(int numCanal){
        return numCanal;
    }
    public String  mudarCanal(){
        if(this.ligada == true){
            return "voce nao pode mudar de canal";
        }
        return "voce mudou de canal para "+ canal++;
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
