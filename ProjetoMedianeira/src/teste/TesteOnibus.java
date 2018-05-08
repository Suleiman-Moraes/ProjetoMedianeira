package teste;

import java.util.Scanner;
import model.Modelo;
import model.Onibus;
import service.OnibusService;

public class TesteOnibus {
    public static void main(String[] args) {
        System.out.println("Teste Automático crud simples ");
        Scanner leia = new Scanner(System.in);
        try {
            OnibusService service = new OnibusService();
            Onibus y = new Onibus();
            
            y.setAno("2018");
            y.setModelo(new Modelo("", "", "", "", 1, 1));
            y.setNumero("6003");
            
            service.salvar(y);
            System.out.println("Salvo com sucesso!\n\n\n");
            leia.nextLine();
            
            y.setAno("2020");
            service.salvar(y);
            System.out.println("Alterado com sucesso!\n\n\n");
            leia.nextLine();
            
            System.out.println("Numero : " + service.visualizarUm(y.getNumero()).getNumero());
            System.out.println("Consultado com sucesso!\n\n\n");
            leia.nextLine();
            
            service.deletar(y.getNumero());
            System.out.println("Deletado com sucesso!\n\n\n");
            leia.nextLine();
            
            service.visualizarAll().forEachRemaining(x -> System.out.println("Numero: " + x.getNumero() + " || Ano: " + x.getAno()));
            System.out.println("Listado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
