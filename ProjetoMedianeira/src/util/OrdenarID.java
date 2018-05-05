package util;

import java.util.Vector;

public class OrdenarID extends ClasseOrdenacao{

    @Override
    public boolean compara(Vector a, Vector b)throws Exception{
        try {
            if(new Integer(a.get(0)+"") <= new Integer(b.get(0)+"")) return true;
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
}
