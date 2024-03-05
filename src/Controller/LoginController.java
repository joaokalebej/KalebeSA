package Controller;

import Views.LoginViews;
import Views.MenuViews;

public class LoginController {

    private final LoginViews view;
        
    public LoginController(LoginViews view){
        this.view = view;
    }
    
    public void Entrar(){
        MenuViews menu = new MenuViews();
        menu.setVisible(true);
        this.view.dispose();
    }
     
}
