package persistencia;

import interfaces.ICrudDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Passagem;
import model.Poltrona;
import model.Viagem;

public class PassagemDao implements ICrudDao<Passagem>{

    @Override
    public void inserir(Passagem t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "INSERT INTO passagem (nome, cpf, numero_poltrona, id_viagem) VALUES(?,?,?,?)";
        
        new PoltronaDao().inserir(new Poltrona(t, t.getNumeroPlotrona()));
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, t.getNome());
        ps.setString(2, t.getCpf());
        ps.setInt(3, t.getNumeroPlotrona());
        ps.setInt(4, t.getId());
        ps.execute();
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();

        String sql = "DELETE FROM passagem WHERE numero_poltrona=? AND id_viagem=?;";
        
        new PoltronaDao().deletar(object);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ps.setInt(2, (int) object[1]);
        ps.execute();
    }

    @Deprecated
    @Override
    public void alterar(Passagem t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Passagem visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM passagem WHERE numero_poltrona=? AND id_viagem=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ps.setInt(2, (int) object[1]);
        ResultSet rs = ps.executeQuery();
        
        Viagem viagem = new ViagemDao().visualizarUm((int) object[1]);
        
        Passagem passagem = new Passagem(viagem);
        while (rs.next()) {
            passagem.setNome(rs.getString("nome"));
            passagem.setCpf(rs.getString("cpf"));
            passagem.setNumeroPlotrona(rs.getInt("numero_poltrona"));
        }
        return passagem;
    }

    @Override
    public List<Passagem> visualizarAll() throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM passagem ORDER BY id_viagem;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<Passagem> lista = new ArrayList<>();
        
        while (rs.next()) {
            Viagem viagem = new ViagemDao().visualizarUm(rs.getInt("id_viagem"));
            Passagem passagem = new Passagem(viagem);
            
            passagem.setNome(rs.getString("nome"));
            passagem.setCpf(rs.getString("cpf"));
            passagem.setNumeroPlotrona(rs.getInt("numero_poltrona"));
            lista.add(passagem);
        }
        return lista;
    }
    
}
