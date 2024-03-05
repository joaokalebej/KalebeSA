package DTO;

import java.util.Date;

public class FuncionarioDTO {

    private int id_funcionario;
    private String nome_funcionario;
    private String cpf_fucionario;
    private String dataNasc_funcionario;
    private String email_funcionario;
    private String telefone_funcionario;
    private String senha_funcionario;
    private String cep_funcionario;
    private String endereco_funcionario;
    private String sexo_funcionario;
    private String nivel_acesso;

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    public String getSexo_funcionario() {
        return sexo_funcionario;
    }

    public void setSexo_funcionario(String sexo_funcionario) {
        this.sexo_funcionario = sexo_funcionario;
    }
    
    public String getEndereco_funcionario() {
        return endereco_funcionario;
    }

    public void setEndereco_funcionario(String endereco_funcionario) {
        this.endereco_funcionario = endereco_funcionario;
    }

    public String getCep_funcionario() {
        return cep_funcionario;
    }

    public void setCep_funcionario(String cep_funcionario) {
        this.cep_funcionario = cep_funcionario;
    }

    public String getSenha_funcionario() {
        return senha_funcionario;
    }

    public void setSenha_funcionario(String senha_funcionario) {
        this.senha_funcionario = senha_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public String getCpf_fucionario() {
        return cpf_fucionario;
    }

    public String getDataNasc_funcionario() {
        return dataNasc_funcionario;
    }

    public String getEmail_funcionario() {
        return email_funcionario;
    }

    public String getTelefone_funcionario() {
        return telefone_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public void setCpf_fucionario(String  cpf_fucionario) {
        this.cpf_fucionario = cpf_fucionario;
    }

    public void setDataNasc_funcionario(String dataNasc_funcionario) {
        this.dataNasc_funcionario = dataNasc_funcionario;
    }

    public void setEmail_funcionario(String email_funcionario) {
        this.email_funcionario = email_funcionario;
    }

    public void setTelefone_funcionario(String telefone_funcionario) {
        this.telefone_funcionario = telefone_funcionario;
    }
}
