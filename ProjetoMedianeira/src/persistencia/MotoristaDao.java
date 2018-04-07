package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Motorista;

public class MotoristaDao implements ICrudDao<Motorista>{

    @Override
    public void inserir(Motorista t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "INSERT INTO motorista (nome, localizacao, cnh) VALUES (?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getNome());
        ps.setString(2, t.getLocalizacao());
        ps.setString(3, t.getCnh());
        ps.execute();
        
        String sql2 = "SELECT currval('motorista_id_seq');";
        Statement sta = con.createStatement();
        ResultSet rs = sta.executeQuery(sql2);
        while(rs.next()){
            t.setId(rs.getInt(1));
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "DELETE FROM motorista WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ps.execute();
    }

    @Override
    public void alterar(Motorista t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "UPDATE motorista SET nome=?, localizacao=?, cnh=? WHERE id=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getNome());
        ps.setString(2, t.getLocalizacao());
        ps.setString(3, t.getCnh());
        ps.setInt(4, t.getId());
        ps.executeUpdate();
    }

    @Override
    public Motorista visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM motorista WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            return new Motorista(rs.getString("nome"), rs.getString("localizacao"), rs.getString("cnh"), rs.getInt("id"));
        }
        return null;
    }

    @Override
    public List<Motorista> visualizarAll() throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM motorista ORDER BY id;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<Motorista> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Motorista(rs.getString("nome"), rs.getString("localizacao"), rs.getString("cnh"), rs.getInt("id")));
        }
        return lista;
    }
}
