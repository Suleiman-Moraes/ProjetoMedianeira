package enun;
public enum Legenda {
    MODELO("CadastroModelo", "Visualização de Modelo", "Modelo", "apresentacao.cadastro."),
    MOTORISTA("CadastroMotorista", "Visualização de Motorista", "Motorista", "apresentacao.cadastro."),
    ONIBUS("CadastroOnibus", "Visualização de Ônibus", "Ônibus", "apresentacao.cadastro."),
    VIAGEM("CadastroViagem", "Visualização de Viagem", "Viagem", "apresentacao.cadastro."),
    VIAGENS("VendaPassagem", "Visualização de Viagens", "Viagem", "apresentacao.venda."),
    PASSAGEM("VendaPassagem", "Visualização de Passagem", "Passagem", "apresentacao.venda.");
    
    private String classe;
    private String tituloGrid;
    private String nomeGrid;
    private String pacote;

    private Legenda(String classe, String tituloGrid, String nomeGrid, String pacote) {
        this.classe = classe;
        this.tituloGrid = tituloGrid;
        this.nomeGrid = nomeGrid;
        this.pacote = pacote;
    }

    public String getClasse() {
        return classe;
    }

    public String getTituloGrid() {
        return tituloGrid;
    }

    public String getNomeGrid() {
        return nomeGrid;
    }

    public String getPacote() {
        return pacote;
    }
}
