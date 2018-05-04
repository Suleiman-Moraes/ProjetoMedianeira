package model;

import interfaces.IOrdenacao;
import java.util.Objects;

public class Onibus implements IOrdenacao<Onibus>{
    //Atributos
    private String numero;
    private String ano;
    private Modelo modelo;
    
    //Construtor
    public Onibus() {}
    public Onibus(String numero, String ano, Modelo modelo) {
        this.numero = numero;
        this.ano = ano;
        this.modelo = modelo;
    }
    public Onibus(Onibus objeto) {
        this.numero = objeto.numero;
        this.ano = objeto.ano;
        this.modelo = new Modelo(objeto.getModelo());
    }
    
    //Getters e Setters
    public String getNumero() {
        return numero;
    }
    public String getAno() {
        return ano;
    }
    public Modelo getModelo() {
        return modelo;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setModelo(Modelo modelo) {
        this.modelo = new Modelo(modelo);
    }
    
    @Override
    public String toString() {
        return numero +" "+ modelo.getMarca() + " " + modelo.getGeracao() + " " + modelo.getPoltrona() + " Lugares";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.numero);
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
        final Onibus other = (Onibus) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public void set(Onibus t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String atributoIndentificador() throws Exception {
        return this.getNumero();
    }

    @Override
    public String atributoDescricao_Nome() throws Exception {
        return this.getModelo().getMarca();
    }
}
