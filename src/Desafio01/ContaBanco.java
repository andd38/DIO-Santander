package Desafio01;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nome_CLiente;
    private Double saldo;

    public ContaBanco(int numero, String Agencia, String Nome_CLiente, Double Saldo) {
        this.numero = numero;
        this.agencia= Agencia;
        this.nome_CLiente = Nome_CLiente;
        this.saldo = Saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome_CLiente() {
        return nome_CLiente;
    }

    public void setNome_CLiente(String nome_CLiente) {
        this.nome_CLiente = nome_CLiente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }




}
