package model;

import java.util.List;

public class Modelo {
    //Atributos
    private String marca;
    private String geracao;
    private String modelo;
    private String tipo;
    private List<Boolean> poltrona;
    
    //Construtor
    public Modelo() {}
    public Modelo(String marca, String geracao, String modelo, String tipo, List<Boolean> poltrona) {
        this.marca = marca;
        this.geracao = geracao;
        this.modelo = modelo;
        this.tipo = tipo;
        this.poltrona = poltrona;
    }
    public Modelo(Modelo objeto) {
        this.marca = objeto.marca;
        this.geracao = objeto.geracao;
        this.modelo = objeto.modelo;
        this.tipo = objeto.tipo;
        this.poltrona = objeto.poltrona;
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
    public List<Boolean> getListaPoltrona() {
        return poltrona;
    }
    public boolean getPoltrona(int num) {
        return poltrona.get(num);
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
    public void setPoltrona(List<Boolean> poltrona) {
        this.poltrona = poltrona;
    }
    public void setPoltrona(int num) {
        this.poltrona.set(num, Boolean.TRUE);
    }
    public void setPoltrona(int num, boolean estado) {
        this.poltrona.set(num, estado);
    }
}
