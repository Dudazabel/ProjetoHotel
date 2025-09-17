import java.util.Scanner;

public class Service {
    Scanner leia = new Scanner (System.in);

    List<HospedeModel> hospedes = new ArrayList<>();
    List<QuartoModel> quartos = new ArrayList<>();
    List<ReservaModel> reservas = new ArrayList<>();

    HospedeModel hospedeR = new HospedeModel();

    public void Gerenciar(int opcao, View atendente) {

        String nome;
        String telefone;
        String documento;
        int numero;
        String tipo;
        double preco;
        String hospede;
        int quarto;
        String dataEntrada;
        String dataSaida;

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

                QuartoModel quarto = new Quarto(numero, tipo, preco);
                quartos.add(quarto);
                
            }

            case 3 -> {
                hospede = atendente.cadastrarHospede();
                try{
                    String quartoR = atendente.cadastrarQuarto();
                    quarto = Integer.parseInt(quertoR);
                }catch(NumberFormatException erro){
                    atendente.erroCatch();
                }
                dataEntrada = atendente.cadastrarDataEntrada();
                dataSaida = atendente.cadastrarDataSaida();

                ReservaModel reserva = new Reserva(hospede, quarto, dataEntrada, dataSaida);
                reservas.add(reserva);
            }
            case 4 -> {
                for(HospedeModel hospedeL : hospedes){
                    
                }
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
