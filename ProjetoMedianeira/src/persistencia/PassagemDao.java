package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Passagem;
import model.Poltrona;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Passagem> visualizarAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
