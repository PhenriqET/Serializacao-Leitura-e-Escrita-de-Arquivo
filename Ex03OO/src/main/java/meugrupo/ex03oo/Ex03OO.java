package meugrupo.ex03oo;

import Classes.Animal;
import Componentes.GerenciadorDeAnimal;
import java.io.IOException;


public class Ex03OO {

    public static void main(String[] args) throws IOException {
        GerenciadorDeAnimal gp1 = new GerenciadorDeAnimal();
        Animal animal1 = new Animal("201", "Cachorro" , "Golden Retriever", 3, 30);
        Animal animal2 = new Animal("202", "Gato", "Siames", 2, 4);
        Animal animal3 = new Animal("203", "Papagaio", "Araruana", 5, 1);
        Animal animal4 = new Animal("204", "Cavalo", "Puro-Sangue Ingles", 6,500);
        
        gp1.addAnimal(animal1);
        gp1.addAnimal(animal2);
        gp1.addAnimal(animal3);
        gp1.addAnimal(animal4);
        
        gp1.salvarNoArquivo("Teste.txt");
        
    }
}
