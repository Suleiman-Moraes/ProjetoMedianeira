package apresentacao.cadastro;

import apresentacao.TelaPesquisa;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Motorista;
import service.MotoristaService;

public class CadastroMotorista extends javax.swing.JInternalFrame {

    private JDesktopPane principal;
    private Vector<String> cabecalho;
    private Vector detalhe;
    private Motorista motorista;
    
    public CadastroMotorista() {
        initComponents();
    }

    public CadastroMotorista(JDesktopPane principal) {
        this();
        this.principal = principal;
    }

    public CadastroMotorista(JDesktopPane principal, Motorista motorista) {
        this();
        this.principal = principal;
        this.motorista = motorista;
        this.preencherTela(motorista);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonlLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jTextFieldIndentificador = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldCnh = new javax.swing.JTextField();
        jComboBoxLocalizacao = new javax.swing.JComboBox<>();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Localização");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CNH");

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonlLimpar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonlLimpar.setText("LIMPAR");
        jButtonlLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlLimparActionPerformed(evt);
            }
        });

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonFechar.setText("FECHAR");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jTextFieldIndentificador.setEditable(false);
        jTextFieldIndentificador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldCnh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCnh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCnhKeyTyped(evt);
            }
        });

        jComboBoxLocalizacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxLocalizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Goiânia", "Palmas" }));
        jComboBoxLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLocalizacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonlLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldCnh)
                            .addComponent(jComboBoxLocalizacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonlLimpar)
                    .addComponent(jButtonFechar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            this.validaCampos();
            Motorista motorista = new Motorista();
            motorista.setNome(jTextFieldNome.getText().trim());
            motorista.setLocalizacao((String) jComboBoxLocalizacao.getSelectedItem());
            motorista.setCnh(jTextFieldCnh.getText().trim());
            
            if(!jTextFieldIndentificador.getText().trim().equals(""))
                motorista.setId(Integer.parseInt(jTextFieldIndentificador.getText().trim()));
            
            new MotoristaService().salvar(motorista);
            JOptionPane.showMessageDialog(rootPane, "Dados Inseridos com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            this.limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Confirmar a exclusão do Motorista?",
                    "VIAÇÃO NOSSA SENHORA DE MEDIANEIRA ltda", JOptionPane.YES_NO_OPTION);
            
            if (resposta == JOptionPane.YES_OPTION) {
                new MotoristaService().deletar(Integer.parseInt(jTextFieldIndentificador.getText()));
                
                JOptionPane.showMessageDialog(rootPane, "Operação efetuada com sucesso!",
                        "Informação", JOptionPane.INFORMATION_MESSAGE);
                
                limparTela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonlLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlLimparActionPerformed
        try {
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonlLimparActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        try {
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        try {
            preencherTabela();
            TelaPesquisa tela = new TelaPesquisa(principal, getCabecalho(), getDetalhe(), "motorista");
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldCnhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCnhKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            if(jTextFieldCnh.getText().length() >= 11) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCnhKeyTyped

    private void jComboBoxLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLocalizacaoActionPerformed
    
    private void preencherTela(Motorista mot){
        try {
            jTextFieldNome.setText(mot.getNome());
            jComboBoxLocalizacao.setSelectedItem(mot.getLocalizacao());
            jTextFieldIndentificador.setText(mot.getId() + "");
            jTextFieldCnh.setText(mot.getCnh());

            jButtonExcluir.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void validaCampos() throws Exception{
        if(jComboBoxLocalizacao.getSelectedIndex() == 0) throw new Exception("Selecione uma Localização.");
        if(jTextFieldCnh.getText().trim().equals("")) throw new Exception("Insira o número da CNH.");
        if(jTextFieldNome.getText().trim().equals("")) throw new Exception("Insira o Nome.");
        if(jTextFieldCnh.getText().length() != 11) throw new Exception("CNH Obrigatório 11 Dígitos.");
    }
    private void limparTela(){
        try {
            jTextFieldNome.setText("");
            jComboBoxLocalizacao.setSelectedIndex(0);
            jTextFieldIndentificador.setText("");
            jTextFieldCnh.setText("");

            jButtonExcluir.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void preencherTabela() {
        try {
            cabecalho = new Vector();
            getCabecalho().add("Código");
            getCabecalho().add("Nome");
            getCabecalho().add("Localização");
            getCabecalho().add("CNH");
            
            detalhe = new Vector();
            for(Motorista tipo : new MotoristaService().visualizarAll()){
                Vector<String> linha = new Vector();
                
                linha.add(tipo.getId() + "");
                linha.add(tipo.getNome());
                linha.add(tipo.getLocalizacao());
                linha.add(tipo.getCnh());
                getDetalhe().add(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonlLimpar;
    private javax.swing.JComboBox<String> jComboBoxLocalizacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCnh;
    private javax.swing.JTextField jTextFieldIndentificador;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    public Vector<String> getCabecalho() {
        return cabecalho;
    }

    public Vector getDetalhe() {
        return detalhe;
    }
}
