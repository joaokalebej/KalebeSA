package Controller;

import Views.AgendaViews;
import Views.ClienteViews;
import Views.FuncionarioViews;
import Views.MenuViews;
import Views.ServicoViews;

public class MenuController {
    
     private final MenuViews view;

     public MenuController(MenuViews view){
         this.view = view;
     }
     
     public void EntrarCliente(){
         ClienteViews cliente = new ClienteViews();
         cliente.setVisible(true);
         this.view.dispose();
     }
     
     public void EntrarFuncionario(){
         FuncionarioViews funcionario = new FuncionarioViews();
         funcionario.setVisible(true);
         this.view.dispose();
     }
     
     public void EntrarServico(){
         ServicoViews servico = new ServicoViews();
         servico.setVisible(true);
         this.view.dispose();
     }
     
     public void EntrarAgenda(){
         AgendaViews agenda = new AgendaViews();
         agenda.setVisible(true);
         this.view.dispose();
     }

}
