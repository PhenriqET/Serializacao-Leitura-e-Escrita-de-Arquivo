package meugrupo.ex2deoo;

import Classes.Produto;
import Componentes.GerenciadorDeProdutos;
import java.io.IOException;


public class Ex2DeOO {

    public static void main(String[] args) throws IOException {
        GerenciadorDeProdutos gp1 = new GerenciadorDeProdutos();
        Produto produto1 = new Produto("Cadeira", 300.0, 399.0, "Branco");
        Produto produto2 = new Produto("Mesa", 500.0, 1000.0, "Preta");
        Produto produto3 = new Produto("Tapete", 230, 270, "Azul");
        
        gp1.addProduto(produto1);
        gp1.addProduto(produto2);
        gp1.addProduto(produto3);
        
        gp1.salvarNoArquivo("Teste.txt");
        
    }
}
