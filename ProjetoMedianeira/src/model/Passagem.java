package model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class Passagem extends Viagem {
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
    public Passagem(Passagem passagem, Viagem viagem) {
        super(viagem);
        this.nome = passagem.nome;
        this.cpf = passagem.cpf;
        this.numeroPlotrona = passagem.numeroPlotrona;
    }
    public Passagem(Viagem viagem) {
        super(viagem);
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
    
    @Override
    public String atributoDescricao_Nome() throws Exception {
        return this.getNome();
    }
    
    @Override
    public Vector<String> desmaterializar() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Vector<String> linha = new Vector();
                
        linha.add(getId() + "");
        linha.add(getNome());
        linha.add(getCpf());
        linha.add(getNumeroPlotrona() + "");
        linha.add(format.format(getDataSaida()));
        linha.add(getDe());
        linha.add(getAte());
        if(getTurno())
            linha.add("Manhã");
        else linha.add("Noite");
        linha.add("R$"+getValor());
        linha.add(getMotorista().getNome());
        linha.add(getOnibus().getNumero()+ "");
        linha.add(getOnibus().getModelo().getMarca());
        linha.add(getOnibus().getModelo().getModelo());
        linha.add(getOnibus().getModelo().getGeracao());
        linha.add(getOnibus().getModelo().getTipo());
        return linha;
    }
}
