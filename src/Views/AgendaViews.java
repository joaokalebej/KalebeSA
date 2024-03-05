package Views;

import Controller.AgendaController;
import DAO.AgendaDAO;
import DAO.ClienteDAO;
import DAO.ServicoDAO;
import DTO.AgendaDTO;
import DTO.ClienteDTO;
import DTO.ServicoDTO;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public final class AgendaViews extends javax.swing.JFrame {

    private final AgendaController controller;

    public AgendaViews() {
        initComponents();
        controller = new AgendaController(this);
        restaurarClientesComboBox();
        restaurarServicoComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ValorScanner = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ObservacaoScanner = new javax.swing.JTextArea();
        AgendarButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        ServiçoLabel = new javax.swing.JLabel();
        ValorLabel = new javax.swing.JLabel();
        DataLabel = new javax.swing.JLabel();
        HoraLabel = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        cbxServico = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaAgendamento = new javax.swing.JTable();
        VoltarMenu = new javax.swing.JButton();
        idScanner = new javax.swing.JTextField();
        ObservacaoLabel = new javax.swing.JLabel();
        ClienteLBL = new javax.swing.JLabel();
        CarregarCampos = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        ExcluirAgendamento = new javax.swing.JButton();
        DataScanner = new javax.swing.JFormattedTextField();
        HoraScanner = new javax.swing.JFormattedTextField();
        AgendaBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ValorScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorScannerActionPerformed(evt);
            }
        });
        getContentPane().add(ValorScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 250, 30));

        ObservacaoScanner.setColumns(20);
        ObservacaoScanner.setRows(5);
        jScrollPane2.setViewportView(ObservacaoScanner);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 510, 140));

        AgendarButton.setText("Agendar");
        AgendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AgendarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 510, 50));

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idLabel.setText("ID");
        getContentPane().add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 20, 20));

        ServiçoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ServiçoLabel.setText("Serviço");
        getContentPane().add(ServiçoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        ValorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ValorLabel.setText("Valor R$");
        getContentPane().add(ValorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        DataLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DataLabel.setText("Data");
        getContentPane().add(DataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        HoraLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HoraLabel.setText("Hora");
        getContentPane().add(HoraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        cbxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(cbxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 250, 30));

        cbxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", " " }));
        cbxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxServicoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 250, 30));

        TabelaAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Cliente", "Serviço", "Data", "Hora", "Valor", "Observação"
            }
        ));
        jScrollPane3.setViewportView(TabelaAgendamento);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 950, 210));

        VoltarMenu.setText("VOLTAR");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        idScanner.setEnabled(false);
        getContentPane().add(idScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, -1));

        ObservacaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ObservacaoLabel.setText("Observação");
        getContentPane().add(ObservacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 100, 20));

        ClienteLBL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClienteLBL.setText("Cliente");
        getContentPane().add(ClienteLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 60, 20));

        CarregarCampos.setText("CARREGAR CAMPOS");
        CarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(CarregarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, -1, -1));

        Pesquisar.setText("PESQUISAR");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        Editar.setText("EDITAR");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, -1, -1));

        ExcluirAgendamento.setText("EXCLUIR");
        ExcluirAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(ExcluirAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        try {
            DataScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(DataScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 382, 250, 30));

        HoraScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##:##"))));
        getContentPane().add(HoraScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 432, 250, 30));

        AgendaBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs2/agendaback.png"))); // NOI18N
        getContentPane().add(AgendaBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorScannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorScannerActionPerformed

    private void cbxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClienteActionPerformed

    private void cbxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxServicoActionPerformed

    private void AgendarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarButtonActionPerformed
        String observacao, data, hora, opcaoCliente, opcaoServico;
        Double valor;
        
        observacao = ObservacaoScanner.getText();
        data = DataScanner.getText();
        hora = HoraScanner.getText();
        valor = Double.valueOf(ValorScanner.getText());
        opcaoCliente = cbxCliente.getSelectedItem().toString();
        opcaoServico = cbxServico.getSelectedItem().toString();
        
        AgendaDTO objagendadto = new AgendaDTO();
        objagendadto.setObservacao_agenda(observacao);
        objagendadto.setData_agenda(data);
        objagendadto.setHora_agenda(hora);
        objagendadto.setValor_agenda(valor);
        objagendadto.setOpcaoCliente_agenda(opcaoCliente);
        objagendadto.setOpcaoServico_agenda(opcaoServico);
        
        AgendaDAO objagendadao = new AgendaDAO();
        objagendadao.criarAgendamento(objagendadto);
        listarAgendamento();
        limparCampos();

    }//GEN-LAST:event_AgendarButtonActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        this.controller.VoltarMenu();
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarCamposActionPerformed

        carregarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_CarregarCamposActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed

        listarAgendamento();
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed

        EditarAgendamento();
        listarAgendamento();
        limparCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarActionPerformed

    private void ExcluirAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirAgendamentoActionPerformed
        excluirAgendamento();
        listarAgendamento();
        limparCampos();
    }//GEN-LAST:event_ExcluirAgendamentoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgendaBackground;
    private javax.swing.JButton AgendarButton;
    private javax.swing.JButton CarregarCampos;
    private javax.swing.JLabel ClienteLBL;
    private javax.swing.JLabel DataLabel;
    private javax.swing.JFormattedTextField DataScanner;
    private javax.swing.JButton Editar;
    private javax.swing.JButton ExcluirAgendamento;
    private javax.swing.JLabel HoraLabel;
    private javax.swing.JFormattedTextField HoraScanner;
    private javax.swing.JLabel ObservacaoLabel;
    private javax.swing.JTextArea ObservacaoScanner;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JLabel ServiçoLabel;
    private javax.swing.JTable TabelaAgendamento;
    private javax.swing.JLabel ValorLabel;
    private javax.swing.JTextField ValorScanner;
    private javax.swing.JButton VoltarMenu;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxServico;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idScanner;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
  
    private void EditarAgendamento(){
       int idagenda;
       String cliente, servico, data, hora, observacao;
       Double valor;
       
        idagenda = Integer.parseInt(idScanner.getText());
        cliente = cbxCliente.getSelectedItem().toString();
        servico = cbxServico.getSelectedItem().toString();
        valor = Double.valueOf(ValorScanner.getText());
        data = DataScanner.getText();
        hora = HoraScanner.getText();
        observacao = ObservacaoScanner.getText();
        
        AgendaDTO objagendadto = new AgendaDTO();
        objagendadto.setId_agenda(idagenda);
        objagendadto.setOpcaoCliente_agenda(cliente);
        objagendadto.setOpcaoServico_agenda(servico);
        objagendadto.setValor_agenda(valor);
        objagendadto.setData_agenda(data);
        objagendadto.setHora_agenda(hora);
        objagendadto.setObservacao_agenda(observacao);
        
        AgendaDAO objagendadao = new AgendaDAO();
        objagendadao.EditarAgendamento(objagendadto);
        
    }
    
    
    private void listarAgendamento(){
        try {
        
            AgendaDAO objagendadao = new AgendaDAO();
            
            DefaultTableModel model = (DefaultTableModel) TabelaAgendamento.getModel();
            model.setNumRows(0);
            
            ArrayList<AgendaDTO> lista = objagendadao.PesquisarAgendamento();
            
            for(int num = 0; num < lista.size(); num++){
                model.addRow(new Object [ ] {
                    lista.get(num).getId_agenda(),
                    lista.get(num).getOpcaoCliente_agenda(),
                    lista.get(num).getOpcaoServico_agenda(),
                    lista.get(num).getData_agenda(),
                    lista.get(num).getHora_agenda(),
                    lista.get(num).getValor_agenda(),
                    lista.get(num).getObservacao_agenda()
                });
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "VIEW Não foi possível Pesquisar Agendamento " + e);
        }
    }
    
    public void excluirAgendamento(){
        int idAgenda;
        
        idAgenda = Integer.parseInt(idScanner.getText());
        
        AgendaDTO objagendadto = new AgendaDTO();
        objagendadto.setId_agenda(idAgenda);
        
        AgendaDAO objagendadao = new AgendaDAO();
        objagendadao.ExcluirAgendamento(objagendadto);
    }
    
    Vector<Integer> id = new Vector<Integer>();

   public void restaurarServicoComboBox(){
       try {
        AgendaDAO objagendadao = new AgendaDAO();
        ResultSet rs = objagendadao.listarServico();
        
        while(rs.next()){
            id.addElement(rs.getInt(1));
            cbxServico.addItem(rs.getString(2));
        }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao listar serviços no agendamento" + e);
       }
           
   }
   
    public void restaurarClientesComboBox() {
        try {
            AgendaDAO objagendadao = new AgendaDAO();
            ResultSet rs = objagendadao.listarClientes();

            while (rs.next()) {
                id.addElement(rs.getInt(1));
                cbxCliente.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar clientes no agendamento." + e);
        }
    }

public void carregarCampos(){
    int setar = TabelaAgendamento.getSelectedRow();
    
    idScanner.setText(TabelaAgendamento.getModel().getValueAt(setar,0).toString());
    cbxCliente.setSelectedItem(TabelaAgendamento.getModel().getValueAt(setar, 1).toString());
    cbxServico.setSelectedItem(TabelaAgendamento.getModel().getValueAt(setar, 2).toString());
    ValorScanner.setText(TabelaAgendamento.getModel().getValueAt(setar, 3).toString());
    DataScanner.setText(TabelaAgendamento.getModel().getValueAt(setar, 4).toString());
    HoraScanner.setText(TabelaAgendamento.getModel().getValueAt(setar, 5).toString());
    ObservacaoScanner.setText(TabelaAgendamento.getModel().getValueAt(setar, 6).toString());
}
    
    public void limparCampos(){
        DataScanner.setText(" ");
        HoraScanner.setText(" ");
        ObservacaoScanner.setText(" ");
        ValorScanner.setText(" ");
    }

}
