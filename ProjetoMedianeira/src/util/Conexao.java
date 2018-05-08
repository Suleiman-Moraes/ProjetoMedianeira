package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static Connection conexao;

    private Conexao() {}
    
    public static Connection getConexao(){
        try {
            if(conexao == null || conexao.isClosed()) conexao = conectar();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return conexao;
    }
    
//    private static Connection conectar() throws ClassNotFoundException, SQLException{
//        try {
//            Class.forName("org.postgresql.Driver");
//            return DriverManager.getConnection("jdbc:postgresql://fernandolimati.com.br:8080/dbsusu", "usersusu", "susu123456");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Não foi encontrada a biblioteca postgres");
//            return null;
//        } catch (SQLException e){
//            System.out.println("Banco/ Usuário/ Senha Estão Incorretos.");
//            return null;
//        } catch (Exception e){return null;}
//    }
    
    private static Connection conectar() throws ClassNotFoundException, SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:8080/medianeira", "postgres", "123456");
        } catch (ClassNotFoundException e) {
            System.out.println("Não foi encontrada a biblioteca postgres");
            return null;
        } catch (SQLException e){
            System.out.println("Banco/ Usuário/ Senha Estão Incorretos.");
            return null;
        } catch (Exception e){return null;}
    }
}
