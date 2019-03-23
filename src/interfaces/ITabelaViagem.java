package interfaces;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import model.Viagem;

public interface ITabelaViagem {
    
    default Object[] preencherTabela() throws Exception {
        Vector cabecalho = new Vector();
        try {
            cabecalho.add("Código");
            cabecalho.add("Data de Saída");
            cabecalho.add("De");
            cabecalho.add("Até");
            cabecalho.add("Turno");
            cabecalho.add("Valor");
            cabecalho.add("Nome do Motorista");
            cabecalho.add("Localização");
            cabecalho.add("CNH");
            cabecalho.add("Número do ônibus");
            cabecalho.add("Ano");
            cabecalho.add("Marca");
            cabecalho.add("Modelo");
            cabecalho.add("Geração");
            cabecalho.add("Tipo");
            cabecalho.add("Poltrona");
            
        } catch (Exception e) {
            throw e;
        }finally{
            Object[] vet = new Object[2];
            vet[0] = cabecalho;
            vet[1] = listaViagem();
            return vet;
        }   
    }
    
    Iterator<Viagem> listaViagem()throws SQLException;
}
