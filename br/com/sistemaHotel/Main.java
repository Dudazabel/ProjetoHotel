import br.com.sistemaHotel.service.Service;
import br.com.sistemaHotel.view.View;

public class Main {
    public static void main(String[] args) {


        int opcao = 0;

        View atendente = new View();
        Service atendimento = new Service();

        do {

            opcao = atendente.menu();
            atendimento.Gerenciar(opcao, atendente);

        } while (opcao != 0);

    }
}