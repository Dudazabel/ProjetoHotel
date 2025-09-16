import java.util.Scanner;

public class Service {
    Scanner leia = new Scanner (System.in);

    List<HospedeModel> hospedes = new ArrayList<>();

    public void Gerenciar(int opcao, View atendente) {

        String nome;
        String telefone;
        String documento;
        int numero;
        String tipo;
        double preco;

        switch (opcao) {

            case 0 -> {
                atendente.sair();
            }

            case 1 -> {
                nome = atendente.cadastrarNome();
                telefone = atendente.cadastrarTelefone();
                documento = atendente.cadastrarDocumento();

                HospedeModel hospede = new HospedeModel (nome, telefone, documento);
                hospedes.add(hospede);
            }

            case 2 -> {
                try{
                    String numeroC = atendente.cadastrarNumero();
                    numero = Integer.parseInt(numeroC);
                }catch (NumberFormatException erro){
                    atendente.erroCatch();
                }
                tipo = atendente.cadastrarTipo();
                try{
                    String precoC = atendente.cadastrarPreco();
                    preco = Double.parseDouble(precoC);
                }catch(NumberFormatException erro){
                    atendente.erroCatch();
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
