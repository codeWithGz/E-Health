package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "bdhospital";

    public Connection obtemConexao (){
    try{
        Connection c = DriverManager.getConnection(
        "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?serverTimezone=UTC",
                   usuario,
                senha
        );
        System.out.println("Conexão executada com sucesso!!");
            return c;
    }
    catch (Exception e){
        System.out.println("ERRO de Conexão!!");
        e.printStackTrace();
        return null;
    }
   }
}