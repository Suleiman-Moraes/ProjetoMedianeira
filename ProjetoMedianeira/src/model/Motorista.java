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
}
