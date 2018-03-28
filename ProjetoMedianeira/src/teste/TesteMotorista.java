package teste;

import model.Motorista;
import service.MotoristaService;

public class TesteMotorista {
    public static void main(String[] args) {
        System.out.println("Teste Automático crud simples ");
        
        try {
            MotoristaService service = new MotoristaService();
            Motorista y = new Motorista();
            y.setNome("Novo Motorista");
            y.setLocalizacao("Goiânia");
            y.setCnh("12345678901");
            
            service.salvar(y);
            System.out.println("Salvo com sucesso!\n\n\n");
            
            y.setNome("Alterar Nome");
            service.salvar(y);
            System.out.println("Alterado com sucesso!\n\n\n");
            
            System.out.println("Nome : " + service.visualizarUm(y.getId()).getNome());
            System.out.println("Consultado com sucesso!\n\n\n");
            
            service.deletar(y.getId());
            System.out.println("Deletado com sucesso!\n\n\n");
            
            service.visualizarAll().forEach(x -> System.out.println("Id: " + x.getId() + " || Nome: " + x.getNome()));
            System.out.println("Listado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
