package model;

import controller.Contato;
import controller.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnderecoDAO {
    private DAO dao = new DAO();

    public boolean inserirEndereco(Endereco endereco) {
        try {
            Connection conexao = dao.conectar();

            //Preparar a execução da query SQL
            PreparedStatement novoEndereco = conexao.prepareStatement("INSERT INTO endereco " +
                    "(rua, numero, cidade, estado, cep, idfk) VALUES (?, ?, ?, ?, ?, ?);");
            novoEndereco.setString(1, endereco.getRua());
            novoEndereco.setString(2, endereco.getNumero());
            novoEndereco.setString(3, endereco.getCidade());
            novoEndereco.setString(4, endereco.getEstado());
            novoEndereco.setString(5, endereco.getCep());
            novoEndereco.setInt(6, endereco.getIdfk());

            int rowsAffected = novoEndereco.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
