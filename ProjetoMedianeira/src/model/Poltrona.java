package model;

import java.util.ArrayList;
import java.util.List;

public class Poltrona {
    private Viagem viagem;
    private List<Boolean> listaPoltrona;

    public Poltrona() {}
    public Poltrona(Viagem viagem, List<Boolean> listaPoltrona) {
        this.viagem = viagem;
        this.listaPoltrona = listaPoltrona;
    }
    public Poltrona(Viagem viagem, int poltrona) {
        this.viagem = viagem;
        this.listaPoltrona = new ArrayList<>(viagem.getOnibus().getModelo().getPoltrona());
        this.listaPoltrona.set(poltrona, Boolean.TRUE);
    }
    public Poltrona(Poltrona poltrona) {
        this.viagem = poltrona.viagem;
        this.listaPoltrona = poltrona.listaPoltrona;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public List<Boolean> getListaPoltrona() {
        return listaPoltrona;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public void setListaPoltrona(List<Boolean> listaPoltrona) {
        this.listaPoltrona = listaPoltrona;
    }
}
