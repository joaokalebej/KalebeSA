package Views;

import Controller.ServicoController;
import DAO.ServicoDAO;
import DTO.ServicoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ServicoViews extends javax.swing.JFrame {

    private final ServicoController controller;

    public ServicoViews() {
        initComponents();
        controller = new ServicoController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ObservacaoLabel = new javax.swing.JLabel();
        EnviarButton = new javax.swing.JButton();
        campoDescricao1 = new javax.swing.JScrollPane();
        observacaoScanner = new javax.swing.JTextArea();
        descricaoScanner = new javax.swing.JTextField();
        valorScanner = new javax.swing.JTextField();
        descricaoLabel = new javax.swing.JLabel();
        valorLabel = new javax.swing.JLabel();
        VoltarMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaServicos = new javax.swing.JTable();
        idServico = new javax.swing.JTextField();
        CarregarCampos = new javax.swing.JButton();
        IdLabel = new javax.swing.JLabel();
        EditarButton = new javax.swing.JButton();
        PesquisarButton = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ObservacaoLabel.setText("OBSERVAÇÃO");
        getContentPane().add(ObservacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        EnviarButton.setText("ENVIAR");
        EnviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EnviarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        observacaoScanner.setColumns(20);
        observacaoScanner.setRows(5);
        campoDescricao1.setViewportView(observacaoScanner);

        getContentPane().add(campoDescricao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 90));

        descricaoScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoScannerActionPerformed(evt);
            }
        });
        getContentPane().add(descricaoScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 30));

        valorScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorScannerActionPerformed(evt);
            }
        });
        getContentPane().add(valorScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));

        descricaoLabel.setText("DESCRIÇÃO");
        getContentPane().add(descricaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        valorLabel.setText("VALOR");
        getContentPane().add(valorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        VoltarMenu.setText("VOLTAR");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        TabelaServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Descrição", "Valor", "Observação"
            }
        ));
        jScrollPane1.setViewportView(TabelaServicos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 340, 250));

        idServico.setEnabled(false);
        getContentPane().add(idServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, -1));

        CarregarCampos.setText("Carregar campos");
        CarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(CarregarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 340, -1));

        IdLabel.setText("ID");
        getContentPane().add(IdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        EditarButton.setText("EDITAR");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        PesquisarButton.setText("Pesquisar");
        PesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PesquisarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        Excluir.setText("EXCLUIR");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs2/servicoBackground.PNG"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descricaoScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoScannerActionPerformed
    }//GEN-LAST:event_descricaoScannerActionPerformed

    private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
        String descricao, observacao;
        Double valor;
        int id;

        descricao = descricaoScanner.getText();
        observacao = observacaoScanner.getText();
        valor = Double.valueOf(valorScanner.getText());

        ServicoDTO objservicodto = new ServicoDTO();
        objservicodto.setDescricao_servico(descricao);
        objservicodto.setObservacao_servico(observacao);
        objservicodto.setValor_servico(valor);

        ServicoDAO objservicodao = new ServicoDAO();
        objservicodao.criarServico(objservicodto);
        listarServicos();

    }//GEN-LAST:event_EnviarButtonActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        this.controller.VoltarMenu();
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarCamposActionPerformed
        carregarCampos();
    }//GEN-LAST:event_CarregarCamposActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        EditarServico();
        listarServicos();
        LimparCampos();
    }//GEN-LAST:event_EditarButtonActionPerformed

    private void PesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarButtonActionPerformed
        listarServicos();
    }//GEN-LAST:event_PesquisarButtonActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        excluirServico();
        listarServicos();
        LimparCampos();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void valorScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorScannerActionPerformed

    }//GEN-LAST:event_valorScannerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicoViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarregarCampos;
    private javax.swing.JButton EditarButton;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JButton Excluir;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel ObservacaoLabel;
    private javax.swing.JButton PesquisarButton;
    private javax.swing.JTable TabelaServicos;
    private javax.swing.JButton VoltarMenu;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane campoDescricao1;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoScanner;
    private javax.swing.JTextField idServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea observacaoScanner;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JTextField valorScanner;
    // End of variables declaration//GEN-END:variables

    private void EditarServico() {

        int id_servico;
        String descricao_servico, observacao_servico;
        Double valor_servico;

        id_servico = Integer.parseInt(idServico.getText());
        descricao_servico = descricaoScanner.getText();
        valor_servico = Double.valueOf(valorScanner.getText());
        observacao_servico = observacaoScanner.getText();

        ServicoDTO objservicodto = new ServicoDTO();
        objservicodto.setId_servico(id_servico);
        objservicodto.setDescricao_servico(descricao_servico);
        objservicodto.setValor_servico(valor_servico);
        objservicodto.setObservacao_servico(observacao_servico);

        ServicoDAO objservicodao = new ServicoDAO();
        objservicodao.EditarServico(objservicodto);

    }

    private void listarServicos() {

        try {
            ServicoDAO objservicodao = new ServicoDAO();

            DefaultTableModel model = (DefaultTableModel) TabelaServicos.getModel();
            model.setNumRows(0);

            ArrayList<ServicoDTO> lista = objservicodao.PesquisarServico();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_servico(),
                    lista.get(num).getDescricao_servico(),
                    lista.get(num).getValor_servico(),
                    lista.get(num).getObservacao_servico()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "VIEW não foi possível Listar os serviços.");
        }
    }

    public void excluirServico() {
        int id_servico;

        id_servico = Integer.parseInt(idServico.getText());
        
        ServicoDTO objservicodto = new ServicoDTO();
        objservicodto.setId_servico(id_servico);
        
        ServicoDAO objservicodao = new ServicoDAO();
        objservicodao.excluirServico(objservicodto);
    }

    public void carregarCampos() {
        int setar = TabelaServicos.getSelectedRow();
        idServico.setText(TabelaServicos.getModel().getValueAt(setar, 0).toString());
        descricaoScanner.setText(TabelaServicos.getModel().getValueAt(setar, 1).toString());
        valorScanner.setText(TabelaServicos.getModel().getValueAt(setar, 2).toString());
        observacaoScanner.setText(TabelaServicos.getModel().getValueAt(setar, 3).toString());
    }

    public void LimparCampos() {
        descricaoScanner.setText(" ");
        valorScanner.setText(" ");
        observacaoScanner.setText(" ");
    }

}
