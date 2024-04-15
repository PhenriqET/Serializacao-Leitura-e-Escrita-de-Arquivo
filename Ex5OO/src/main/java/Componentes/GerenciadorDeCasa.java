package Componentes;

import Classes.Casa;
import File.FilePersistence;
import File.SerializadorCSVCasa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeCasa {
    List<Casa> casas;
    
    public GerenciadorDeCasa(){
        casas = new ArrayList<>();
    }
    
    public void addCasa(Casa casa){
        casas.add(casa);
    }
    
    public boolean removeCasa(String tipo){
        for(Casa casa : casas){
            if(casa.getTipo().equalsIgnoreCase(tipo)){
                casas.remove(casa);
                return true;
            }
        }
        return false;
    }
    
    public Casa pesquisarCasa(String tipo){
         for(Casa c1 : casas){
            if(c1.getTipo().equalsIgnoreCase(tipo)){
                return c1;
            }
        }
        System.out.println("Casa nao encontrado!");
        return null;
    }
    
    public void printCasa(){
        String write;
        for(Casa c1 : casas){
            write = c1.toString();
            System.out.println(write);
        }
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializa a lista de produtos para String-csv
        SerializadorCSVCasa serializador = new SerializadorCSVCasa();
        String csvData = serializador.toCSV(casas);
        
        //Gravaremos no arquivo usando o filePersistence
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Casas salvos com sucesso em " + caminhoDoArquivo);
    }
    
    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        //carrega os dados do arquivo
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        //desserializa para Lista de produtos
        SerializadorCSVCasa serializador = new SerializadorCSVCasa();
        this.casas = serializador.fromCSV(csvData);
        
        System.out.println("Casas carregados com sucesso de " + caminhoDoArquivo);
    }
    
}
