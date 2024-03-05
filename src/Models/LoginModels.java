package Models;

public class LoginModels {

    private String login;
    private String Senha;

    public LoginModels(String login, String Senha) {
        this.login = login;
        this.Senha = Senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
    
}
