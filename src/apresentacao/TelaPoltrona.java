package apresentacao;
import apresentacao.venda.VendaPassagem;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.Passagem;

public class TelaPoltrona extends JInternalFrame implements ActionListener{
    private JButton jb2 = new JButton("Sair");
    private Passagem passagem;
    private int linha;
    private JDesktopPane tela;
    private Vector<JButton> vet = new Vector<>();

    public TelaPoltrona(JDesktopPane tela, List<Boolean> lista, Passagem passagem) {
        this.passagem = passagem;
        jb2.addActionListener(this);
        this.tela = tela;
        
        linha = (lista.size()+2) / 4;
        int cont = 0;
        for (int i = 0; i < lista.size(); i++) {
            
            JButton aux = new JButton((i+1)+"");
            if(lista.get(i)){
                aux.setEnabled(false);
            }else{
                cont++;
            }
            aux.addActionListener(this);
            vet.add(aux);
        }
        
        setLayout(new GridLayout(linha,4));
        for (int i = 0; i < vet.size(); i++) {
            add(vet.get(i));
        }
        if(cont == 0){
            this.setClosable(true);
            JInternalFrame janela = null;
            janela = new VendaPassagem(tela, passagem, 0);
            tela.add(janela);
            janela.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(rootPane, "Ônibus Lotado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        
//        add(jb2);
    }
    
    public void actionPerformed(ActionEvent e){
//        if(e.getSource()==jb) JOptionPane.showMessageDialog(null,"Hellow Word");
//        //System.out.println("Hello Word");
        if(e.getSource()==jb2){
            dispose();
        }
        JInternalFrame janela = null;
        janela = new VendaPassagem(tela, passagem, new Integer(e.getActionCommand()));
        tela.add(janela);
        janela.setVisible(true);
        this.dispose();
    }
}
