package interfaces;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import model.Viagem;

public interface ITabelaViagem {
    
    default Vector[] preencherTabela(Vector cabecalho, Vector detalhe) throws Exception {
        try {
            cabecalho = new Vector();
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
            
            detalhe = new Vector();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Iterator<Viagem> lista = listaViagem();
            while(lista.hasNext()){
                Viagem viagem = lista.next();
                Vector<String> linha = new Vector();
                
                linha.add(viagem.getId() + "");
                linha.add(format.format(viagem.getDataSaida()));
                linha.add(viagem.getDe());
                linha.add(viagem.getAte());
                if(viagem.getTurno())
                    linha.add("Manhã");
                else linha.add("Noite");
                linha.add("R$"+viagem.getValor());
                linha.add(viagem.getMotorista().getNome());
                linha.add(viagem.getMotorista().getLocalizacao());
                linha.add(viagem.getMotorista().getCnh());
                linha.add(viagem.getOnibus().getNumero()+ "");
                linha.add(viagem.getOnibus().getAno());
                linha.add(viagem.getOnibus().getModelo().getMarca());
                linha.add(viagem.getOnibus().getModelo().getModelo());
                linha.add(viagem.getOnibus().getModelo().getGeracao());
                linha.add(viagem.getOnibus().getModelo().getTipo());
                linha.add(viagem.getOnibus().getModelo().getPoltrona() + "");
                
                detalhe.add(linha);
            }
        } catch (Exception e) {
            throw e;
        }finally{
            Vector[] vet = new Vector[2];
            vet[0] = cabecalho;
            vet[1] = detalhe;
            return vet;
        }   
    }
    
    Iterator<Viagem> listaViagem()throws SQLException;
}
