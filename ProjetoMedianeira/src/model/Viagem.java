package model;

import interfaces.IDesmaterializar;
import interfaces.IOrdenacao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Viagem implements IOrdenacao<Viagem>, IDesmaterializar{
    //Atributos
    protected Date dataSaida;
    protected boolean turno;
    protected String de;
    protected String ate;
    protected Onibus onibus;
    protected Motorista motorista;
    protected int id;
    protected float valor;

    //Construtor
    public Viagem() {}
    public Viagem(Date dataSaida, boolean turno, String de, String ate, Onibus onibus, Motorista motorista, int id, float valor) {
        this.dataSaida = dataSaida;
        this.turno = turno;
        this.de = de;
        this.ate = ate;
        this.onibus = onibus;
        this.motorista = motorista;
        this.id = id;
        this.valor = valor;
    }
    public Viagem(Viagem objeto) {
        this.dataSaida = objeto.dataSaida;
        this.turno = objeto.turno;
        this.de = objeto.de;
        this.ate = objeto.ate;
        this.onibus = objeto.onibus;
        this.motorista = objeto.motorista;
        this.id = objeto.id;
        this.valor = objeto.valor;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public void set(Viagem t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atributoIndentificador() throws Exception {
        return this.getId() + "";
    }

    @Override
    public String atributoDescricao_Nome() throws Exception {
        return this.getDe();
    }

    @Override
    public Vector<String> desmaterializar() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Vector<String> linha = new Vector();
                
        linha.add(getId() + "");
        linha.add(format.format(getDataSaida()));
        linha.add(getDe());
        linha.add(getAte());
        if(getTurno())
            linha.add("Manhã");
        else linha.add("Noite");
        linha.add("R$"+getValor());
        linha.add(getMotorista().getNome());
        linha.add(getMotorista().getLocalizacao());
        linha.add(getMotorista().getCnh());
        linha.add(getOnibus().getNumero()+ "");
        linha.add(getOnibus().getAno());
        linha.add(getOnibus().getModelo().getMarca());
        linha.add(getOnibus().getModelo().getModelo());
        linha.add(getOnibus().getModelo().getGeracao());
        linha.add(getOnibus().getModelo().getTipo());
        linha.add(getOnibus().getModelo().getPoltrona() + "");
        return linha;
    }
}
