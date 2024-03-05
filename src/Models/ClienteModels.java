package Models;

import java.util.Date;

public class ClienteModels extends PessoaModels {
       
    public ClienteModels(int id, String nome, String cpf, String dataNascimento, String email, String telefone) {
        super(id, nome, cpf, dataNascimento);
        this.email = email;
        this.telefone = telefone;
    }
    
    //-------->GET & SET<--------
    
    private String email;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
