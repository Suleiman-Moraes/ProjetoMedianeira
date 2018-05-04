package util;

import interfaces.IOrdenacao;

public class OrdenarIDDescricao_Nome extends ClasseOrdenacao{

    @Override
    public boolean compara(IOrdenacao a, IOrdenacao b)throws Exception{
        String[] aa = {a.atributoIndentificador(), a.atributoDescricao_Nome()};
        String[] bb = {b.atributoIndentificador(), b.atributoDescricao_Nome()};
        
        for (int i = 0; i < bb.length; i++) {
            if(aa[i].compareToIgnoreCase(bb[i]) < 0) return true;
            else if(aa[i].compareToIgnoreCase(bb[i]) > 0) return false;
        }
        return true;
    }
    
}
