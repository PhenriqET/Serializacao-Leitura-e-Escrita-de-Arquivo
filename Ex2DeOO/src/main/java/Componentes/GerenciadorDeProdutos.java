package Componentes;

import Classes.Produto;
import File.FilePersistence;
import File.SerializadorCSVProduto;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeProdutos {
    private List<Produto> produtos;
    
    public GerenciadorDeProdutos(){
        produtos = new ArrayList<>();
    }
    
    public void addProduto(Produto p){
        produtos.add(p);
    }
    
    public boolean removeProduto(String nome){
        for(Produto p1 : produtos){
            if(p1.getNome().equals(nome)){
                produtos.remove(p1);
                System.out.println("Removido com sucesso!!");
                return true;
            }
        }
        System.out.println("Nao Encontrado!!");
        return false;
    }
    
    public Produto pesquisarProduto(String nome){
         for(Produto p1 : produtos){
            if(p1.getNome().equals(nome)){
                return p1;
            }
        }
        System.out.println("Produto nao encontrado!");
        return null;
    }
    
    public void printProduto(){
        String write;
        for(Produto p1 : produtos){
            write = p1.toString();
            System.out.println(write);
        }
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException {
        //Serializa a lista de produtos para String-csv
        SerializadorCSVProduto serializador = new SerializadorCSVProduto();
        String csvData = serializador.toCSV(produtos);
        
        //Gravaremos no arquivo usando o filePersistence
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos com sucesso em " + caminhoDoArquivo);
    }
    
    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        //carrega os dados do arquivo
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        //desserializa para Lista de produtos
        SerializadorCSVProduto serializador = new SerializadorCSVProduto();
        this.produtos = serializador.fromCSV(csvData);
        
        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }
    
}
