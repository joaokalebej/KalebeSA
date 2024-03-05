package DAO;

import DTO.AgendaDTO;
import DTO.ClienteDTO;
import DTO.ServicoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AgendaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AgendaDTO> lista = new ArrayList<>();

    public ArrayList<AgendaDTO> PesquisarAgendamento() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "select * from agendamento;";
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                AgendaDTO objagendadto = new AgendaDTO();
                objagendadto.setId_agenda(rs.getInt("id"));
                objagendadto.setValor_agenda(rs.getDouble("valor"));
                objagendadto.setData_agenda(rs.getString("DataAgenda"));
                objagendadto.setObservacao_agenda(rs.getString("observacao"));
                objagendadto.setOpcaoCliente_agenda(rs.getString("cliente"));
                objagendadto.setOpcaoServico_agenda(rs.getString("servico"));
                objagendadto.setHora_agenda(rs.getString("hora"));

                lista.add(objagendadto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os agendamentos! " + e);
        }
        return lista;
    }

    public void EditarAgendamento(AgendaDTO objagendadto){
        conn = new ConexaoDB().ConectaDB();
        String sql = "update agendamento set valor = ?, dataAgenda = ?, observacao = ?, cliente = ?, servico = ?, hora = ? where id = ?";
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, objagendadto.getValor_agenda());
            pstm.setString(2, objagendadto.getData_agenda());
            pstm.setString(3, objagendadto.getObservacao_agenda());
            pstm.setString(4, objagendadto.getOpcaoCliente_agenda());
            pstm.setString(5, objagendadto.getOpcaoServico_agenda());
            pstm.setString(6, objagendadto.getObservacao_agenda());
            pstm.setInt(7, objagendadto.getId_agenda());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "AgendaDAO não foi possível editar o agendamento!" + e);
        }
    }
    
    public ResultSet criarAgendamento(AgendaDTO objagendadto) {
        conn = new ConexaoDB().ConectaDB();
        try {
            String sql = "insert into agendamento (valor, dataAgenda, observacao, cliente, servico, hora) values (?,?,?,?,?,?);";
            pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, objagendadto.getValor_agenda());
            pstm.setString(2, objagendadto.getData_agenda());
            pstm.setString(3, objagendadto.getObservacao_agenda());
            pstm.setString(4, objagendadto.getOpcaoCliente_agenda());
            pstm.setString(5, objagendadto.getOpcaoServico_agenda());
            pstm.setString(6, objagendadto.getHora_agenda());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Agendamento criado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível criar o agendamento! " + e);
        }
        return null;
    }

        public void ExcluirAgendamento(AgendaDTO objagendadto){
            conn = new ConexaoDB().ConectaDB();
            String sql = "delete from agendamento where id = ?";
            
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, objagendadto.getId_agenda());
                pstm.executeUpdate();
                pstm.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"AgendaDAO não foi possível excluir este agendamento! " + e);
            }   
        }
    
    public ResultSet listarClientes() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "select id, nome from clientes order by nome;";
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Listar clientes em AgendaDAO " + e);
            return null;
        }

    }

    public ResultSet listarServico() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "select id, descricao from servico order by descricao;";
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Listar serviço em AgendaDAO " + e);
            return null;
        }

    }

}
