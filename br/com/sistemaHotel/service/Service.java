import java.util.Scanner;

public class Service {
    Scanner leia = new Scanner (System.in);

    List<HospedeModel> hospedes = new ArrayList<>();

    public void Gerenciar(int opcao, View atendente) {

        switch (opcao) {

            case 0 -> {
                System.out.println ("Saindo... ;)");
            }
            case 1 -> {
                String nome = atendente.cadastrarNome();
                String telefone = atendente.cadastrarTelefone();
                String documento = atendente.cadastrarDocumento();

                HospedeModel hospede = new HospedeModel (nome, telefone, documento);
                hospedes.add(hospede);
            }
            case 2 -> {
                for (int i = 0; i < hospedes.size(); i++){
                    HospedeModel hospede = hospedes.get(i);

                    System.out.println ("Índice: "+i);
                    atendente.listarHospede(hospede);
                }
            }
            case 3 -> {
                // pesquisar por CPF
            }
            case 4 -> {
                // remover por CPF
            }
            case 5 -> {
                // atualizar hóspede
            }
            case 6 -> {
                // quantidade de hóspedes
            }
            case 7 -> {
                // listar maiores de idade
            }
            case 8 -> {
                // listar menores de idade
            }
            case 9 -> {
                // pesquisar por nome parcial
            }
            case 10 -> {
                // limpar lista de hóspedes
            }
            default -> {
                // opção inválida
            }
        }
    }


}
