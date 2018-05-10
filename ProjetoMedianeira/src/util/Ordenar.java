package util;

import interfaces.IDesmaterializar;
import java.util.Vector;

public class Ordenar extends ClasseOrdenacao{
    private int indice;

    public Ordenar(int indice) {
        this.indice = indice;
    }
    
    @Override
    public boolean compara(Object a, Object b)throws Exception{
        Vector<String> aa = ((IDesmaterializar)a).desmaterializar();
        Vector<String> bb = ((IDesmaterializar)b).desmaterializar();
        if((aa.get(indice)+"").compareToIgnoreCase(bb.get(indice)+"") <= 0) return true;
            
        return false;
    }
    
}
