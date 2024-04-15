package Componentes;

import Classes.Animal;
import File.FilePersistence;
import File.SerializadorCSVAnimal;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeAnimal {
    private List<Animal> animais;
    
    public GerenciadorDeAnimal(){
        this.animais = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal){
        this.animais.add(animal);
    }
    
    public boolean removeAnimal(String cod){
        for(Animal animal : animais){
            if(animal.getCod().equals(cod)){
                animais.remove(animal);
                System.out.println("Removido com Sucesso");
                return true;
            }
        }
        return false;
    }
    
    public Animal pesquisarAnimal(String cod){
        for(Animal animal : animais){
            if(animal.getCod().equalsIgnoreCase(cod)){
                return animal;
            }
        }
        return null;
    }
    
    public void printAnimal(){
        String write;
        for(Animal animal : animais){
            write = animal.toString();
            System.out.println(write);
        }
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializa a lista de produtos para String-csv
        SerializadorCSVAnimal serializador = new SerializadorCSVAnimal();
        String csvData = serializador.toCSV(animais);
        
        //Gravaremos no arquivo usando o filePersistence
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Animais salvos com sucesso em " + caminhoDoArquivo);
    }
    
    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        //carrega os dados do arquivo
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        //desserializa para Lista de produtos
        SerializadorCSVAnimal serializador = new SerializadorCSVAnimal();
        this.animais = serializador.fromCSV(csvData);
        
        System.out.println("Animais carregados com sucesso de " + caminhoDoArquivo);
    }
    
}
