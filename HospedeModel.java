public class HospedeModel {
    
    private String nome;
    private int documento;
    private String telefone;

    public HospedeModel(){
        this.nome = "";
        this.documento = 0;
        this.telefone = "";
    }

    public HospedeModel(String nome, int documento, String telefone){
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

    public int getDocumento(){
        return this.documento;
    }

    public void setTipo(int documento){
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
