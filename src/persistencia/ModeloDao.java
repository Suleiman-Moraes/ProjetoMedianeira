package persistencia;

import interfaces.ICrudDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Modelo;

public class ModeloDao implements ICrudDao<Modelo>{

    @Override
    public void inserir(Modelo t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "INSERT INTO Modelo (marca, geracao, modelo, tipo, poltronas) VALUES (?,?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getMarca());
        ps.setString(2, t.getGeracao());
        ps.setString(3, t.getModelo());
        ps.setString(4, t.getTipo());
        ps.setInt(5, t.getPoltrona());
        ps.execute();
        
        String sql2 = "SELECT currval('modelo_id_seq');";
        Statement sta = con.createStatement();
        ResultSet rs = sta.executeQuery(sql2);
        while(rs.next()){
            t.setId(rs.getInt(1));
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "DELETE FROM modelo WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ps.execute();
    }

    @Override
    public void alterar(Modelo t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "UPDATE modelo SET marca=?, geracao=?, modelo=?, tipo=?, poltronas=? WHERE id=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getMarca());
        ps.setString(2, t.getGeracao());
        ps.setString(3, t.getModelo());
        ps.setString(4, t.getTipo());
        ps.setInt(5, t.getPoltrona());
        ps.setInt(6, t.getId());
        ps.executeUpdate();
    }

    @Override
    public Modelo visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM modelo WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            return new Modelo(rs.getString("marca"), rs.getString("geracao"), 
                    rs.getString("modelo"), rs.getString("tipo"), rs.getInt("poltronas"), rs.getInt("id"));
        }
        return null;
    }

    @Override
    public List<Modelo> visualizarAll() throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM modelo ORDER BY geracao;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<Modelo> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Modelo(rs.getString("marca"), rs.getString("geracao"), 
                    rs.getString("modelo"), rs.getString("tipo"), rs.getInt("poltronas"), rs.getInt("id")));
        }
        return lista;
    }
    
}
