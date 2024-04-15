package Classes;


public class Produto {
    private String nome;
    private double custo;
    private double preco;
    private String cor;
    
    //Metodos
    
    public Produto() {
        this.nome = "";
        this.custo = 0.0;
        this.preco = 0.0;
        this.cor = "";
    }
    
    public Produto(String nome, double custo, double preco, String cor) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
        this.cor = cor;
    }
    
    public void Copia(Produto copia) {
        this.nome = copia.nome;
        this.custo = copia.custo;
        this.preco = copia.preco;
        this.cor = copia.cor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Produto { Nome: " + nome 
                + ", Custo: " + custo 
                + ", Preco: " + preco 
                + ", Cor: " + cor + '}';
    }
    
    
    
}
