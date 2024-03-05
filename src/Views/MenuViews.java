/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.MenuController;

/**
 *
 * @author kalebe
 */
public class MenuViews extends javax.swing.JFrame {

    private final MenuController controller;
    
    /**
     * Creates new form MenuViews
     */
    public MenuViews() {
        initComponents();
        controller = new MenuController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();
        NavBarMenu = new javax.swing.JMenuBar();
        CadastroMenu = new javax.swing.JMenu();
        ClienteItemMenu = new javax.swing.JMenuItem();
        FuncionarioItemMenu = new javax.swing.JMenuItem();
        ServicosItemMenu = new javax.swing.JMenuItem();
        AgendamentoMenu = new javax.swing.JMenu();
        AgendaItemMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs2/1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CadastroMenu.setText("Cadastro");

        ClienteItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons/cliente-icon.png"))); // NOI18N
        ClienteItemMenu.setText("Cliente");
        ClienteItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteItemMenuActionPerformed(evt);
            }
        });
        CadastroMenu.add(ClienteItemMenu);

        FuncionarioItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons/usuario-icon.png"))); // NOI18N
        FuncionarioItemMenu.setText("Funcionário");
        FuncionarioItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioItemMenuActionPerformed(evt);
            }
        });
        CadastroMenu.add(FuncionarioItemMenu);

        ServicosItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons/relatorioTrabalho-icon.png"))); // NOI18N
        ServicosItemMenu.setText("Serviços");
        ServicosItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicosItemMenuActionPerformed(evt);
            }
        });
        CadastroMenu.add(ServicosItemMenu);

        NavBarMenu.add(CadastroMenu);

        AgendamentoMenu.setText("Agendamento");

        AgendaItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons/relatorioTrabalho-icon.png"))); // NOI18N
        AgendaItemMenu.setText("Agendamento de Serviço");
        AgendaItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaItemMenuActionPerformed(evt);
            }
        });
        AgendamentoMenu.add(AgendaItemMenu);

        NavBarMenu.add(AgendamentoMenu);

        setJMenuBar(NavBarMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServicosItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicosItemMenuActionPerformed
        // TODO add your handling code here:
        this.controller.EntrarServico();
    }//GEN-LAST:event_ServicosItemMenuActionPerformed

    private void ClienteItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteItemMenuActionPerformed
        // TODO add your handling code here:
        this.controller.EntrarCliente();
    }//GEN-LAST:event_ClienteItemMenuActionPerformed

    private void FuncionarioItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioItemMenuActionPerformed
        // TODO add your handling code here:
        this.controller.EntrarFuncionario();
    }//GEN-LAST:event_FuncionarioItemMenuActionPerformed

    private void AgendaItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaItemMenuActionPerformed
        // TODO add your handling code here:
        this.controller.EntrarAgenda();
    }//GEN-LAST:event_AgendaItemMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuViews().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgendaItemMenu;
    private javax.swing.JMenu AgendamentoMenu;
    private javax.swing.JMenu CadastroMenu;
    private javax.swing.JMenuItem ClienteItemMenu;
    private javax.swing.JMenuItem FuncionarioItemMenu;
    private javax.swing.JMenuBar NavBarMenu;
    private javax.swing.JMenuItem ServicosItemMenu;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}