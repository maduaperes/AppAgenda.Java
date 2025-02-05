package model;

import controller.InfoReuniao;
import controller.Reuniao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InfoReuniaoDAO {
    private DAO dao = new DAO();

    public boolean inserirInfoReuniao(InfoReuniao infoReuniao) {
        try {
            Connection conexao = dao.conectar();

            //Preparar a execução da query SQL
            PreparedStatement novasInfosReuniao = conexao.prepareStatement("INSERT INTO infoReuniao (idfkCont, idfkReuniao) " +
                    "VALUES (?, ?);");
            novasInfosReuniao.setInt(1, infoReuniao.getIdfkCont());
            novasInfosReuniao.setInt(2, infoReuniao.getIdfkReuniao());

            int rowsAffected = novasInfosReuniao.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
