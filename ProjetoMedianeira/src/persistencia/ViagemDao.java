package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Viagem;

public class ViagemDao implements ICrudDao<Viagem> {

    @Override
    public void inserir(Viagem t) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "INSERT INTO viagem (data_saida, turno, de, ate, id, onibus, motorista) VALUES (?,?,?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);
        //ps.setString(1, t.getDataSaida());
        ps.setBoolean(2, t.getTurno());
        ps.setString(3, t.getDe());
        ps.setString(4, t.getAte());
        ps.setInt(5, t.getId());
        ps.setString(6, t.getOnibus().getNumero());
        ps.setInt(7, t.getMotorista().getId());
        ps.execute();
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "DELETE FROM viagem WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ps.execute();
    }

    @Override
    public void alterar(Viagem t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        String sql = "UPDATE viagem SET data_saida=?, turno=?, de=?, ate=?, id=?, onibus=?, motorista=?, WHERE id=?;";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, new java.sql.Date(t.getDataSaida().getTime()));
        ps.setBoolean(2, t.getTurno());
        ps.setString(3, t.getAte());
        ps.setString(3, t.getDe());
        ps.setString(4, t.getAte());
        ps.setInt(5, t.getId());
        ps.setString(6, t.getOnibus().getNumero());
        ps.setInt(7, t.getMotorista().getId());
        ps.execute();
    }

    @Override
    public Viagem visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "SELECT * FROM viagem WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            return new Viagem(new Date(rs.getDate("data_saida").getTime()), rs.getBoolean("turno"), rs.getString("de"), rs.getString("ate"),
                    new OnibusDao().visualizarUm(rs.getString("onibus")),
                    new MotoristaDao().visualizarUm(rs.getInt("motorista")), rs.getInt("id"));
        }
        return null;
    }

    @Override
    public List<Viagem> visualizarAll() throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "SELECT * FROM viagem ORDER BY id;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        List<Viagem> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Viagem(new Date(rs.getDate("data_saida").getTime()), rs.getBoolean("turno"), rs.getString("de"), rs.getString("ate"),
                    new OnibusDao().visualizarUm(rs.getString("onibus")),
                    new MotoristaDao().visualizarUm(rs.getInt("motorista")), rs.getInt("id")));
        }
        return lista;
    }
}
