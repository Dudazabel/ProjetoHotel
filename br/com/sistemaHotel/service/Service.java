package service;

import model.HospedeModel;
import model.QuartoModel;
import model.ReservaModel;
import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
	Scanner leia = new Scanner(System.in);

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

			case 0 : {
				atendente.sair();
				break;
			}

			case 1 :{
				nome = atendente.cadastrarNome();
				telefone = atendente.cadastrarTelefone();
				documento = atendente.cadastrarDocumento();

				HospedeModel hospedeM = new HospedeModel(nome, documento, telefone);
				hospedes.add(hospedeM);
				System.out.println("\n✔ Hóspede cadastrado com sucesso!");
				break;
			}

			case 2 :{
				boolean entradaValida = false;
				do {
					String numeroC = atendente.cadastrarNumero();
					try {

						numero = Integer.parseInt(numeroC);
						entradaValida = true;

					} catch (NumberFormatException erro) {
						atendente.erroCatch();
					}
				} while (!entradaValida);

				tipo = atendente.cadastrarTipo();

				entradaValida = false;

				do {
					String precoC = atendente.cadastrarPreco();
					try {
						preco = Double.parseDouble(precoC);
						entradaValida = true;

					} catch (NumberFormatException erro) {
						atendente.erroCatch();
					}
				} while (!entradaValida);

				QuartoModel quartoM = new QuartoModel(numero, tipo, preco);
				quartos.add(quartoM);
				System.out.println("\n✔ Quarto cadastrado com sucesso!");
				break;

			}

			case 3 :{
				hospede = atendente.cadastrarHospede();

				boolean entradaValida = false;
				do {

					String quartoR = atendente.cadastrarQuarto();
					try {
						quarto = Integer.parseInt(quartoR);
						entradaValida = true;
					} catch (NumberFormatException erro) {
						atendente.erroCatch();
					}
				} while (!entradaValida);
				
				dataEntrada = atendente.cadastrarDataEntrada();
				dataSaida = atendente.cadastrarDataSaida();

				ReservaModel reserva = new ReservaModel(hospede, quarto, dataEntrada, dataSaida);
				reservas.add(reserva);
				System.out.println("\n✔ Reserva realizada com sucesso!");
				break;
			}

			case 4 :{
				if (hospedes.isEmpty()) {
					System.out.println("\n❌ Nenhum hóspede cadastrado.");
				} else {
					System.out.println("\nHóspedes cadastrados: ");
					for (HospedeModel hospedeImprimir : hospedes) {
						
						if (hospedeImprimir instanceof HospedeModel) {
							System.out.println("----------------------------------------------------");
							System.out.println(hospedeImprimir);
						}
					}
				}
				break;
			}

			case 5 :{
				if (quartos.isEmpty()) {
					System.out.println("\n❌ Nenhum quarto cadastrado!");
				} else {
					System.out.println("\nQuartos cadastrados:");
					for (QuartoModel quartoImprimir : quartos) {
						System.out.println("----------------------------------------------------");
						System.out.println(quartoImprimir);
					}
				}
				break;
			}

			case 6 :{
				if (reservas.isEmpty()) {
					System.out.println("\n❌ Nenhuma reserva cadastrada!");
				} else {
					System.out.println("\nReservas feitas:");
					for (ReservaModel reservaImprimir : reservas) {
						System.out.println("----------------------------------------------------");
						System.out.println(reservaImprimir);
					}
				}
				break;
			}

			case 7 :{ 
				if (hospedes.isEmpty()) {
					System.out.println("\n❌ Nenhum hóspede cadastrado.");
					break;
				}
				boolean encontrado = false;
				String nomeBusca = atendente.pesquisarHospede();
				
				
				for (HospedeModel hospedeBusca : hospedes) {
					if (hospedeBusca.getNome().equalsIgnoreCase(nomeBusca)) {
						System.out.println("\n✔ Hóspede encontrado! Dados:");
						System.out.println(hospedeBusca);
						encontrado = true;
					}
				}
				if (!encontrado) {
					System.out.println("\n❌ Hóspede não encontrado!");
				}
				break;
			}

			case 8 :{ 
				if (quartos.isEmpty()) {
					System.out.println("\n❌ Nenhum quarto cadastrado.");
					break;
				}
				boolean encontrado = false;
				String tipoBusca = atendente.pesquisarQuarto();
				
				for (QuartoModel quartoBusca : quartos) {
					if (quartoBusca.getTipo().equalsIgnoreCase(tipoBusca)) {
						System.out.println("\n✔ Quarto encontrado! Dados:");
						System.out.println(quartoBusca);
						encontrado = true;
					}
				}
				
				if (!encontrado) {
					System.out.println("❌ Quarto não encontrado!");
				}
				break;
			}

			case 9 :{
				if (reservas.isEmpty()) {
					System.out.println("\n❌ Nenhuma reserva cadastrada.");
					break;
				}
				boolean encontrado = false;
				String nomeBusca = atendente.pesquisarReserva();
				
				for (ReservaModel reservaBusca : reservas) {
					if (reservaBusca.getHospedeModel().getNome().equalsIgnoreCase(nomeBusca)) {
						System.out.println("\n✔ Reserva encontrada! Dados:");
						System.out.println(reservaBusca);
						encontrado = true;
					}
				}
				
				if (!encontrado) {
					System.out.println("❌ Nenhuma reserva encontrada para este hóspede.");
				}
				break;
			}

			case 10 :{
				boolean encontrado = false;
				String nomeBusca = atendente.perguntarNomeParaEditar();

				if (hospedes.isEmpty()) {
					System.out.println("\n❌ Nenhum hóspede cadastrado para editar.");
					break;
				}

				for (HospedeModel hospedeEditar : hospedes) {
					if (hospedeEditar.getNome().equalsIgnoreCase(nomeBusca)) {
						System.out.println("\n✔ Hóspede encontrado! Insira os novos dados:");

						String novoNome = atendente.cadastrarNome();
						String novoTelefone = atendente.cadastrarTelefone();
						String novoDocumento = atendente.cadastrarDocumento();

						hospedeEditar.setNome(novoNome);
						hospedeEditar.setTelefone(novoTelefone);
						hospedeEditar.setDocumento(novoDocumento);

						System.out.println("\n✔ Dados do hóspede atualizados com sucesso!");
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("\n❌ Hóspede não encontrado!");
				}
				break;
			}

			case 11 :{
				String nomeBusca = atendente.perguntarNomeParaCancelarReserva();

				if (reservas.isEmpty()) {
					System.out.println("\n❌ Nenhuma reserva cadastrada para cancelar.");
					break;
				}

				List<ReservaModel> reservasEncontradas = new ArrayList<>();
				for (ReservaModel reserva : reservas) {
					if (reserva.getHospedeModel().getNome().equalsIgnoreCase(nomeBusca)) {
						reservasEncontradas.add(reserva);
					}
				}

				if (reservasEncontradas.isEmpty()) {

					System.out.println("\n❌ Nenhuma reserva encontrada para o hóspede informado.");

				} else if (reservasEncontradas.size() == 1) {

					reservas.remove(reservasEncontradas.get(0));
					System.out.println("\n✔ Reserva única encontrada e cancelada com sucesso!");

				} else {

					System.out.println(
							"\n✔ Múltiplas reservas encontradas para " + nomeBusca + ". Qual delas você deseja cancelar?");
					int i = 1;
					for (ReservaModel reserva : reservasEncontradas) {
						System.out.println(i + ". " + reserva);
						i++;
					}

					int escolha = atendente.escolherNumeroDaLista();

					if (escolha > 0 && escolha <= reservasEncontradas.size()) {

						ReservaModel reservaParaRemover = reservasEncontradas.get(escolha - 1);
						reservas.remove(reservaParaRemover);
						System.out.println("\n✔ Reserva cancelada com sucesso!");

					} else {
						System.out.println("\n❌ Opção inválida. Nenhuma reserva foi cancelada.");
					}
				}
				break;
			}

			default :{
				System.out.println("\n❌ Opção inválida! Por favor, digite um dos números listados no menu.");
				break;
			}
	
		}
	}

}
