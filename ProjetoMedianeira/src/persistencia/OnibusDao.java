package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Onibus;

public class OnibusDao implements ICrudDao<Onibus>{

    @Override
    public void inserir(Onibus t) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "INSERT INTO onibus (numero, ano, modelo) VALUES (?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(2, t.getAno());
        ps.setString(1, t.getNumero());
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

        String sql = "DELETE FROM onibus WHERE numero=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, (String) object[0]);
//        ps.setInt(2, (int ) numero[0]); 
        ps.execute();
    }

    @Override
    public void alterar(Onibus t) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "UPDATE onibus SET ano=?, modelo=? WHERE numero=?;";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(2, t.getModelo().getId());
        ps.setString(1, t.getAno());
        ps.setString(3, t.getNumero());
        
        ps.executeUpdate();
    }

    @Override
    public Onibus visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "SELECT * FROM onibus WHERE numero=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, (String) object[0]);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            return new Onibus(rs.getString("numero"), rs.getString("ano"), new ModeloDao().visualizarUm(rs.getInt("modelo")));
        }
        return null;
    }

    @Override
    public List<Onibus> visualizarAll() throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "SELECT * FROM onibus ORDER BY numero;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        List<Onibus> lista = new ArrayList<>();
        while (rs.next()) {
           lista.add( new Onibus(rs.getString("numero"), rs.getString("ano"), 
            new ModeloDao().visualizarUm(rs.getInt("modelo"))));
        }
        return lista;
    }
    
    public boolean existe(String numero) throws SQLException{
        Connection con = util.Conexao.getConexao();

        String sql = "SELECT count(numero) as qtde FROM onibus WHERE numero=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, numero);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            if(rs.getInt("qtde") > 0) return true;
            else return false;
        }
        return false;
    }
}
