package Classes;


public class Casa {
    private String tipo;
    private int quartos;
    private int banheiros;
    private double area;
    private double preco;
    
    public Casa() {
        this.tipo = "";
        this.quartos = 0;
        this.banheiros = 0;
        this.area = 0.0;
        this.preco = 0.0;
    }

    public Casa(String tipo, int quartos, int banheiros, double area, double preco) {
        this.tipo = tipo;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.area = area;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuartos() {
        return quartos;
    }
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }
    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Casa{ Tipo: " + tipo 
                + ", Quartos: " + quartos 
                + ", Banheiros: " + banheiros 
                + ", Area: " + area 
                + ", Preco: " + preco + '}';
    }
    
    
    
}