package model;
public class Onibus {
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
}
