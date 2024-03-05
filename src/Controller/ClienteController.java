package Controller;

import Views.ClienteViews;
import Views.MenuViews;

public class ClienteController {
    
    private final ClienteViews view;
    
    public ClienteController(ClienteViews view){
        this.view = view;
    }
    
    public void VoltarMenu(){
        MenuViews voltar  = new MenuViews();
        voltar.setVisible(true);
        this.view.dispose();
    }
    
}
