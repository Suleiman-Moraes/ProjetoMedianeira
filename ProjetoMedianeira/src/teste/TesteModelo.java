package teste;

import java.util.Scanner;
import model.Modelo;
import service.ModeloService;

public class TesteModelo {
    public static void main(String[] args) {
        System.out.println("Teste Automático crud simples ");
        Scanner leia = new Scanner(System.in);
        try {
            ModeloService service = new ModeloService();
            Modelo y = new Modelo();
            y.setMarca("Marca teste2");
            y.setGeracao("GT");
            y.setModelo("Teste Modelo2");
            y.setTipo("TT");
            y.setPoltrona(44);
           
            service.salvar(y);
            System.out.println("Salvo com sucesso!\n\n\n");
            leia.nextLine();
            
            y.setMarca("Marca teste Alterar");
            service.salvar(y);
            System.out.println("Alterado com sucesso!\n\n\n");
            leia.nextLine();
            
            System.out.println("Marca : " + service.visualizarUm(y.getId()).getMarca());
            System.out.println("Consultado com sucesso!\n\n\n");
            leia.nextLine();
            
            service.deletar(y.getId());
            System.out.println("Deletado com sucesso!\n\n\n");
            leia.nextLine();
            
            service.visualizarAll().forEachRemaining(x -> System.out.println("Id: " + x.getId() + " || Marca: " + x.getMarca()));
            System.out.println("Listado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
