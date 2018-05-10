package util;

import enun.Legenda;
import interfaces.ICrudDao;
import java.util.Iterator;
import java.util.List;

public abstract class ClasseOrdenacao{
    
    public Iterator bolha(Legenda legenda) throws Exception{
        int i, j;
        ICrudDao tt = (ICrudDao) Class.forName(legenda.getService()).newInstance();
        List<Object> vetor = tt.visualizarAll();
//        System.out.println(veto.hasNext());
//        while(veto.hasNext()){
//            Object o = veto.next();
//            vetor.add(o);
//        }
//        veto.forEachRemaining(x -> vetor.add(x));
        Object aux = null;
        boolean troca = false;
        for (i = vetor.size() - 1; i > 0; i--) {
            troca = false;
            
            for (j = 0; j < i; j++) {
                if(!(compara(vetor.get(j), vetor.get(j + 1)))){
                    aux = vetor.get(j);
                    vetor.set(j, vetor.get(j + 1));
                    vetor.set(j + 1, aux);
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
        return vetor.iterator();
    }

    public abstract boolean compara(Object a, Object b)throws Exception;
}
