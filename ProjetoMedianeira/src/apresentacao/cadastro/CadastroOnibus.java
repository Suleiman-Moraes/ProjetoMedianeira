/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao.cadastro;

import apresentacao.TelaPesquisa;
import apresentacao.cadastro.CadastroModelo;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import model.Modelo;
import model.Onibus;
import service.ModeloService;
import service.OnibusService;

/**
 *
 * @author Lenovo
 */
public class CadastroOnibus extends javax.swing.JInternalFrame {

    private JDesktopPane principal;
    private Vector<String> cabecalho;
    private Vector detalhe;
    private Onibus onibus;
    
    public CadastroOnibus() {
        initComponents();
    }
    public CadastroOnibus(JDesktopPane principal) {
        this();
        this.principal = principal;
    }

    public CadastroOnibus(JDesktopPane principal, Onibus onibus) {
        this();
        this.principal = principal;
        this.onibus = onibus;
        this.preencherTela(onibus);
    }
    
    public CadastroOnibus(JDesktopPane principal, Modelo modelo) throws SQLException {
        this();
        this.principal = principal;
        this.preencherModelo(modelo);
    }
    
    public CadastroOnibus(JDesktopPane principal, Onibus onibus, Modelo modelo) throws SQLException {
        this();
        this.principal = principal;
        this.preencherTela(onibus);
        this.preencherModelo(modelo);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonlLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jTextFieldIndentificador = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jButtonVerificar = new javax.swing.JButton();
        jLabelDisponibilidade = new javax.swing.JLabel();
        jButtonPesquisarModelo = new javax.swing.JButton();

        setTitle("Cadastro Ônibus");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Código");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ano");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Modelo");

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

        jTextFieldIndentificador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldIndentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIndentificadorKeyTyped(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldAno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoKeyTyped(evt);
            }
        });

        jTextFieldModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldModelo.setEnabled(false);

        jButtonVerificar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonVerificar.setText("VERIFICAR");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        jLabelDisponibilidade.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jButtonPesquisarModelo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisarModelo.setText("PESQUISAR");
        jButtonPesquisarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarModeloActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonPesquisar))
                                    .addComponent(jTextFieldAno))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVerificar)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDisponibilidade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisarModelo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonlLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonVerificar)
                    .addComponent(jLabelDisponibilidade))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonPesquisarModelo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonlLimpar)
                    .addComponent(jButtonFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            Onibus onibus = new Onibus();
            onibus.setAno(jTextFieldAno.getText());
            onibus.setNumero(jTextFieldIndentificador.getText());
            onibus.setModelo(new ModeloService().visualizarUm(
                Integer.parseInt(jTextFieldModelo.getText().trim())));
            
            new OnibusService().salvar(onibus);
            JOptionPane.showMessageDialog(rootPane, "Dados Inseridos com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            this.limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Confirmar a exclusão do Ônibus?",
                "VIAÇÃO NOSSA SENHORA DE MEDIANEIRA ltda", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                new OnibusService().deletar(jTextFieldIndentificador.getText());

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
            TelaPesquisa tela = new TelaPesquisa(principal, getCabecalho(), getDetalhe(), "onibus");
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonPesquisarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarModeloActionPerformed
        try {
            CadastroModelo modelo = new CadastroModelo();
            modelo.preencherTela();
            TelaPesquisa tela = new TelaPesquisa(principal, modelo.getCabecalho(), 
                    modelo.getDetalhe(), "onibus/modelo", this.printTela());
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarModeloActionPerformed

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        try {
            if(jTextFieldIndentificador.getText().trim().equals("")) throw new Exception("Informe o Número.");
            if(new OnibusService().existe(jTextFieldIndentificador.getText().trim())) jLabelDisponibilidade.setText("Existe");
            else jLabelDisponibilidade.setText("Livre");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    private void jTextFieldIndentificadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIndentificadorKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            if(jTextFieldIndentificador.getText().length() >= 4) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldIndentificadorKeyTyped

    private void jTextFieldAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            if(jTextFieldAno.getText().length() >= 4) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnoKeyTyped

    private Onibus printTela() throws SQLException{
        Onibus onibus = new Onibus();
        if(!jTextFieldAno.getText().trim().equals(""))
            onibus.setAno(jTextFieldAno.getText());
        if(!jTextFieldIndentificador.getText().trim().equals(""))
            onibus.setNumero(jTextFieldIndentificador.getText());
        if(!jTextFieldModelo.getText().trim().equals(""))onibus.setModelo(new ModeloService().visualizarUm(
            Integer.parseInt(jTextFieldModelo.getText().trim())));
        
        return onibus;
    }
    
    private void preencherTela(Onibus onibus){
        try {
            if(onibus.getAno() != null) jTextFieldAno.setText(onibus.getAno());
            if(onibus.getNumero() != null) jTextFieldIndentificador.setText(onibus.getNumero());
            if(onibus.getModelo() != null) jTextFieldModelo.setText(onibus.getModelo().getId() + "");
            jLabelDisponibilidade.setText("Existe");
            
            jButtonExcluir.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherModelo(Modelo modelo){
        try {
            jTextFieldModelo.setText(modelo.getId() + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void validaCampos() throws Exception{
        if(jTextFieldIndentificador.getText().trim().equals("")) throw new Exception("Insira o Número.");
        if(jTextFieldAno.getText().trim().equals("")) throw new Exception("Insira o Ano.");
        if(jTextFieldModelo.getText().trim().equals("")) throw new Exception("Insira o Modelo.");
    }
    private void limparTela(){
        try {
            jTextFieldIndentificador.setText("");
            jTextFieldAno.setText("");
            jTextFieldModelo.setText("");
            jLabelDisponibilidade.setText("");
            
            jButtonExcluir.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void preencherTabela() {
        try {
            cabecalho = new Vector();
            getCabecalho().add("Código");
            getCabecalho().add("Ano");
            getCabecalho().add("Marca");
            getCabecalho().add("Modelo");
            getCabecalho().add("Geração");
            getCabecalho().add("Tipo");
            getCabecalho().add("Poltrona");
            
            detalhe = new Vector();
            for(Onibus onibus : new OnibusService().visualizarAll()){
                Vector<String> linha = new Vector();
                
                linha.add(onibus.getNumero()+ "");
                linha.add(onibus.getAno());
                linha.add(onibus.getModelo().getMarca());
                linha.add(onibus.getModelo().getModelo());
                linha.add(onibus.getModelo().getGeracao());
                linha.add(onibus.getModelo().getTipo());
                linha.add(onibus.getModelo().getPoltrona() + "");
                
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
    private javax.swing.JButton jButtonPesquisarModelo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JButton jButtonlLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDisponibilidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldIndentificador;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables

    public Vector<String> getCabecalho() {
        return cabecalho;
    }

    public Vector getDetalhe() {
        return detalhe;
    }
}
