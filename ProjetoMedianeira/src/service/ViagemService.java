package service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.Motorista;
import model.Onibus;
import model.Viagem;
import persistencia.ViagemDao;

public class ViagemService implements ICrudService<Viagem> {

    @Override
    public void salvar(Viagem t) throws Exception {
        if (!this.retornarDisponibilidade(t.getMotorista(), t.getDataSaida(), t.getDe())) {
            throw new Exception("Motorista Indisponivel.");
        }
        if (!this.retornarDisponibilidade(t.getOnibus(), t.getDataSaida(), t.getDe())) {
            throw new Exception("Ônibus Indisponivel.");
        }
        if (!this.isDateValid(t.getDataSaida())) {
            throw new Exception("Data Inválida.");
        }
        if (t.getId() > 0) {
            new ViagemDao().alterar(t);
        } else {
            new ViagemDao().inserir(t);
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        new ViagemDao().deletar(object);
    }

    @Override
    public Viagem visualizarUm(Object... object) throws SQLException {
        return new ViagemDao().visualizarUm(object);
    }

    @Override
    public List<Viagem> visualizarAll() throws SQLException {
        return new ViagemDao().visualizarAll();
    }

    public boolean retornarDisponibilidade(Motorista motorista, Date data, String de) throws SQLException {
        if (!de.equals(motorista.getLocalizacao())) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DATE, -1);
        String consulta = " WHERE motorista =" + motorista.getId() + " AND data_saida BETWEEN '"
                + new java.sql.Date(calendar.getTime().getTime());
        calendar.setTime(data);
        calendar.add(Calendar.DATE, 1);
        consulta += "' AND '" + new java.sql.Date(calendar.getTime().getTime()) + "'";
        int x = new ViagemDao().consultaPassandoParametrosCOUNT(consulta);

        if (x > 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean retornarDisponibilidade(Onibus onibus, Date data, String de) throws SQLException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DATE, -1);
        String consulta = " WHERE onibus ='" + onibus.getNumero() + "' AND data_saida ='"
                + new java.sql.Date(data.getTime()) + "';";
        if (new ViagemDao().consultaPassandoParametrosCOUNT(consulta) > 0) {
            return false;
        }

        consulta = "";
        consulta = " WHERE onibus ='" + onibus.getNumero() + "' AND data_saida ='"
                + new java.sql.Date(calendar.getTime().getTime()) + "' AND "
                + "de ='" + de + "';";
        if (new ViagemDao().consultaPassandoParametrosCOUNT(consulta) > 0) {
            return false;
        }

        calendar.setTime(data);
        calendar.add(Calendar.DATE, 1);
        consulta = "";
        consulta = " WHERE onibus ='" + onibus.getNumero() + "' AND data_saida ='"
                + new java.sql.Date(calendar.getTime().getTime()) + "' AND "
                + "de ='" + de + "';";
        if (new ViagemDao().consultaPassandoParametrosCOUNT(consulta) > 0) {
            return false;
        }

        return true;
    }

    public boolean isDateValid(java.util.Date strDate) {
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String data = format.format(strDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern(dateFormat)
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            if (strDate.compareTo(new Date(System.currentTimeMillis())) <= 0) {
                return false;
            }
            LocalDate date = LocalDate.parse(data, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
