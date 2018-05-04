package model;

import interfaces.IOrdenacao;

public class Modelo implements IOrdenacao<Modelo>{
    //Atributos
    private String marca;
    private String geracao;
    private String modelo;
    private String tipo;
    private int id;
    private int poltrona;
    
    //Construtor
    public Modelo() {}
    public Modelo(String marca, String geracao, String modelo, String tipo, int poltrona, int id) {
        this.marca = marca;
        this.geracao = geracao;
        this.modelo = modelo;
        this.tipo = tipo;
        this.poltrona = poltrona;
        this.id = id;
    }
    public Modelo(Modelo objeto) {
        this.marca = objeto.marca;
        this.geracao = objeto.geracao;
        this.modelo = objeto.modelo;
        this.tipo = objeto.tipo;
        this.poltrona = objeto.poltrona;
        this.id = objeto.id;
    }
    
    //Getters e Setters
    public String getMarca() {
        return marca;
    }
    public String getGeracao() {
        return geracao;
    }
    public String getModelo() {
        return modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public int getPoltrona() {
        return poltrona;
    }
    public int getId() {
        return id;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return marca + " " + geracao + " " + modelo + " " + tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Modelo other = (Modelo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public void set(Modelo t) throws Exception {
        this.marca = t.marca;
        this.geracao = t.geracao;
        this.modelo = t.modelo;
        this.tipo = t.tipo;
        this.poltrona = t.poltrona;
        this.id = t.id;
    }

    @Override
    public String atributoIndentificador() throws Exception {
        return this.getId() + "";
    }

    @Override
    public String atributoDescricao_Nome() throws Exception {
        return this.marca;
    }
}
