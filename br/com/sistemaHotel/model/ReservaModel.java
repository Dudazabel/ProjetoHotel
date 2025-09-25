package br.com.sistemaHotel.model;

import br.com.sistemaHotel.model.QuartoModel;
import br.com.sistemaHotel.model.HospedeModel;

public class ReservaModel {

    private String dataEntrada;
    private String dataSaida;

    private QuartoModel quartoModel = new QuartoModel();
    private HospedeModel hospedeModel = new HospedeModel();

    public ReservaModel(String nome, int numero, String dataEntrada, String dataSaida){
        this.hospedeModel.setNome(nome);
        this.quartoModel.setNumero(numero);
        this.dataEntrada= dataEntrada;
        this.dataSaida = dataSaida;
    }

    public HospedeModel getHospedeModel() {
        return hospedeModel;
    }

    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida){
        this.dataSaida = dataSaida;
    }

    public String getDataEntrada(){
        return this.dataEntrada;
    }

    public String getDataSaida(){
        return this.dataSaida;
    }

    @Override
    public String toString(){
        return "Nome: " + hospedeModel.getNome() + " | Número do Quarto: " + quartoModel.getNumero() + " | Data de Entrada: " + dataEntrada + " | Data de Saída: " + dataSaida;
    }

}
