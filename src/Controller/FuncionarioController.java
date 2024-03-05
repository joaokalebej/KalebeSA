package Controller;

import Views.FuncionarioViews;
import Views.MenuViews;

public class FuncionarioController {
    
    private final FuncionarioViews view;
    
    public FuncionarioController(FuncionarioViews view){
        this.view = view;
    }
    
    public void VoltarMenu(){
        MenuViews menu = new MenuViews();
        menu.setVisible(true);
        this.view.dispose();
    }
    
    
    
}
