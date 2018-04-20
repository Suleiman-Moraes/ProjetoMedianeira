package model;

import java.sql.Date;

public class Passagem extends Viagem{
    //Atributos
    private String nome;
    private String cpf;
    private int numeroPlotrona;

    //Construtor
    public Passagem() {}
    public Passagem(String nome, String cpf, int numeroPlotrona, Date dataSaida, 
            boolean turno, String de, String ate, Onibus onibus, Motorista motorista, int id, float valor) {
        super(dataSaida, turno, de, ate, onibus, motorista, id, valor);
        this.nome = nome;
        this.cpf = cpf;
        this.numeroPlotrona = numeroPlotrona;
    }
    public Passagem(String nome, String cpf, int numeroPlotrona) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroPlotrona = numeroPlotrona;
    }
    public Passagem(String nome, String cpf, int numeroPlotrona, Viagem objeto) {
        super(objeto);
        this.nome = nome;
        this.cpf = cpf;
        this.numeroPlotrona = numeroPlotrona;
    }
    public Passagem(Passagem objeto) {
        super(objeto);
        this.nome = objeto.nome;
        this.cpf = objeto.cpf;
        this.numeroPlotrona = objeto.numeroPlotrona;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumeroPlotrona(int numeroPlotrona) {
        this.numeroPlotrona = numeroPlotrona;
    }
}
