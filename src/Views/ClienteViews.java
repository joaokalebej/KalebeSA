package Views;

import Controller.ClienteController;
import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import DTO.ClienteDTO;
import DTO.FuncionarioDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ClienteViews extends javax.swing.JFrame {

    private final ClienteController controller;

    public ClienteViews() {
        initComponents();
        controller = new ClienteController(this);
        restaurarSexoComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        TelefoneLabel = new javax.swing.JLabel();
        DataNascLabel = new javax.swing.JLabel();
        NomeScanner = new javax.swing.JTextField();
        EmailScanner = new javax.swing.JTextField();
        EnviarCadastro = new javax.swing.JButton();
        VoltarMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        Pesquisar = new javax.swing.JButton();
        CARRO = new javax.swing.JLabel();
        CarroScanner = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        SexoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idScanner = new javax.swing.JTextField();
        carregarCampos = new javax.swing.JButton();
        EditarButton = new javax.swing.JButton();
        ExcluirCliente = new javax.swing.JButton();
        CPFScanner = new javax.swing.JFormattedTextField();
        DataNascScanner = new javax.swing.JFormattedTextField();
        TelefoneScanner = new javax.swing.JFormattedTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeLabel.setText("CPF");
        getContentPane().add(NomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        cpfLabel.setText("NOME");
        getContentPane().add(cpfLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        EmailLabel.setText("EMAIL");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        TelefoneLabel.setText("TELEFONE");
        getContentPane().add(TelefoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        DataNascLabel.setText("DATA DE NASCIMENTO");
        getContentPane().add(DataNascLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        getContentPane().add(NomeScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 210, -1));
        getContentPane().add(EmailScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, -1));

        EnviarCadastro.setText("ENVIAR");
        EnviarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(EnviarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 100, -1));

        VoltarMenu.setText("VOLTAR");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        TabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "CPF", "Data Nascimento", "E-mail", "Telefone", "Carro", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(TabelaCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 910, 380));

        Pesquisar.setText("PESQUISAR");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 530, 120, -1));

        CARRO.setText("CARRO");
        getContentPane().add(CARRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        getContentPane().add(CarroScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 210, -1));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        getContentPane().add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        SexoLabel.setText("SEXO");
        getContentPane().add(SexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        idLabel.setText("ID");
        getContentPane().add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        idScanner.setEnabled(false);
        getContentPane().add(idScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, -1));

        carregarCampos.setText("CARREGAR CAMPOS");
        carregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(carregarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 530, -1, -1));

        EditarButton.setText("EDITAR");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, -1, -1));

        ExcluirCliente.setText("EXCLUIR");
        ExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ExcluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, -1, -1));

        try {
            CPFScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPFScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFScannerActionPerformed(evt);
            }
        });
        getContentPane().add(CPFScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, -1));

        try {
            DataNascScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataNascScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNascScannerActionPerformed(evt);
            }
        });
        getContentPane().add(DataNascScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, -1));

        try {
            TelefoneScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TelefoneScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneScannerActionPerformed(evt);
            }
        });
        getContentPane().add(TelefoneScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 100, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs2/2_1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        this.controller.VoltarMenu();
        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void EnviarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarCadastroActionPerformed
        String nome, cpf, dataNasc, email, telefone, carro, opcaoSexo;

        nome = NomeScanner.getText();
        cpf = CPFScanner.getText();
        dataNasc = DataNascScanner.getText();
        email = EmailScanner.getText();
        telefone = TelefoneScanner.getText();
        carro = CarroScanner.getText();
        opcaoSexo = cbxSexo.getSelectedItem().toString();

        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setNome_clientes(nome);
        objclientedto.setCpf_clientes(cpf);
        objclientedto.setDataNasc_clientes(dataNasc);
        objclientedto.setEmail_clientes(email);
        objclientedto.setTelefone_clientes(telefone);
        objclientedto.setCarro_clientes(carro);
        objclientedto.setSexo_clientes(opcaoSexo);
        

        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.criarCliente(objclientedto);
        limparCampos();

    }//GEN-LAST:event_EnviarCadastroActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        listarClientes();
    }//GEN-LAST:event_PesquisarActionPerformed

    private void carregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarCamposActionPerformed
        carregarCampos();
    }//GEN-LAST:event_carregarCamposActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        editarClientes();
        listarClientes();
        limparCampos();
    }//GEN-LAST:event_EditarButtonActionPerformed

    private void ExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirClienteActionPerformed
        excluirClientes();
        listarClientes();
        limparCampos();
    }//GEN-LAST:event_ExcluirClienteActionPerformed

    private void CPFScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFScannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFScannerActionPerformed

    private void DataNascScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNascScannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataNascScannerActionPerformed

    private void TelefoneScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefoneScannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneScannerActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CARRO;
    private javax.swing.JFormattedTextField CPFScanner;
    private javax.swing.JTextField CarroScanner;
    private javax.swing.JLabel DataNascLabel;
    private javax.swing.JFormattedTextField DataNascScanner;
    private javax.swing.JButton EditarButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailScanner;
    private javax.swing.JButton EnviarCadastro;
    private javax.swing.JButton ExcluirCliente;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeScanner;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JLabel SexoLabel;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JFormattedTextField TelefoneScanner;
    private javax.swing.JButton VoltarMenu;
    private javax.swing.JLabel background;
    private javax.swing.JButton carregarCampos;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idScanner;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void excluirClientes(){
        int idClientes;
        
        idClientes = Integer.parseInt(idScanner.getText());
        
        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setId_clientes(idClientes);
        
        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.ExcluirCliente(objclientedto);
        
    }
    
    public void editarClientes(){
        int idClientes;
        String nome, cpf, dataNasc, email, telefone, carro, sexo;
        
        idClientes = Integer.parseInt(idScanner.getText());
        nome = NomeScanner.getText();
        cpf = CPFScanner.getText();
        dataNasc = DataNascScanner.getText();
        email = EmailScanner.getText();
        telefone = TelefoneScanner.getText();
        carro = CarroScanner.getText();
        sexo = cbxSexo.getSelectedItem().toString();
        
        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setId_clientes(idClientes);
        objclientedto.setNome_clientes(nome);
        objclientedto.setCpf_clientes(cpf);
        objclientedto.setDataNasc_clientes(dataNasc);
        objclientedto.setEmail_clientes(email);
        objclientedto.setTelefone_clientes(telefone);
        objclientedto.setCarro_clientes(carro);
        objclientedto.setSexo_clientes(sexo);
        
        ClienteDAO objclientedao = new ClienteDAO();
        objclientedao.editarCliente(objclientedto);
    }
    
    
    Vector<Integer> id = new Vector<Integer>();
  public void restaurarSexoComboBox() {
        try {
            ClienteDAO objclientedao = new ClienteDAO();
            ResultSet rs = objclientedao.listarSexo();

            while (rs.next()) {
                id.addElement(rs.getInt(1));
                cbxSexo.addItem(rs.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ClienteView Não foi possível listar Sexo no combobox!" + e);
        }
    }
  

    public void listarClientes() {

        try {
            ClienteDAO objclientedao = new ClienteDAO();

            DefaultTableModel model = (DefaultTableModel) TabelaCliente.getModel();
            model.setNumRows(0);

            ArrayList<ClienteDTO> lista = objclientedao.PesquisarClientes();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_clientes(),
                    lista.get(num).getNome_clientes(),
                    lista.get(num).getCpf_clientes(),
                    lista.get(num).getDataNasc_clientes(),
                    lista.get(num).getEmail_clientes(),
                    lista.get(num).getTelefone_clientes(),
                    lista.get(num).getCarro_clientes(),
                    lista.get(num).getSexo_clientes()
                });

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar" + e);
        }

    }

    public void limparCampos(){
        NomeScanner.setText(" ");
        CPFScanner.setText(" ");
        DataNascScanner.setText(" ");
        EmailScanner.setText(" ");
        TelefoneScanner.setText(" ");
        CarroScanner.setText(" ");
    }

public void carregarCampos(){
    int setar = TabelaCliente.getSelectedRow();
    
    idScanner.setText(TabelaCliente.getModel().getValueAt(setar, 0).toString());
    NomeScanner.setText(TabelaCliente.getModel().getValueAt(setar, 1).toString());
    CPFScanner.setText(TabelaCliente.getModel().getValueAt(setar, 2).toString());
    DataNascScanner.setText(TabelaCliente.getModel().getValueAt(setar, 3).toString());
    EmailScanner.setText(TabelaCliente.getModel().getValueAt(setar, 4).toString());
    TelefoneScanner.setText(TabelaCliente.getModel().getValueAt(setar, 5).toString());
    CarroScanner.setText(TabelaCliente.getModel().getValueAt(setar, 6).toString());
    cbxSexo.setSelectedItem(TabelaCliente.getModel().getValueAt(setar, 7).toString());
}
    
}
