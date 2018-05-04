package util;

import interfaces.IOrdenacao;

public class OrdenarDescricao_NomeID extends ClasseOrdenacao{

    @Override
    public boolean compara(IOrdenacao a, IOrdenacao b)throws Exception{
        String[] aa = {a.atributoDescricao_Nome(), a.atributoIndentificador()};
        String[] bb = {b.atributoDescricao_Nome(), b.atributoIndentificador()};
        
        for (int i = 0; i < bb.length; i++) {
            if(aa[i].compareToIgnoreCase(bb[i]) < 0) return true;
            else if(aa[i].compareToIgnoreCase(bb[i]) > 0) return false;
        }
        return true;
    }
    
}
