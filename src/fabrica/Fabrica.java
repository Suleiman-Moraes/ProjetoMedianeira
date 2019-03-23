package fabrica;

import apresentacao.cadastro.CadastroModelo;
import apresentacao.cadastro.CadastroMotorista;
import apresentacao.cadastro.CadastroOnibus;
import apresentacao.cadastro.CadastroViagem;
import apresentacao.venda.VendaPassagem;
import enun.Legenda;
import interfaces.ICrudDao;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import model.Modelo;
import model.Motorista;
import model.Onibus;
import model.Passagem;
import model.Viagem;
import persistencia.ViagemDao;
import service.ModeloService;
import service.MotoristaService;
import service.OnibusService;
import service.PassagemService;
import service.ViagemService;

public abstract class Fabrica extends JInternalFrame{
    protected JDesktopPane principal;
    protected Object objeto;

    public static Fabrica getInstance(Legenda legenda, JDesktopPane principal, Object ...objeto)throws Exception{
        Fabrica ff = null;
        switch (legenda){
            case MODELO:
                Modelo objet = new ModeloService().visualizarUm(new Integer((String) objeto[0]));
                ff = new CadastroModelo(principal, objet);
            break;
            case MOTORISTA:
                Motorista obje = new MotoristaService().visualizarUm(new Integer((String) objeto[0]));
                ff = new CadastroMotorista(principal, obje);
            break;
            case ONIBUS:
                Onibus onibus = new OnibusService().visualizarUm((String) objeto[0]);
                ff = new CadastroOnibus(principal, onibus);
            break;
            case PASSAGEM:
                Passagem passagem = new PassagemService().visualizarUm(
                    new Integer((String) objeto[0]), new Integer((String) objeto[1]));
                ff = new VendaPassagem(principal, passagem);
            break;
            case VIAGENS:
                Viagem viage = new ViagemService().visualizarUm(new Integer((String) objeto[0]));
                ff = new VendaPassagem(principal, new Passagem(viage));
            break;
            case VIAGEM:
                Viagem viagem = new ViagemService().visualizarUm(new Integer((String) objeto[0]));
                ff = new CadastroViagem(principal, viagem);
            break;
            default:
            break;
        }
        return ff;
    }
    
    public static Fabrica getInstance(Legenda legenda, JDesktopPane principal)throws Exception{
        Fabrica ff = (Fabrica) Class.forName(legenda.getPacote()+legenda.getClasse()).newInstance();
        ff.setPrincipal(principal);
        return ff;
    }
    
    public void setPrincipal(JDesktopPane principal){
        this.principal = principal;
    }
    
    public static List getInstance(Legenda legenda) throws Exception{
        if(legenda == Legenda.VIAGENS){
            return new ViagemDao().visualizarAPartirDeHoje();
        }
        else{
            ICrudDao tt = (ICrudDao) Class.forName(legenda.getService()).newInstance();
            return tt.visualizarAll();
        }
    }
}
