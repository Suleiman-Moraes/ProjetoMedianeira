package teste;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import model.Modelo;
import model.Motorista;
import model.Onibus;
import model.Viagem;
import service.ViagemService;

public class TesteViagem {
    public static void main(String[] args) {
        System.out.println("Teste Automático crud simples ");
        Scanner leia = new Scanner(System.in);
        try {
            ViagemService service = new ViagemService();
            Viagem y = new Viagem();
            
            y.setDataSaida(new Date(System.currentTimeMillis()));
            y.setTurno(true);
            y.setDe("Goiânia");
            y.setAte("Palmas");
            y.setOnibus(new Onibus("6000", "", new Modelo("", "", "", "", 1, 1)));
            y.setMotorista(new Motorista("", "", "", 1));
            
            service.salvar(y);
            System.out.println("Salvo com sucesso!\n\n\n");
            leia.nextLine();
            
            y.setTurno(false);
            service.salvar(y);
            System.out.println("Alterado com sucesso!\n\n\n");
            leia.nextLine();
            
            System.out.println("De : " + service.visualizarUm(y.getId()).getDe());
            System.out.println("Consultado com sucesso!\n\n\n");
            leia.nextLine();
            
            service.deletar(y.getId());
            System.out.println("Deletado com sucesso!\n\n\n");
            leia.nextLine();
            
            service.visualizarAll().forEach(x -> System.out.println("Id: " + x.getId() + " || Ate: " + x.getAte()));
            System.out.println("Listado com sucesso!");
            
            Calendar calendar = Calendar.getInstance();
            calendar.set(2018, 3, 1);
            System.out.println(service.retornarDisponibilidade(y.getMotorista(), calendar.getTime()));
            calendar.set(2018, 3, 2);
            System.out.println(service.retornarDisponibilidade(y.getMotorista(), calendar.getTime()));
            calendar.set(2018, 3, 3);
            System.out.println(service.retornarDisponibilidade(y.getMotorista(), calendar.getTime()));
            calendar.set(2018, 3, 4);
            System.out.println(service.retornarDisponibilidade(y.getMotorista(), calendar.getTime()));
            calendar.set(2018, 2, 22);
            System.out.println(service.retornarDisponibilidade(y.getMotorista(), calendar.getTime()));
            
            calendar.set(2018, 3, 1);
            System.out.println(service.retornarDisponibilidade(y.getOnibus(), calendar.getTime(), "Palmas"));
            calendar.set(2018, 3, 2);
            System.out.println(service.retornarDisponibilidade(y.getOnibus(), calendar.getTime(), "Palmas"));
            calendar.set(2018, 3, 3);
            System.out.println(service.retornarDisponibilidade(y.getOnibus(), calendar.getTime(), "Palmas"));
            calendar.set(2018, 3, 4);
            System.out.println(service.retornarDisponibilidade(y.getOnibus(), calendar.getTime(), "Goiânia"));
            calendar.set(2018, 2, 22);
            System.out.println(service.retornarDisponibilidade(y.getOnibus(), calendar.getTime(), "Goiânia"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
