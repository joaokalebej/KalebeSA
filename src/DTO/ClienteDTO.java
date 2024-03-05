package DTO;

public class ClienteDTO {

    private int id_clientes;
    private String nome_clientes;
    private String cpf_clientes;
    private String dataNasc_clientes;
    private String email_clientes;
    private String telefone_clientes;
    private String carro_clientes;
    private String sexo_clientes;

    public String getSexo_clientes() {
        return sexo_clientes;
    }

    public void setSexo_clientes(String sexo_clientes) {
        this.sexo_clientes = sexo_clientes;
    }
    
    public int getId_clientes() {
        return id_clientes;
    }

    public String getNome_clientes() {
        return nome_clientes;
    }

    public String getCpf_clientes() {
        return cpf_clientes;
    }

    public String getDataNasc_clientes() {
        return dataNasc_clientes;
    }

    public String getEmail_clientes() {
        return email_clientes;
    }

    public String getTelefone_clientes() {
        return telefone_clientes;
    }

    public String getCarro_clientes() {
        return carro_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public void setNome_clientes(String nome_clientes) {
        this.nome_clientes = nome_clientes;
    }

    public void setCpf_clientes(String cpf_clientes) {
        this.cpf_clientes = cpf_clientes;
    }

    public void setDataNasc_clientes(String dataNasc_clientes) {
        this.dataNasc_clientes = dataNasc_clientes;
    }

    public void setEmail_clientes(String email_clientes) {
        this.email_clientes = email_clientes;
    }

    public void setTelefone_clientes(String telefone_clientes) {
        this.telefone_clientes = telefone_clientes;
    }

    public void setCarro_clientes(String carro_clientes) {
        this.carro_clientes = carro_clientes;
    }
    
}
