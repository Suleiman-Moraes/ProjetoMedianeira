package util;

import interfaces.IOrdenacao;

public class OrdenarID extends ClasseOrdenacao{

    @Override
    public boolean compara(Object a, Object b)throws Exception{
        try {
            String aa = ((IOrdenacao)a).atributoIndentificador();
            String bb = ((IOrdenacao)b).atributoIndentificador();
            if(new Integer(aa+"") <= new Integer(bb+"")) return true;
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
}
