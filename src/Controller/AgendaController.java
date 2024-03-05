package Controller;

import Views.AgendaViews;
import Views.MenuViews;

public class AgendaController {
    
    private final AgendaViews view;
    
    public AgendaController(AgendaViews view){
        this.view = view;
    }
    
    public void VoltarMenu(){
        MenuViews menu = new MenuViews();
        menu.setVisible(true);
        this.view.dispose();
    }
    
}
