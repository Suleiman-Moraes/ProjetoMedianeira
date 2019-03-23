package enun;
public enum Legenda {
    MODELO("CadastroModelo", "Visualização de Modelo", "Modelo", "apresentacao.cadastro.", "persistencia.ModeloDao"),
    MOTORISTA("CadastroMotorista", "Visualização de Motorista", "Motorista", "apresentacao.cadastro.", "persistencia.MotoristaDao"),
    ONIBUS("CadastroOnibus", "Visualização de Ônibus", "Ônibus", "apresentacao.cadastro.", "persistencia.OnibusDao"),
    VIAGEM("CadastroViagem", "Visualização de Viagem", "Viagem", "apresentacao.cadastro.", "persistencia.ViagemDao"),
    VIAGENS("VendaPassagem", "Visualização de Viagens", "Viagem", "apresentacao.venda.", "persistencia.ViagemDao"),
    PASSAGEM("VendaPassagem", "Visualização de Passagem", "Passagem", "apresentacao.venda.", "persistencia.PassagemDao");
    
    private String classe;
    private String tituloGrid;
    private String nomeGrid;
    private String pacote;
    private String service;

    private Legenda(String classe, String tituloGrid, String nomeGrid, String pacote, String service) {
        this.classe = classe;
        this.tituloGrid = tituloGrid;
        this.nomeGrid = nomeGrid;
        this.pacote = pacote;
        this.service = service;
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

    public String getService() {
        return service;
    }
}
