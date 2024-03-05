package DTO;

public class LoginDTO {

    private int id;
    private String userLogin;
    private String passLogin;        

    public String getUserLogin() {
        return userLogin;
    }

    public String getPassLogin() {
        return passLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public void setPassLogin(String passLogin) {
        this.passLogin = passLogin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
