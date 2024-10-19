package thiago.cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Cadastro {

    public static void cliente(String nome, String sexo, String telefone) {
        if (nome == null || sexo == null || telefone == null) {
            throw new NullPointerException();
        }
        nome = nome.trim();
        sexo = sexo.trim().substring(0, 1).toUpperCase();
        telefone = telefone.trim();
        
        Connection conn;
        conn = BD.getConnection();
        if (conn == null) {
            return;
        }
        PreparedStatement insert;
        try {
            insert = conn.prepareStatement(
                "INSERT INTO cliente(nome, sexo, telefone) VALUES (?, ?, ?)"
            );
            
            if (insert == null) {
                return;
            }
            
            insert.setString(1, nome);
            insert.setString(2, sexo);
            insert.setString(3, telefone);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao preparar Statement", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            insert.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao inserir cliente", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro do cliente", JOptionPane.INFORMATION_MESSAGE);
        
        try {
            insert.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao fechar o Statement", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao fechar a conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void produto(Produto produto) {
        Connection conn;
        conn = BD.getConnection();
        if (conn == null) {
            return;
        }
        PreparedStatement insert;
        try {
            insert = conn.prepareStatement(
                "INSERT INTO produto("
                        + "caracteristica,"
                        + "categoria,"
                        + "cidade,"
                        + "codigo,"
                        + "descricao,"
                        + "dt_fabricacao,"
                        + "dt_validade,"
                        + "estado,"
                        + "estoque,"
                        + "fabricante,"
                        + "fornecedor,"
                        + "nome,"
                        + "pais,"
                        + "peso,"
                        + "preco_custo,"
                        + "preco_venda,"
                        + "rua,"
                        + "unidade,"
                        + "unidade_peso) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            
            if (insert == null) {
                return;
            }
            
            insert.setString(1, produto.caracteristica);
            insert.setString(2, produto.caracteristica);
            insert.setString(3, produto.caracteristica);
            insert.setString(4, produto.caracteristica);
            insert.setString(5, produto.caracteristica);
            insert.setString(6, produto.caracteristica);
            insert.setString(7, produto.caracteristica);
            insert.setString(8, produto.caracteristica);
            insert.setString(9, produto.caracteristica);
            insert.setString(10, produto.caracteristica);
            insert.setString(11, produto.caracteristica);
            insert.setString(12, produto.caracteristica);
            insert.setString(13, produto.caracteristica);
            insert.setString(14, produto.caracteristica);
            insert.setString(15, produto.caracteristica);
            insert.setString(16, produto.caracteristica);
            insert.setString(17, produto.caracteristica);
            insert.setString(18, produto.caracteristica);
            insert.setString(19, produto.caracteristica);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao preparar Statement", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            insert.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao inserir cliente", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro do cliente", JOptionPane.INFORMATION_MESSAGE);
        
        try {
            insert.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao fechar o Statement", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha ao fechar a conexão com o banco de dados", JOptionPane.ERROR_MESSAGE);
        }
    }
}
