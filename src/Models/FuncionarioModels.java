package Models;

import java.util.Date;

public class FuncionarioModels extends PessoaModels {

    public FuncionarioModels(int id, String nome, String cpf, String dataNascimento) {
        super(id, nome, cpf, dataNascimento);
    }

    private enum nivelAcesso {
        adm, porteiro
    }
    
    private String password;
    private String email;
    private String telefone;

    //-------->GET & SET<--------
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
