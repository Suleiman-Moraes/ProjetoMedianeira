package util;

import java.util.Vector;

public abstract class ClasseOrdenacao{
    
    public Vector bolha(Vector<Vector> vetor) throws Exception{
        int i, j;
        Vector aux = null;
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
        return vetor;
    }

    public abstract boolean compara(Vector a, Vector b)throws Exception;
}
