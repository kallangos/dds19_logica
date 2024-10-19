package thiago.cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Atualizar {
    public static void cliente(Cliente cliente) {
        try {
            Connection conn = BD.getConnection();
            PreparedStatement update = conn.prepareStatement("UPDATE cliente SET nome = ?, sexo = ?, telefone = ? WHERE id = ?");
            update.setString(1, cliente.nome);
            update.setString(2, cliente.sexo);
            update.setString(3, cliente.telefone);
            update.setString(4, String.valueOf(cliente.getId()));
            update.executeUpdate();
            update.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        
    }
}
