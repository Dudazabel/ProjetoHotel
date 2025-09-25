package br.com.sistemaHotel.service;

import br.com.sistemaHotel.model.HospedeModel;
import br.com.sistemaHotel.model.QuartoModel;
import br.com.sistemaHotel.model.ReservaModel;
import br.com.sistemaHotel.view.View;

import java.util.ArrayList;
import java.util.List;
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
        int numero = 0;
        String tipo;
        double preco = 0;
        String hospede;
        int quarto = 0;
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

                HospedeModel hospedeM = new HospedeModel (nome, documento, telefone);
                hospedes.add(hospedeM);
                System.out.println("\n✔ Hóspede cadastrado com sucesso!");
            }

            case 2 -> {
                try {
                    String numeroC = atendente.cadastrarNumero();
                    numero = Integer.parseInt(numeroC);
                } catch (NumberFormatException erro){
                    atendente.erroCatch();
                }
                tipo = atendente.cadastrarTipo();

                try{
                    String precoC = atendente.cadastrarPreco();
                    preco = Double.parseDouble(precoC);

                } catch(NumberFormatException erro){
                    atendente.erroCatch();
                }

                QuartoModel quartoM = new QuartoModel(numero, tipo, preco);
                quartos.add(quartoM);
                System.out.println("\n✔ Quarto cadastrado com sucesso!");

            }

            case 3 -> {
                hospede = atendente.cadastrarHospede();
                try{
                    String quartoR = atendente.cadastrarQuarto();
                    quarto = Integer.parseInt(quartoR);
                }catch(NumberFormatException erro){
                    atendente.erroCatch();
                }
                dataEntrada = atendente.cadastrarDataEntrada();
                dataSaida = atendente.cadastrarDataSaida();

                ReservaModel reserva = new ReservaModel(hospede, quarto, dataEntrada, dataSaida);
                reservas.add(reserva);
                System.out.println("\n✔ Reserva realizada com sucesso!");
            }
            case 4 -> {
                if(hospedes.isEmpty()){
                    System.out.println("\n❌ Nenhum hóspede cadastrado.");
                } else {
                    System.out.println("\nHóspedes cadastrados: ");
                    for(HospedeModel hospedeImprimir : hospedes) {
                        System.out.println("----------------------------------------------------");
                        System.out.println(hospedeImprimir);
                    }
                }
            }
            case 5 -> {
                if(quartos.isEmpty()){
                    System.out.println("\n❌ Nenhum quarto cadastrado!");
                } else {
                    System.out.println("\nQuartos cadastrados:");
                    for(QuartoModel quartoImprimir : quartos){
                        System.out.println("----------------------------------------------------");
                        System.out.println(quartoImprimir);
                    }
                }
            }
            case 6 -> {
                if(reservas.isEmpty()){
                    System.out.println("\n❌ Nenhuma reserva cadastrada!");
                } else {
                    System.out.println("\nReservas feitas:");
                    for(ReservaModel reservaImprimir : reservas){
                        System.out.println("----------------------------------------------------");
                        System.out.println(reservaImprimir);
                    }
                }
            }
            case 7 -> {
                boolean encontrado = false;
                String nomeBusca = atendente.pesquisarHospede();

                if(hospedes.isEmpty()){
                    System.out.println("\n❌ Nenhum hóspede cadastrado.");
                }
                for(HospedeModel hospedeBusca : hospedes){
                    if(hospedeBusca.getNome().equalsIgnoreCase(nomeBusca)){
                        System.out.println("\n✔ Hóspede encontrado! Dados:");
                        System.out.println(hospedeBusca);
                        encontrado = true;
                    }
                    if(!encontrado){
                        System.out.println("\n❗Hóspede não encontrado! Revise sua pesquisa.");
                        break;
                    }
                }
            }
            case 8 -> {
                boolean encontrado = false;
                String tipoBusca = atendente.pesquisarQuarto();

                if(quartos.isEmpty()){
                    System.out.println("\n❌ Nenhum quarto cadastrado.");
                }
                for (QuartoModel quartoBusca : quartos){
                    if(quartoBusca.getTipo().equalsIgnoreCase(tipoBusca)){
                        System.out.println("\n✔ Quarto encontrado! Dados:");
                        System.out.println(quartoBusca);
                        encontrado = true;
                    }
                    if(!encontrado){
                        System.out.println("❗Quarto não encontrado! Revise sua pesquisa.");
                        break;
                    }
                }
            }
            case 9 -> {
                boolean encontrado = false;
                String nomeBusca = atendente.pesquisarReserva();

                if(reservas.isEmpty()){
                    System.out.println("\n❌ Nenhuma reserva cadastrada.");
                }
                for(ReservaModel reservaBusca : reservas){
                    if(reservaBusca.getHospedeModel().getNome().equalsIgnoreCase(nomeBusca)){
                        System.out.println("\n✔ Reserva encontrada! Dados:");
                        System.out.println(reservaBusca);
                        encontrado = true;
                    }
                    if(!encontrado){
                        System.out.println("❗Reserva não encontrada! Revise sua pesquisa.");
                        break;
                    }
                }
            }
            case 10 -> {

            }
            default -> {
                // opção inválida
            }
        }
    }


}
