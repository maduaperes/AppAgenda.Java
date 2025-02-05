package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    //Parametros da conexao
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String enderecoIP = "jdbc:mysql://10.62.55.51:3306/dbAgenda";
    private String usuario = "senac";
    private String senha = "123@senac";

    public Connection conectar() {
        //Objeto a ser usado para a conexao
        Connection conexao = null;

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(enderecoIP, usuario, senha);
            return conexao;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
