package DAO;

import DTO.FuncionarioDTO;
import DTO.ServicoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServicoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ServicoDTO> lista = new ArrayList<>();

    public ArrayList<ServicoDTO> PesquisarServico() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "select * from servico";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ServicoDTO objservicodto = new ServicoDTO();
                objservicodto.setId_servico(rs.getInt("id"));
                objservicodto.setDescricao_servico(rs.getString("descricao"));
                objservicodto.setValor_servico(rs.getDouble("valor"));
                objservicodto.setObservacao_servico(rs.getString("observacao"));
                lista.add(objservicodto);
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ServicoDAO nao foi possível listar!" + e);
        }
        return lista;
    }

    public ResultSet criarServico(ServicoDTO objservicodto) {

        conn = new ConexaoDB().ConectaDB();

        try {

            String sql = "insert into servico (descricao, valor, observacao) values (?,?,?);";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objservicodto.getDescricao_servico());
            pstm.setDouble(2, objservicodto.getValor_servico());
            pstm.setString(3, objservicodto.getObservacao_servico());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar serviço" + e);
        }
        return null;
    }
    
    public void EditarServico(ServicoDTO objservicodto){
        conn = new ConexaoDB().ConectaDB();
        String sql = "update servico set descricao = ? , valor = ?, observacao = ? where id = ?";
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objservicodto.getDescricao_servico());
            pstm.setDouble(2, objservicodto.getValor_servico());
            pstm.setString(3, objservicodto.getObservacao_servico());
            pstm.setInt(4, objservicodto.getId_servico());
            
            pstm.executeUpdate();
            pstm.close();
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar servicos! " + e);
        }
        
    }
    
    public void excluirServico(ServicoDTO objservicodto){
        conn = new ConexaoDB().ConectaDB();
        String sql = "delete from servico where id = ?";
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objservicodto.getId_servico());
            pstm.executeUpdate();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ServicoDAO não foi possível excluir o Servico!" + e);
        }
        
    }
    
}
