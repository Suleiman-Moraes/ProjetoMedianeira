package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.Modelo;
import model.Motorista;

public class ModeloDao implements ICrudDao<Modelo>{

    @Override
    public void inserir(Modelo t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "INSERT INTO Modelo (marca, geracao, modelo, tipo) VALUES (?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getMarca());
        ps.setString(2, t.getGeracao());
        ps.setString(3, t.getModelo());
        ps.setString(4, t.getTipo());
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
        
        String sql = "UPDATE modelo SET marca=?, geracao=?, modelo=?, tipo=? WHERE id=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getMarca());
        ps.setString(2, t.getGeracao());
        ps.setString(3, t.getModelo());
        ps.setString(4, t.getTipo());
        ps.setInt(5, t.getId());
        ps.executeUpdate();
    }

    @Override
    public Modelo visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM motorista WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            return new Modelo(rs.getString("nome"), rs.getString("localizacao"), rs.getString("cnh"), rs.getInt("id"));
        }
        return null;
    }

    @Override
    public List<Modelo> visualizarAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
