package Classes;


public class Carro {
    private String marca;
    private String modelo;
    private String ano;
    private double preco;
    
    public Carro(){
        this.marca = "";
        this.modelo = "";
        this.ano = "";
        this.preco = 0.0;
    }
    
    public Carro(String marca, String modelo, String ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{ Marca: " + marca 
               + ", Modelo: " + modelo 
               + ", Ano: " + ano 
               + ", Preco: " + preco + '}';
    }
    
    
    
}
