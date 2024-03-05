package Controller;

import Views.MenuViews;
import Views.ServicoViews;

public class ServicoController {
    
    private final ServicoViews view;
    
    public ServicoController(ServicoViews view){
        this.view = view;
    }
    
    public void VoltarMenu(){
        MenuViews menu = new MenuViews();
        menu.setVisible(true);
        this.view.dispose();
    }
    
}
