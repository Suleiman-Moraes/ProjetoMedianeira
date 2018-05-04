package util;

import interfaces.IOrdenacao;
import java.util.List;

public abstract class ClasseOrdenacao{
    
    public List bolha(List<IOrdenacao> vetor) throws Exception{
        int i, j;
        IOrdenacao aux = null;
        boolean troca = false;
        for (i = vetor.size() - 1; i > 0; i--) {
            troca = false;
            
            for (j = 0; j < i; j++) {
                if(!(compara(vetor.get(j), vetor.get(j + 1)))){
                    aux.set(vetor.get(j));
                    vetor.get(j).set(vetor.get(j + 1));
                    vetor.get(j + 1).set(aux);
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
        return vetor;
    }

    public abstract boolean compara(IOrdenacao a, IOrdenacao b)throws Exception;
}
