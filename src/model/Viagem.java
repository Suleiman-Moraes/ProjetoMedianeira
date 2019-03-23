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
    public String[] desmaterializar() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String[] linha = new String[16];
                
        linha[0] = (getId() + "");
        linha[1] = (format.format(getDataSaida()));
        linha[2] = (getDe());
        linha[3] = (getAte());
        
        if(getTurno()) linha[4] = ("Manhã");
        else linha[4] = ("Noite");
        
        linha[5] = ("R$"+getValor());
        linha[6] = (getMotorista().getNome());
        linha[7] = (getMotorista().getLocalizacao());
        linha[8] = (getMotorista().getCnh());
        linha[9] = (getOnibus().getNumero()+ "");
        linha[10] = (getOnibus().getAno());
        linha[11] = (getOnibus().getModelo().getMarca());
        linha[12] = (getOnibus().getModelo().getModelo());
        linha[13] = (getOnibus().getModelo().getGeracao());
        linha[14] = (getOnibus().getModelo().getTipo());
        linha[15] = (getOnibus().getModelo().getPoltrona() + "");
        return linha;
    }
}
