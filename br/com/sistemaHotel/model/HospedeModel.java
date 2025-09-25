package br.com.sistemaHotel.model;

public class HospedeModel {

    private String nome;
    private String documento;
    private String telefone;

    public HospedeModel(){
        this.nome = "";
        this.documento = "";
        this.telefone = "";
    }

    public HospedeModel(String nome, String documento, String telefone){
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDocumento(){
        return this.documento;
    }

    public void setTipo(String documento){
        this.documento = documento;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | Documento: " + documento + " | Telefone: " + telefone;
    }
}
