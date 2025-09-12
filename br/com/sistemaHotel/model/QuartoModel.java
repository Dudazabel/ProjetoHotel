public class QuartoModel {

    private int numero;
    private String tipo;
    private double preco;

    public QuartoModel(){
        this.numero = 0;
        this.tipo = "";
        this.preco = 0.0;
    }

    public QuartoModel(int numero, String tipo, double preco){
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Número: " + numero + " | Tipo: " + tipo + " | Preço: " + preco;
    }
    
}
