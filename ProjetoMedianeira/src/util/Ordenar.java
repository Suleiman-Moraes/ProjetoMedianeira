package util;

import java.util.Vector;

public class Ordenar extends ClasseOrdenacao{
    private int indice;

    public Ordenar(int indice) {
        this.indice = indice;
    }
    
    @Override
    public boolean compara(Vector a, Vector b)throws Exception{
        if((a.get(indice)+"").compareToIgnoreCase(b.get(indice)+"") <= 0) return true;
            
        return false;
    }
    
}
