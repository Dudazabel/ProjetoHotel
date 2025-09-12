
public class Main {
    public static void main(String[] args) {

		int opcao = 0;

		View atendente = new View();
		Service atendimento = new Service();

		do {

			opcao = atendente.menu();
			estoque.Gerenciar(opcao, atendente);

		} while (opcao != 0);
	}
}
