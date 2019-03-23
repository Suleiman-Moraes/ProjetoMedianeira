package apresentacao.venda;

import apresentacao.TelaPesquisa;
import apresentacao.TelaPoltrona;
import enun.Legenda;
import fabrica.Fabrica;
import interfaces.ITabelaViagem;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import model.Passagem;
import model.Viagem;
import persistencia.PoltronaDao;
import service.PassagemService;
import service.ViagemService;

public class VendaPassagem extends Fabrica implements ITabelaViagem{

    private Viagem viagem;
    private Vector<String> cabecalho;
    private Iterator detalhe;
    private Legenda legenda = Legenda.PASSAGEM;
    
    public VendaPassagem() {
        initComponents();
    }

    public VendaPassagem(JDesktopPane principal) {
        this();
        this.principal = principal;
    }
    
    public VendaPassagem(JDesktopPane principal, Passagem passagem) {
        this();
        this.principal = principal;
        this.objeto = passagem;
        this.viagem = new Viagem(passagem);
        this.preencherTela((Passagem) objeto);
    }
    
    public VendaPassagem(JDesktopPane principal, Passagem passagem, int num) {
        this();
        this.principal = principal;
        this.objeto = passagem;
        this.viagem = new Viagem(passagem);
        this.preencherTela((Passagem) objeto);
        jTextFieldPoltrona.setText(num + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelViagem = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldIndentificador = new javax.swing.JTextField();
        jTextFieldAte = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldTurno = new javax.swing.JTextField();
        jTextFieldMotorista = new javax.swing.JTextField();
        jTextFieldOnibus = new javax.swing.JTextField();
        jTextFieldDe = new javax.swing.JTextField();
        jButtonPesquisarViagem = new javax.swing.JButton();
        jPanelPassagem = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonlLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldPoltrona = new javax.swing.JTextField();
        jButtonPoltronas = new javax.swing.JButton();
        jButtonPesquisarPassagem = new javax.swing.JButton();

        setTitle("Venda de Passagens");

        jPanelViagem.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Código");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Data de Saída");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("De");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Motorista");

        jTextFieldIndentificador.setEditable(false);
        jTextFieldIndentificador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldAte.setEditable(false);
        jTextFieldAte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Até");

        jFormattedTextFieldData.setEditable(false);
        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Ônibus");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Turno");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Valor");

        jTextFieldValor.setEditable(false);
        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFieldTurno.setEditable(false);
        jTextFieldTurno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFieldMotorista.setEditable(false);
        jTextFieldMotorista.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFieldOnibus.setEditable(false);
        jTextFieldOnibus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFieldDe.setEditable(false);
        jTextFieldDe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonPesquisarViagem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisarViagem.setText("PESQUISAR");
        jButtonPesquisarViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarViagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViagemLayout = new javax.swing.GroupLayout(jPanelViagem);
        jPanelViagem.setLayout(jPanelViagemLayout);
        jPanelViagemLayout.setHorizontalGroup(
            jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViagemLayout.createSequentialGroup()
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViagemLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel30)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViagemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViagemLayout.createSequentialGroup()
                        .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelViagemLayout.createSequentialGroup()
                                .addComponent(jTextFieldAte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29))
                            .addGroup(jPanelViagemLayout.createSequentialGroup()
                                .addComponent(jTextFieldTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31))
                            .addComponent(jButtonPesquisarViagem)))
                    .addComponent(jTextFieldMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelViagemLayout.setVerticalGroup(
            jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextFieldIndentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarViagem))
                .addGap(18, 18, 18)
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextFieldAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jTextFieldDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextFieldMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextFieldOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jTextFieldTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelViagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanelPassagem.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

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

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Nome");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("CPF");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Poltrona");

        jTextFieldPoltrona.setEditable(false);
        jTextFieldPoltrona.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jButtonPoltronas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPoltronas.setText("POLTRONAS");
        jButtonPoltronas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPoltronasActionPerformed(evt);
            }
        });

        jButtonPesquisarPassagem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisarPassagem.setText("PESQUISAR");
        jButtonPesquisarPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarPassagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPassagemLayout = new javax.swing.GroupLayout(jPanelPassagem);
        jPanelPassagem.setLayout(jPanelPassagemLayout);
        jPanelPassagemLayout.setHorizontalGroup(
            jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPassagemLayout.createSequentialGroup()
                .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPassagemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonlLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPassagemLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jFormattedTextFieldCpf)
                            .addGroup(jPanelPassagemLayout.createSequentialGroup()
                                .addComponent(jTextFieldPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPoltronas)))))
                .addGap(18, 18, 18)
                .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarPassagem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPassagemLayout.setVerticalGroup(
            jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPassagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPassagemLayout.createSequentialGroup()
                        .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonPesquisarPassagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextFieldPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPoltronas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanelPassagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonlLimpar)
                    .addComponent(jButtonFechar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelViagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jPanelPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarPassagemActionPerformed
        try {
            preencherTable();
            TelaPesquisa tela = new TelaPesquisa(principal, cabecalho, new PassagemService().visualizarAll(), this.printTela(), legenda);
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarPassagemActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            this.validaCampos();
            Passagem passagem = printTela();

            new PassagemService().salvar(passagem);
            JOptionPane.showMessageDialog(rootPane, "Dados Inseridos com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            this.limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Confirmar a exclusão da Passagem?",
                "VIAÇÃO NOSSA SENHORA DE MEDIANEIRA ltda", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                viagem.getAte();
                new PassagemService().deletar(Integer.parseInt(jTextFieldPoltrona.getText().trim()), 
                        Integer.parseInt(jTextFieldIndentificador.getText()));

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

    private void jButtonPoltronasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPoltronasActionPerformed
        try {
            if(viagem == null) throw new Exception("Selecione uma Viagem.");
            List<Boolean> lista = new PoltronaDao().visualizarUm(viagem.getId()).getListaPoltrona();
            
            TelaPoltrona janela = new TelaPoltrona(this.principal, lista, printTela());
            this.principal.add(janela);
            janela.setTitle("Poltronas");
            janela.setSize(300,300);
            janela.setResizable(false);
            janela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPoltronasActionPerformed

    private void jButtonPesquisarViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarViagemActionPerformed
        try {
            Object[] vet = this.preencherTabela();
            cabecalho = (Vector<String>) vet[0];
            detalhe = (Iterator) vet[1];
            TelaPesquisa tela = new TelaPesquisa(principal, cabecalho, detalhe, this.printTela(), Legenda.VIAGENS);
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarViagemActionPerformed

    private void validaCampos() throws Exception{
        if(jTextFieldNome.getText().trim().isEmpty())
            throw new Exception("Insira o Nome.");
        if(jFormattedTextFieldCpf.getText().trim().length() != 14)
            throw new Exception("Insira o CPF.");
        if(jTextFieldPoltrona.getText().trim().isEmpty() || jTextFieldPoltrona.getText().trim().equals("0"))
            throw new Exception("Insira Poltrona.");

        if(viagem == null) throw new Exception("Escolha uma Viagem.");;
    }
    
    private void limparTelaPassagem(){
        jTextFieldNome.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldPoltrona.setText("");
    }
    
    private void limparTelaviagem(){
        jTextFieldIndentificador.setText("");
        jTextFieldDe.setText("");
        jTextFieldAte.setText("");
        jTextFieldMotorista.setText("");
        jTextFieldOnibus.setText("");
        jTextFieldTurno.setText("");
        jTextFieldValor.setText("");
        jFormattedTextFieldData.setText("");
    }
    
    private void limparTela(){
        this.limparTelaPassagem();
        this.limparTelaviagem();
        this.viagem = null;
        this.objeto = null;
        jButtonExcluir.setEnabled(false);
    }
    
    private void preencherTelaViagem(Viagem viagem){
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            if(viagem.getId() > 0) jTextFieldIndentificador.setText(viagem.getId()+"");
            if(viagem.getAte() != null) jTextFieldAte.setText(viagem.getAte());
            if(viagem.getDataSaida() != null)
                jFormattedTextFieldData.setText(format.format(viagem.getDataSaida()));
            if(viagem.getDe() != null) jTextFieldDe.setText(viagem.getDe());
            if(viagem.getMotorista() != null)
                jTextFieldMotorista.setText(viagem.getMotorista().toString());
            if(viagem.getOnibus() != null)
                jTextFieldOnibus.setText(viagem.getOnibus().toString());
            if(viagem.getTurno()) jTextFieldTurno.setText("Manhã");
            else jTextFieldTurno.setText("Noite");
            if(viagem.getValor()> 0) jTextFieldValor.setText(viagem.getValor()+"");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherTelaPassagem(Passagem passagem){
        try {
            if(passagem.getNome() != null) jTextFieldNome.setText(passagem.getNome());
            if(passagem.getCpf() != null) jFormattedTextFieldCpf.setText(passagem.getCpf());
            if(passagem.getNumeroPlotrona() > 0){
                jTextFieldPoltrona.setText(passagem.getNumeroPlotrona() + "");
                jButtonExcluir.setEnabled(true);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherTela(Passagem passagem){
        try {
            this.preencherTelaPassagem(passagem);
            this.preencherTelaViagem(passagem);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Passagem printTela(){
        try {
            Passagem passagem = new Passagem();
            if(!jTextFieldNome.getText().trim().isEmpty())
                passagem.setNome(jTextFieldNome.getText().trim());
            if(!jTextFieldPoltrona.getText().trim().isEmpty())
                passagem.setNumeroPlotrona(Integer.parseInt(
                        jTextFieldPoltrona.getText().trim()));
            if(jFormattedTextFieldCpf.getText().trim().length() == 14)
                passagem.setCpf(jFormattedTextFieldCpf.getText().trim());
            
            if(viagem != null) passagem = new Passagem(passagem, viagem);
            
            return passagem;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void preencherTable() {
        try {
            cabecalho = new Vector();
            cabecalho.add("Cod. Viagem");
            cabecalho.add("Nome");
            cabecalho.add("CPF");
            cabecalho.add("N Poltrona");
            cabecalho.add("Data de Saída");
            cabecalho.add("De");
            cabecalho.add("Até");
            cabecalho.add("Turno");
            cabecalho.add("Valor");
            cabecalho.add("Nome do Motorista");
            cabecalho.add("Número do ônibus");
            cabecalho.add("Marca");
            cabecalho.add("Modelo");
            cabecalho.add("Geração");
            cabecalho.add("Tipo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public Iterator<Viagem> listaViagem() throws SQLException {
        return new ViagemService().visualizarAPartirDeHoje();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonPesquisarPassagem;
    private javax.swing.JButton jButtonPesquisarViagem;
    private javax.swing.JButton jButtonPoltronas;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonlLimpar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanelPassagem;
    private javax.swing.JPanel jPanelViagem;
    private javax.swing.JTextField jTextFieldAte;
    private javax.swing.JTextField jTextFieldDe;
    private javax.swing.JTextField jTextFieldIndentificador;
    private javax.swing.JTextField jTextFieldMotorista;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldOnibus;
    private javax.swing.JTextField jTextFieldPoltrona;
    private javax.swing.JTextField jTextFieldTurno;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
