package Componentes;

import Classes.Carro;
import File.FilePersistence;
import File.SerializadorCSVCarro;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeCarro {
    private List<Carro> carros;
    
    public GerenciadorDeCarro(){
        this.carros = new ArrayList<>();
    }
    
    public void addCarro(Carro carro){
        carros.add(carro);
    }
    
    public boolean removeCarro(String Modelo){
        for(Carro carro : carros){
            if(carro.getModelo().equalsIgnoreCase(Modelo)){
                carros.remove(carro);
                return true;
            }
        }
        return false;
    }
    
    public Carro pesquisarCarro(String Modelo){
        for(Carro carro : carros){
            if(carro.getModelo().equals(Modelo)){
                System.out.println("Carro encontrado");
                return carro;
            }
        }
        System.out.println("Carro nao encontrado");
        return null;
    }
    
    public void printCarro(){
        String write;
        for(Carro carro : carros){
            write = carro.toString();
            System.out.println(write);
        }
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializa a lista de produtos para String-csv
        SerializadorCSVCarro serializador = new SerializadorCSVCarro();
        String csvData = serializador.toCSV(carros);
        
        //Gravaremos no arquivo usando o filePersistence
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Carros salvos com sucesso em " + caminhoDoArquivo);
    }
    
}
