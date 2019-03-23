package model;

import interfaces.IDesmaterializar;
import interfaces.IOrdenacao;
import java.util.Vector;

public class Motorista implements IOrdenacao<Motorista>, IDesmaterializar{
    //Atributos
    private String nome;
    private String localizacao;
    private String cnh;
    private int id;
    
    //Construtor
    public Motorista() {}
    public Motorista(String nome, String localizacao, String cnh, int id) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.cnh = cnh;
        this.id = id;
    }
    public Motorista(Motorista objeto) {
        this.nome = objeto.nome;
        this.localizacao = objeto.localizacao;
        this.cnh = objeto.cnh;
        this.id = objeto.id;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public String getCnh() {
        return cnh;
    }
    public int getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome + " de " + localizacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Motorista other = (Motorista) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public void set(Motorista t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atributoIndentificador() throws Exception {
        return this.getId() + "";
    }

    @Override
    public String atributoDescricao_Nome() throws Exception {
        return this.getNome();
    }

    @Override
    public String[] desmaterializar() {
        String[] linha = new String[4];
        
        linha[0] = (getId() + "");
        linha[1] = (getNome());
        linha[2] = (getLocalizacao());
        linha[3] = (getCnh());
        return linha;
    }
}
