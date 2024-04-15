package meugrupo.ex5oo;

import Classes.Casa;
import Componentes.GerenciadorDeCasa;
import java.io.IOException;


public class Ex5OO {

    public static void main(String[] args) throws IOException {
        GerenciadorDeCasa gp1 = new GerenciadorDeCasa();
        Casa casa1 = new Casa("Apartamento", 2, 1, 70.0, 250000);
        Casa casa2 = new Casa("Casa", 3, 2, 120.0, 500000);
        Casa casa3 = new Casa("Cobertura", 4, 3, 250.0, 1000000.0);
        Casa casa4 = new Casa("Sobrado", 4, 4, 300.0, 800000.0);
        
        gp1.addCasa(casa1);
        gp1.addCasa(casa2);
        gp1.addCasa(casa3);
        gp1.addCasa(casa4);
        
        gp1.salvarNoArquivo("Teste.txt");
        
    }
}
