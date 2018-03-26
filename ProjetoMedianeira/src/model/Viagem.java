package model;

import java.sql.Date;

public class Viagem {
    //Atributos
    protected Date dataSaida;
    protected boolean turno;
    protected String de;
    protected String ate;
    protected Onibus onibus;
    protected Motorista motorista;
    protected int id;

    //Construtor
    public Viagem() {}
    public Viagem(Date dataSaida, boolean turno, String de, String ate, Onibus onibus, Motorista motorista, int id) {
        this.dataSaida = dataSaida;
        this.turno = turno;
        this.de = de;
        this.ate = ate;
        this.onibus = onibus;
        this.motorista = motorista;
        this.id = id;
    }
    public Viagem(Viagem objeto) {
        this.dataSaida = objeto.dataSaida;
        this.turno = objeto.turno;
        this.de = objeto.de;
        this.ate = objeto.ate;
        this.onibus = objeto.onibus;
        this.motorista = objeto.motorista;
        this.id = objeto.id;
    }
    
    //Getters e Setters
    public Date getDataSaida() {
        return dataSaida;
    }

    public boolean getTurno() {
        return turno;
    }

    public String getDe() {
        return de;
    }

    public String getAte() {
        return ate;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public void setAte(String ate) {
        this.ate = ate;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
