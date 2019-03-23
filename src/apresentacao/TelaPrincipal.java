package apresentacao;

import apresentacao.telafundo.FundoTela;
import apresentacao.cadastro.CadastroViagem;
import apresentacao.cadastro.CadastroOnibus;
import apresentacao.cadastro.CadastroMotorista;
import apresentacao.cadastro.CadastroModelo;
import apresentacao.venda.VendaPassagem;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    FundoTela tela;
    
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
//        this.jDesktopPane1.setLayout(new GridLayout());
        setLayout(new GridLayout());
        tela = new FundoTela 
        (new File("src\\apresentacao\\telafundo\\g6-paradiso-1550-ld-o400-rsd-Medianeira.PNG").getAbsolutePath());
        getContentPane().add(tela);
                
    }
    
    private void sair(){
        try {
            int x = JOptionPane.showConfirmDialog(rootPane, "Sair sem \"Salvar\" ??\nTodos os dados não salvos serão perdidios", "ALERTA", JOptionPane.YES_NO_OPTION);
            if(x == 0 || x == -1) System.exit(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemMotorista = new javax.swing.JMenuItem();
        jMenuItemModelo = new javax.swing.JMenuItem();
        jMenuItemOnibus = new javax.swing.JMenuItem();
        jMenuItemViagem = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIAÇÃO NOSSA SENHORA DE MEDIANEIRA ltda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenuCadastro.setText("Cadastros");
        jMenuCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItemMotorista.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItemMotorista.setText("Motorista");
        jMenuItemMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMotoristaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMotorista);

        jMenuItemModelo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItemModelo.setText("Modelo");
        jMenuItemModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModeloActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemModelo);

        jMenuItemOnibus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItemOnibus.setText("Ônibus");
        jMenuItemOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOnibusActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemOnibus);

        jMenuItemViagem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItemViagem.setText("Viagem");
        jMenuItemViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViagemActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemViagem);

        jMenuBar1.add(jMenuCadastro);

        jMenuVenda.setText("Vendas");
        jMenuVenda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem2.setText("Passagem");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItem2);

        jMenuBar1.add(jMenuVenda);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem1);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sair();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.sair();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMotoristaActionPerformed
        try {
            CadastroMotorista janela = new CadastroMotorista(this.tela);
            this.tela.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemMotoristaActionPerformed

    private void jMenuItemModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModeloActionPerformed
        try {
            CadastroModelo janela = new CadastroModelo(this.tela);
            this.tela.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemModeloActionPerformed

    private void jMenuItemOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOnibusActionPerformed
        try {
            CadastroOnibus janela = new CadastroOnibus(this.tela);
            this.tela.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemOnibusActionPerformed

    private void jMenuItemViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViagemActionPerformed
        try {
            CadastroViagem janela = new CadastroViagem(this.tela);
            this.tela.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemViagemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            VendaPassagem janela = new VendaPassagem(this.tela);
            this.tela.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemModelo;
    private javax.swing.JMenuItem jMenuItemMotorista;
    private javax.swing.JMenuItem jMenuItemOnibus;
    private javax.swing.JMenuItem jMenuItemViagem;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVenda;
    // End of variables declaration//GEN-END:variables
}