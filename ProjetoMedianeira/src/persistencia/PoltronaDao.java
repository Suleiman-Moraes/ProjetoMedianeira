package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Poltrona;
import model.Viagem;

public class PoltronaDao implements ICrudDao<Poltrona>{
    @Override
    public void inserir(Poltrona t) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "INSERT INTO poltrona (numero, ocupacao, viagem) VALUES (?,?,?)";
        
        for(int i = 0; i < t.getListaPoltrona().size(); i++){
            if(t.getListaPoltrona().get(i)){
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, i);
                ps.setBoolean(2, t.getListaPoltrona().get(i));
                ps.setInt(3, t.getViagem().getId());
                ps.execute();
            }
        }
    }

    @Override
    public void deletar(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "DELETE FROM poltrona WHERE numero=? and viagem=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ps.setInt(1, (int) object[1]);
        ps.execute();
    }
    
    public void deletar(int viagem) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "DELETE FROM poltrona WHERE viagem=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, viagem);
        ps.execute();
    }

    @Deprecated
    @Override
    public void alterar(Poltrona t) throws SQLException {}

    @Override
    public Poltrona visualizarUm(Object... object) throws SQLException {
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM poltrona WHERE viagem=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) object[0]);
        ResultSet rs = ps.executeQuery();
        
        Viagem viagem = new ViagemDao().visualizarUm((int) object[0]);
        
        List<Boolean> lista = new ArrayList<>();
        for (int i = 0; i < viagem.getOnibus().getModelo().getPoltrona(); i++) {
            lista.add(Boolean.FALSE);
        }
        
        while (rs.next()) {
            lista.set(rs.getInt("numero")-1, Boolean.TRUE);
//            for (int i = lista.size(); i < rs.getInt("numero")-1; i++) {
//                if(i == rs.getInt("numero")-2) lista.add(Boolean.TRUE);
//                else lista.add(Boolean.FALSE);
//            }
        }
        Poltrona aux = new Poltrona();
        aux.setViagem(viagem);
        aux.setListaPoltrona(lista);
        return aux;
    }

    @Override
    public List<Poltrona> visualizarAll() throws SQLException {
//        Connection con = util.Conexao.getConexao();
//        
//        String sql = "SELECT * FROM poltrona ORDER BY numero;";
//        PreparedStatement ps = con.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        
//        List<Motorista> lista = new ArrayList<>();
//        while (rs.next()) {
//            lista.add(new Motorista(rs.getString("nome"), rs.getString("localizacao"), rs.getString("cnh"), rs.getInt("id")));
//        }
//        return lista;
        return null;
    }
    
    public int count(int numero, int viagem){
        return 0;
    }
}
