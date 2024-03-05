package Views;

import Controller.FuncionarioController;
import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class FuncionarioViews extends javax.swing.JFrame {

    private final FuncionarioController controller;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public FuncionarioViews() {
        initComponents();
        controller = new FuncionarioController(this);
        restaurarDadosComboBoxCargo();
        restaurarSexoComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioSexo = new javax.swing.ButtonGroup();
        grupoNivelAcesso = new javax.swing.ButtonGroup();
        NomeLabel = new javax.swing.JLabel();
        CpfLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        TelefoneLabel = new javax.swing.JLabel();
        DataNascLabel = new javax.swing.JLabel();
        CepLabel = new javax.swing.JLabel();
        EnderecoLabel = new javax.swing.JLabel();
        NomeScanner = new javax.swing.JTextField();
        EmailScanner = new javax.swing.JTextField();
        EnderecoScanner = new javax.swing.JTextField();
        EnviarButton = new javax.swing.JButton();
        VoltarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SenhaScanner = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        Cargo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFuncionario = new javax.swing.JTable();
        cbxCargo = new javax.swing.JComboBox<>();
        SexoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idScanner = new javax.swing.JTextField();
        CarregarCampos = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        ExcluirButton = new javax.swing.JButton();
        DataNascScanner = new javax.swing.JFormattedTextField();
        CPFScanner = new javax.swing.JFormattedTextField();
        TelefoneScanner = new javax.swing.JFormattedTextField();
        CEPScanner = new javax.swing.JFormattedTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeLabel.setText("NOME");
        getContentPane().add(NomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        CpfLabel.setText("CPF");
        getContentPane().add(CpfLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        EmailLabel.setText("EMAIL");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        TelefoneLabel.setText("TELEFONE");
        getContentPane().add(TelefoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        DataNascLabel.setText("DATA DE NASCIMENTO");
        getContentPane().add(DataNascLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, 20));

        CepLabel.setText("CEP");
        getContentPane().add(CepLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        EnderecoLabel.setText("ENDEREÇO");
        getContentPane().add(EnderecoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        NomeScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeScannerActionPerformed(evt);
            }
        });
        getContentPane().add(NomeScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, -1));
        getContentPane().add(EmailScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 200, -1));

        EnderecoScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecoScannerActionPerformed(evt);
            }
        });
        getContentPane().add(EnderecoScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 200, -1));

        EnviarButton.setText("ENVIAR");
        EnviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EnviarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        VoltarButton.setText("VOLTAR");
        VoltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel1.setText("SENHA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        SenhaScanner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaScannerActionPerformed(evt);
            }
        });
        getContentPane().add(SenhaScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 200, -1));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 100, -1));

        Cargo.setText("CARGO");
        getContentPane().add(Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        TabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "CPF", "E-mail", "Telefone", "Data Nascimento", "CEP", "Endereço", "Sexo", "Cargo", "Senha"
            }
        ));
        jScrollPane1.setViewportView(TabelaFuncionario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 910, 350));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 100, -1));

        SexoLabel.setText("SEXO");
        getContentPane().add(SexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        idLabel.setText("ID");
        getContentPane().add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        idScanner.setEnabled(false);
        getContentPane().add(idScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, -1));

        CarregarCampos.setText("CARREGAR CAMPOS");
        CarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(CarregarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 500, 170, -1));

        Pesquisar.setText("PESQUISAR");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, -1, -1));

        Editar.setText("EDITAR");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        ExcluirButton.setText("EXCLUIR");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExcluirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, -1, -1));

        try {
            DataNascScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(DataNascScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 80, -1));

        try {
            CPFScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(CPFScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, -1));

        try {
            TelefoneScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(TelefoneScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 130, -1));

        try {
            CEPScanner.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(CEPScanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 130, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs2/1_1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
        String nome, telefone, senha, email, cep, endereco, cpf, dataNasc, opcaoCargo, opcaoSexo;

        nome = NomeScanner.getText();
        cpf = CPFScanner.getText();
        telefone = TelefoneScanner.getText();
        email = EmailScanner.getText();
        cep = CEPScanner.getText();
        dataNasc = DataNascScanner.getText();
        endereco = EnderecoScanner.getText();
        opcaoCargo = cbxCargo.getSelectedItem().toString();
        opcaoSexo = cbxSexo.getSelectedItem().toString();
        senha = SenhaScanner.getText();

        FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
        objfuncionariodto.setNome_funcionario(nome);
        objfuncionariodto.setCpf_fucionario(cpf);
        objfuncionariodto.setTelefone_funcionario(telefone);
        objfuncionariodto.setEmail_funcionario(email);
        objfuncionariodto.setCep_funcionario(cep);
        objfuncionariodto.setDataNasc_funcionario(dataNasc);
        objfuncionariodto.setEndereco_funcionario(endereco);
        objfuncionariodto.setSexo_funcionario(opcaoSexo);
        objfuncionariodto.setNivel_acesso(opcaoCargo);
        objfuncionariodto.setSenha_funcionario(senha);
        
        FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
        objfuncionariodao.criarFuncionario(objfuncionariodto);

        limparCampos();
        listarFuncionarios();
    }//GEN-LAST:event_EnviarButtonActionPerformed

    private void VoltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButtonActionPerformed
        this.controller.VoltarMenu();
    }//GEN-LAST:event_VoltarButtonActionPerformed

    private void NomeScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeScannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeScannerActionPerformed

    private void EnderecoScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderecoScannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecoScannerActionPerformed

    private void SenhaScannerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaScannerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaScannerActionPerformed

    private void cbxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCargoActionPerformed

    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoActionPerformed

    }//GEN-LAST:event_cbxSexoActionPerformed

    private void CarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarCamposActionPerformed
        
        carregarCampos();
    }//GEN-LAST:event_CarregarCamposActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed

        listarFuncionarios();
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed

        EditarFuncionario();
        listarFuncionarios();
        limparCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarActionPerformed

    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed
        excluirFuncionario();
        listarFuncionarios();
        limparCampos();
    }//GEN-LAST:event_ExcluirButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CEPScanner;
    private javax.swing.JFormattedTextField CPFScanner;
    private javax.swing.JLabel Cargo;
    private javax.swing.JButton CarregarCampos;
    private javax.swing.JLabel CepLabel;
    private javax.swing.JLabel CpfLabel;
    private javax.swing.JLabel DataNascLabel;
    private javax.swing.JFormattedTextField DataNascScanner;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailScanner;
    private javax.swing.JLabel EnderecoLabel;
    private javax.swing.JTextField EnderecoScanner;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JButton ExcluirButton;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeScanner;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JTextField SenhaScanner;
    private javax.swing.JLabel SexoLabel;
    private javax.swing.JTable TabelaFuncionario;
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JFormattedTextField TelefoneScanner;
    private javax.swing.JButton VoltarButton;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.ButtonGroup grupoNivelAcesso;
    private javax.swing.ButtonGroup grupoRadioSexo;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idScanner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void excluirFuncionario(){
        int idFuncionario;
        
        idFuncionario = Integer.parseInt(idScanner.getText());
        
        FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
        objfuncionariodto.setId_funcionario(idFuncionario);
        
        FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
        objfuncionariodao.excluirFuncionario(objfuncionariodto);
    }
    
    
    private void EditarFuncionario(){
    int idFuncionario;
    String nome, cpf, email, telefone, dataNasc, cep, endereco, sexo, senha, cargo;
    
    idFuncionario = Integer.parseInt(idScanner.getText());
    nome = NomeScanner.getText();
    cpf = CPFScanner.getText();
    email = EmailScanner.getText();
    telefone = TelefoneScanner.getText();
    dataNasc = DataNascScanner.getText();
    cep = CEPScanner.getText();
    endereco = EnderecoScanner.getText();
    sexo = cbxSexo.getSelectedItem().toString();
    cargo = cbxCargo.getSelectedItem().toString();
    senha = SenhaScanner.getText().toString();
    
    FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
    objfuncionariodto.setId_funcionario(idFuncionario);
    objfuncionariodto.setNome_funcionario(nome);
    objfuncionariodto.setCpf_fucionario(cpf);
    objfuncionariodto.setEmail_funcionario(email);
    objfuncionariodto.setTelefone_funcionario(telefone);
    objfuncionariodto.setDataNasc_funcionario(dataNasc);
    objfuncionariodto.setCep_funcionario(cep);
    objfuncionariodto.setEndereco_funcionario(endereco);
    objfuncionariodto.setSexo_funcionario(sexo);
    objfuncionariodto.setNivel_acesso(cargo);
    objfuncionariodto.setSenha_funcionario(senha);
    
    FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
    objfuncionariodao.editarFuncionario(objfuncionariodto);
    }
    
    Vector<Integer> id = new Vector<Integer>();

    public void restaurarSexoComboBox() {
        try {
            FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
            ResultSet rs = objfuncionariodao.listarSexo();

            while (rs.next()) {
                id.addElement(rs.getInt(1));
                cbxSexo.addItem(rs.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioView Não foi possível listar Sexo no combobox!" + e);
        }
    }

    public void restaurarDadosComboBoxCargo() {

        try {
            FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
            ResultSet rs = objfuncionariodao.listarCargo();

            while (rs.next()) {
                id.addElement(rs.getInt(1));
                cbxCargo.addItem(rs.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Carregado Cargo VIEW " + e);
        }

    }

    private void listarFuncionarios() {

        try {
            FuncionarioDAO objfuncionariodao = new FuncionarioDAO();

            DefaultTableModel model = (DefaultTableModel) TabelaFuncionario.getModel();
            model.setNumRows(0);

            ArrayList<FuncionarioDTO> lista = objfuncionariodao.PesquisarFuncionario();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_funcionario(),
                    lista.get(num).getNome_funcionario(),
                    lista.get(num).getCpf_fucionario(),
                    lista.get(num).getEmail_funcionario(),
                    lista.get(num).getTelefone_funcionario(),
                    lista.get(num).getDataNasc_funcionario(),
                    lista.get(num).getCep_funcionario(),
                    lista.get(num).getEndereco_funcionario(),
                    lista.get(num).getSexo_funcionario(),
                    lista.get(num).getNivel_acesso(),
                    lista.get(num).getSenha_funcionario()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar funcionarios!" + e);
        }
    }

    private void limparCampos() {
        NomeScanner.setText(" ");
        CPFScanner.setText(" ");
        TelefoneScanner.setText(" ");
        EmailScanner.setText(" ");
        CEPScanner.setText(" ");
        DataNascScanner.setText(" ");
        EnderecoScanner.setText(" ");
        SenhaScanner.setText(" ");
    }

    public void carregarCampos(){
        int setar = TabelaFuncionario.getSelectedRow();
        
        idScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 0).toString());
        NomeScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 1).toString());
        CPFScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 2).toString());
        EmailScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 3).toString());
        TelefoneScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 4).toString());
        DataNascScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 5).toString());
        CEPScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 6).toString());
        EnderecoScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 7).toString());
        cbxSexo.setSelectedItem(TabelaFuncionario.getModel().getValueAt(setar, 8).toString());
        cbxCargo.setSelectedItem(TabelaFuncionario.getModel().getValueAt(setar, 9).toString());
        SenhaScanner.setText(TabelaFuncionario.getModel().getValueAt(setar, 10).toString());
    }

}
