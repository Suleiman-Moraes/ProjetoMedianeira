/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao.cadastro;

import apresentacao.TelaPesquisa;
import enun.Legenda;
import fabrica.Fabrica;
import interfaces.ITabelaViagem;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import model.Motorista;
import model.Onibus;
import model.Viagem;
import service.MotoristaService;
import service.OnibusService;
import service.ViagemService;
import util.Validacao;

/**
 *
 * @author Lenovo
 */
public class CadastroViagem extends Fabrica implements ITabelaViagem{

    private Vector<String> cabecalho;
    private Iterator detalhe;
    private Legenda legenda = Legenda.VIAGEM;
    
    public CadastroViagem() {
        initComponents();
        jComboBoxMotorista.setModel(preencherComboModtorista());
        jComboBoxOnibus.setModel(preencherComboOnibus());
    }
    public CadastroViagem(JDesktopPane principal) {
        this();
        this.principal = principal;
    }

    public CadastroViagem(JDesktopPane principal, Viagem viagem) {
        this();
        this.principal = principal;
        this.objeto = viagem;
        this.preencherTela((Viagem) objeto);
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
        jButtonPesquisar = new javax.swing.JButton();
        jComboBoxDe = new javax.swing.JComboBox<>();
        jTextFieldAte = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxOnibus = new javax.swing.JComboBox<>();
        jComboBoxMotorista = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();

        setTitle("Cadastro Viagem");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Data de Saída");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("De");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Motorista");

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

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jComboBoxDe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Goiânia", "Palmas" }));
        jComboBoxDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeActionPerformed(evt);
            }
        });

        jTextFieldAte.setEditable(false);
        jTextFieldAte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Até");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ônibus");

        jComboBoxTurno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Noite" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Turno");

        jComboBoxOnibus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBoxOnibus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));

        jComboBoxMotorista.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBoxMotorista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Valor");

        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxMotorista, javax.swing.GroupLayout.Alignment.LEADING, 0, 418, Short.MAX_VALUE)
                                .addComponent(jComboBoxOnibus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxDe, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPesquisar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldAte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonlLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jComboBoxDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeActionPerformed
        switch(jComboBoxDe.getSelectedIndex()){
            case(1):{
                jTextFieldAte.setText("Palmas");
                jComboBoxMotorista.setModel(preencherComboModtorista("Goiânia"));
                break;
            }
            case(2):{
                jTextFieldAte.setText("Goiânia");
                jComboBoxMotorista.setModel(preencherComboModtorista("Palmas"));
                break;
            }
            default:
            jTextFieldAte.setText("");
            jComboBoxMotorista.setModel(preencherComboModtorista());
            break;
        }
    }//GEN-LAST:event_jComboBoxDeActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        try {
            preencherTable();
            TelaPesquisa tela = new TelaPesquisa(principal, getCabecalho(), getDetalhe(), legenda);
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        try {
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonlLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlLimparActionPerformed
        try {
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonlLimparActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Confirmar a exclusão da Viagem?",
                "VIAÇÃO NOSSA SENHORA DE MEDIANEIRA ltda", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                new ViagemService().deletar(Integer.parseInt(jTextFieldIndentificador.getText()));

                JOptionPane.showMessageDialog(rootPane, "Operação efetuada com sucesso!",
                    "Informação", JOptionPane.INFORMATION_MESSAGE);

                limparTela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            this.validaCampos();
            Viagem viagem = printTela();

            new ViagemService().salvar(viagem);
            JOptionPane.showMessageDialog(rootPane, "Dados Inseridos com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            this.limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextFieldValor.getText().trim().length() >= 6) evt.consume();
            if(!x.validaCampoNumero(String.valueOf(evt.getKeyChar()))) 
                evt.consume();
            if(jTextFieldValor.getText().trim().length() > 0)
                Double.parseDouble(jTextFieldValor.getText().trim());
        } catch (Exception e) {
            evt.consume();
            jTextFieldValor.setText(jTextFieldValor.getText().trim().substring(0, 
                    jTextFieldValor.getText().trim().length() - 1));
        }
    }//GEN-LAST:event_jTextFieldValorKeyTyped

    private void validaCampos() throws Exception{
        if(jComboBoxDe.getSelectedIndex() == 0) throw new Exception("Selecione o De.");
        if(jComboBoxTurno.getSelectedIndex() == 0) throw new Exception("Selecione o Turno.");
        if(jFormattedTextFieldData.getText().trim().length() != 10) 
            throw new Exception("Insira a Data de Saída");
        if(jTextFieldValor.getText().trim().equals("")) throw new Exception("Insira o Valor.");
    }
    
    private void limparTela() {
        try {
            jTextFieldIndentificador.setText("");
            jTextFieldAte.setText("");
            jFormattedTextFieldData.setText("");
            jComboBoxDe.setSelectedIndex(0);
            jComboBoxTurno.setSelectedIndex(0);
            jTextFieldValor.setText("");
            
            jButtonExcluir.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherTela(Viagem viagem){
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            if(viagem.getId() > 0) jTextFieldIndentificador.setText(viagem.getId()+"");
            if(viagem.getAte() != null) jTextFieldAte.setText(viagem.getAte());
            if(viagem.getDataSaida() != null)
                jFormattedTextFieldData.setText(format.format(viagem.getDataSaida()));
            if(viagem.getDe() != null) jComboBoxDe.setSelectedItem(viagem.getDe());
            if(viagem.getMotorista() != null)
                jComboBoxMotorista.setSelectedItem(viagem.getMotorista());
            if(viagem.getOnibus() != null)
                jComboBoxOnibus.setSelectedItem(viagem.getOnibus());
            if(viagem.getTurno()) jComboBoxTurno.setSelectedIndex(1);
            else jComboBoxTurno.setSelectedIndex(2);
            if(viagem.getValor()> 0) jTextFieldValor.setText(viagem.getValor()+"");
            
            jButtonExcluir.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Viagem printTela(){
        try {
            Viagem viagem = new Viagem();
            if(jFormattedTextFieldData.getText().trim().length() == 10 &&
                new ViagemService().isDateValid(jFormattedTextFieldData.getText().trim())){
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                viagem.setDataSaida(format.parse(jFormattedTextFieldData.getText().trim()));
            }
            if(jComboBoxDe.getSelectedIndex() != 0)
                viagem.setDe((String) jComboBoxDe.getSelectedItem());
            if(!jTextFieldAte.getText().trim().equals(""))
                viagem.setAte(jTextFieldAte.getText().trim());
            if(jComboBoxTurno.getSelectedIndex() == 1) viagem.setTurno(true);
            else viagem.setTurno(false);
            viagem.setMotorista((Motorista) jComboBoxMotorista.getSelectedItem());
            viagem.setOnibus((Onibus) jComboBoxOnibus.getSelectedItem());
            
            if(!jTextFieldIndentificador.getText().trim().isEmpty())
                viagem.setId(Integer.parseInt(jTextFieldIndentificador.getText().trim()));
            if(!jTextFieldValor.getText().trim().isEmpty())
                viagem.setValor(Float.parseFloat(jTextFieldValor.getText().trim()));
            
            return viagem;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultComboBoxModel preencherComboOnibus(){
        try {
            Vector veto = new Vector();
            new OnibusService().visualizarAll().forEachRemaining(x -> veto.add(x));
            
            DefaultComboBoxModel<String> itens = new DefaultComboBoxModel<>(veto);
            return itens;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultComboBoxModel preencherComboModtorista(){
        try {
            Vector veto = new Vector();
            new MotoristaService().visualizarAll().forEachRemaining(x -> veto.add(x));
            
            DefaultComboBoxModel<String> itens = new DefaultComboBoxModel<>(veto);
            return itens;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultComboBoxModel preencherComboModtorista(String local){
        try {
            List<Motorista> lista = new MotoristaService().buscarMotoristaPassandoCidade(local);
            Vector veto = new Vector(lista);
            
            DefaultComboBoxModel<String> itens = new DefaultComboBoxModel<>(veto);
            return itens;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void preencherTable() {
        try {
            Object[] vet = this.preencherTabela();
            cabecalho = (Vector<String>) vet[0];
            detalhe = (Iterator) vet[1];
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    @Override
    public Iterator<Viagem> listaViagem() throws SQLException {
        return new ViagemService().visualizarAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonlLimpar;
    private javax.swing.JComboBox<String> jComboBoxDe;
    private javax.swing.JComboBox<String> jComboBoxMotorista;
    private javax.swing.JComboBox<String> jComboBoxOnibus;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAte;
    private javax.swing.JTextField jTextFieldIndentificador;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables

    public Vector<String> getCabecalho() {
        return cabecalho;
    }

    public Iterator getDetalhe() {
        return detalhe;
    }
}
