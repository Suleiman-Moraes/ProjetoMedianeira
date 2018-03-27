package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Motorista;
import model.Onibus;

public class OnibusDao implements ICrudDao<Onibus>{

    @Override
    public void inserir(Onibus t) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "INSERT INTO onibus (numero, ano, modelo) VALUES (?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, (String) t.getAno());
        ps.setString(2, t.getNumero());
        ps.setInt(3, t.getModelo().getId());
        ps.execute();

//        String sql2 = "SELECT currval('modelo_id_seq');";
//        Statement sta = con.createStatement();
//        ResultSet rs = sta.executeQuery(sql2);
//        while(rs.next()){
//            t.setId(rs.getInt(1));
//        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "DELETE FROM onibus WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
//        ps.setInt(2, (int ) numero[0]); 
        ps.execute();
    }

    @Override
    public void alterar(Onibus t) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "UPDATE motorista SET nome=?, localizacao=?, cnh=? WHERE id=?;";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getNumero());
        ps.setString(2, t.getAno());
        ps.setInt(3, t.getModelo().getId());
        ps.executeUpdate();
    }

    @Override
    public Onibus visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "SELECT * FROM motorista WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            return new Onibus(rs.getString("numero"), rs.getString("ano"), rs.getModelo().getId("id"));
        }
        return null;
    }

    @Override
    public List<Onibus> visualizarAll() throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "SELECT * FROM motorista ORDER BY nome;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        List<Motorista> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Motorista(rs.getString("nome"), rs.getString("localizacao"), rs.getString("cnh"), rs.getInt("id")));
        }
        return lista;
    }
}
