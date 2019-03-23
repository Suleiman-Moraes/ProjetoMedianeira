package util;

import interfaces.IDesmaterializar;

public class Ordenar extends ClasseOrdenacao{
    private int indice;

    public Ordenar(int indice) {
        this.indice = indice;
    }
    
    @Override
    public boolean compara(Object a, Object b)throws Exception{
        String[] aa = ((IDesmaterializar)a).desmaterializar();
        String[] bb = ((IDesmaterializar)b).desmaterializar();
        if((aa[indice]+"").compareToIgnoreCase(bb[indice]+"") <= 0) return true;
            
        return false;
    }
    
}
