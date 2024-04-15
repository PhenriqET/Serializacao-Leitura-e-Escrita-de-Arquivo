package meugrupo.ex04oo;

import Classes.Carro;
import Componentes.GerenciadorDeCarro;


public class Ex04OO {

    public static void main(String[] args) {
        GerenciadorDeCarro gp1 = new GerenciadorDeCarro();
        Carro carro1 = new Carro("Chevrolet", "Onix", "2019", 50000.0);
        Carro carro2 = new Carro("Ford", "Mustang", "2021", 150000.0);
        Carro carro3 = new Carro("Volkswagen", "Gol", "2015", 35000);
        Carro carro4 = new Carro("Toyota", "Corolla", "2020", 80000);
        
        gp1.addCarro(carro1);
        gp1.addCarro(carro2);
        gp1.addCarro(carro3);
        gp1.addCarro(carro4);
        
        gp1.salvarNoArquivo("Teste.txt");
        
    }
}
