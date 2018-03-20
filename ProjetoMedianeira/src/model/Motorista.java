package model;
public class Motorista {
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
}
