package Models;

import java.util.Date;

   abstract class PessoaModels {

    protected int id;
    protected String nome;
    protected String dataNascimento;
    protected String cpf;
    protected enum sexo {
        fem, mas;
    }
    
    PessoaModels (int id, String nome, String cpf, String dataNascimento){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    //-------->GET & SET<--------
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     
    
}
