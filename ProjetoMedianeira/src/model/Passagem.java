package model;

import java.sql.Date;

public class Passagem extends Viagem{
    //Atributos
    private String nome;
    private String cpf;
    private int numeroPlotrona;
    private float valor;

    //Construtor
    public Passagem() {}
    public Passagem(String nome, String cpf, int numeroPlotrona, float valor, Date dataSaida, 
            boolean turno, String de, String ate, Onibus onibus, Motorista motorista, int id) {
        super(dataSaida, turno, de, ate, onibus, motorista, id);
        this.nome = nome;
        this.cpf = cpf;
        this.numeroPlotrona = numeroPlotrona;
        this.valor = valor;
    }
    public Passagem(String nome, String cpf, int numeroPlotrona, float valor) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroPlotrona = numeroPlotrona;
        this.valor = valor;
    }
    public Passagem(String nome, String cpf, int numeroPlotrona, float valor, Viagem objeto) {
        super(objeto);
        this.nome = nome;
        this.cpf = cpf;
        this.numeroPlotrona = numeroPlotrona;
        this.valor = valor;
    }
    public Passagem(Passagem objeto) {
        super(objeto);
        this.nome = objeto.nome;
        this.cpf = objeto.cpf;
        this.numeroPlotrona = objeto.numeroPlotrona;
        this.valor = objeto.valor;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumeroPlotrona() {
        return numeroPlotrona;
    }

    public float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumeroPlotrona(int numeroPlotrona) {
        this.numeroPlotrona = numeroPlotrona;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
