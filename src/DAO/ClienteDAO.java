package DAO;

import DTO.ClienteDTO;
import DTO.FuncionarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();

    public ResultSet criarCliente(ClienteDTO objclientedto) {

        conn = new ConexaoDB().ConectaDB();

        try {

            String sql = "insert into clientes (nome, cpf, dataNasc, email, telefone, carro, sexo) values (?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_clientes());
            pstm.setString(2, objclientedto.getCpf_clientes());
            pstm.setString(3, objclientedto.getDataNasc_clientes());
            pstm.setString(4, objclientedto.getEmail_clientes());
            pstm.setString(5, objclientedto.getTelefone_clientes());
            pstm.setString(6, objclientedto.getCarro_clientes());
            pstm.setString(7, objclientedto.getSexo_clientes());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente criado com sucesso!");
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO, erro ao criar cliente" + e);
        }
        return null;
    }

    public void editarCliente(ClienteDTO objclientedto){
        conn = new ConexaoDB().ConectaDB();
        String sql = "update clientes set nome = ?, cpf = ?, dataNasc = ?, email = ?, telefone = ?, carro = ?, sexo = ? where id = ?";
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_clientes());
            pstm.setString(2, objclientedto.getCpf_clientes());
            pstm.setString(3, objclientedto.getDataNasc_clientes());
            pstm.setString(4, objclientedto.getEmail_clientes());
            pstm.setString(5, objclientedto.getTelefone_clientes());
            pstm.setString(6, objclientedto.getCarro_clientes());
            pstm.setString(7, objclientedto.getSexo_clientes());
            pstm.setInt(8, objclientedto.getId_clientes());
            
            pstm.executeUpdate();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO não foi possível Editar Cliente!" + e);
        }
        
    }
    
    public void ExcluirCliente(ClienteDTO objclientedto){
        conn = new ConexaoDB().ConectaDB();
        String sql = "delete from clientes where id = ?";
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objclientedto.getId_clientes());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO não foi possível excluir Cliente!" + e);
        }
    }
    
    public ResultSet listarSexo() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "Select * from sexo ORDER by genero;";
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ListarSexo em Funcionario DAO" + e);
            return null;
        }
    }

    public ArrayList<ClienteDTO> PesquisarClientes() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "select * from clientes;";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ClienteDTO objclientedto = new ClienteDTO();
                objclientedto.setId_clientes(rs.getInt("id"));
                objclientedto.setNome_clientes(rs.getString("nome"));
                objclientedto.setCpf_clientes(rs.getString("cpf"));
                objclientedto.setDataNasc_clientes(rs.getString("dataNasc"));
                objclientedto.setEmail_clientes(rs.getString("email"));
                objclientedto.setTelefone_clientes(rs.getString("telefone"));
                objclientedto.setCarro_clientes(rs.getString("carro"));
                objclientedto.setSexo_clientes(rs.getString("sexo"));
                
                lista.add(objclientedto);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar cliente! " + e);
        }
        return lista;
    }

}
