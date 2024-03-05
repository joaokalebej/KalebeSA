package DAO;

import DTO.FuncionarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();

    public ResultSet autenticarLogin(FuncionarioDTO objfuncionariodto) {

        conn = new ConexaoDB().ConectaDB();
        try {
            String sql = "select nome, senha from funcionarios where nome = ? and senha = ?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getSenha_funcionario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO" + e.getMessage());
            return null;
        }
    }

    public ResultSet criarFuncionario(FuncionarioDTO objfuncionariodto) {
        conn = new ConexaoDB().ConectaDB();
        try {
            String sql = "insert into funcionarios (nome, cpf, email, telefone, dataNasc, cep, endereco, sexo, senha, nivelAcess) values (?,?,?,?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getCpf_fucionario());
            pstm.setString(3, objfuncionariodto.getEmail_funcionario());
            pstm.setString(4, objfuncionariodto.getTelefone_funcionario());
            pstm.setString(5, objfuncionariodto.getDataNasc_funcionario());
            pstm.setString(6, objfuncionariodto.getCep_funcionario());
            pstm.setString(7, objfuncionariodto.getEndereco_funcionario());
            pstm.setString(8, objfuncionariodto.getSexo_funcionario());
            pstm.setString(9, objfuncionariodto.getSenha_funcionario());
            pstm.setString(10, objfuncionariodto.getNivel_acesso());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário inserido com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionárioDAO" + "Erro ao inserir funcionário" + erro);
        }
        return null;
    }
    
    public void editarFuncionario(FuncionarioDTO objfuncionariodto){
    
        conn = new ConexaoDB().ConectaDB();
        String sql = "update funcionarios set nome = ?, cpf = ?, email = ?, telefone = ?, dataNasc = ?, cep = ?, endereco = ?, sexo = ?, senha = ?, nivelAcess = ? where id = ?";
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getCpf_fucionario());
            pstm.setString(3, objfuncionariodto.getEmail_funcionario());
            pstm.setString(4, objfuncionariodto.getTelefone_funcionario());
            pstm.setString(5,objfuncionariodto.getDataNasc_funcionario());
            pstm.setString(6, objfuncionariodto.getCep_funcionario());
            pstm.setString(7, objfuncionariodto.getEndereco_funcionario());
            pstm.setString(8, objfuncionariodto.getSexo_funcionario());
            pstm.setString(9, objfuncionariodto.getSenha_funcionario());
            pstm.setString(10, objfuncionariodto.getNivel_acesso());
            pstm.setInt(11, objfuncionariodto.getId_funcionario());
            
            pstm.executeUpdate();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO não foi possível Editar funcionário!" + e);
        }
        
    }
    
    public void excluirFuncionario(FuncionarioDTO objfuncionariodto){
        conn = new ConexaoDB().ConectaDB();
        String sql = "delete from funcionarios where id = ?";
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objfuncionariodto.getId_funcionario());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO não foi possível excluir este funcionário!" + e);
        }
    }
    
    public ArrayList<FuncionarioDTO> PesquisarFuncionario() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "select * from funcionarios;";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
                objfuncionariodto.setId_funcionario(rs.getInt("id"));
                objfuncionariodto.setNome_funcionario(rs.getString("nome"));
                objfuncionariodto.setCpf_fucionario(rs.getString("cpf"));
                objfuncionariodto.setEmail_funcionario(rs.getString("email"));
                objfuncionariodto.setTelefone_funcionario(rs.getString("telefone"));
                objfuncionariodto.setDataNasc_funcionario(rs.getString("dataNasc"));
                objfuncionariodto.setCep_funcionario(rs.getString("cep"));
                objfuncionariodto.setEndereco_funcionario(rs.getString("endereco"));
                objfuncionariodto.setSexo_funcionario(rs.getString("sexo"));
                objfuncionariodto.setSenha_funcionario(rs.getString("senha"));
                objfuncionariodto.setNivel_acesso(rs.getString("nivelAcess"));

                lista.add(objfuncionariodto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Erro ao Pesquisar" + e);
        }
        return lista;
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

    public ResultSet listarCargo() {
        conn = new ConexaoDB().ConectaDB();
        String sql = "SELECT * FROM cargo ORDER BY descricao;";
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ListarCargo em Funcionario DAO" + e);
            return null;
        }
    }

}
