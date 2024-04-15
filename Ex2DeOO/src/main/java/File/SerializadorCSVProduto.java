package File;

import Classes.Produto;
import java.util.ArrayList;
import java.util.List;


public class SerializadorCSVProduto {
    
    public String toCSV(List<Produto> produtos){
        String csv = "Nome;Custo;Preco;Cor" + "\n";
            for(Produto p1 : produtos){
                csv += p1.getNome() + ";"
                     + p1.getCusto() + ";"
                     + p1.getPreco() + ";"
                     + p1.getCor() + ";\n";
            }
        return csv;
    }
    
    public List<Produto> fromCSV(String data){
        List<Produto> produtos = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for(int i = 1; i < linhas.length; i++){
            String[] partes = linhas[i].split(";");
            if(partes.length >= 4){
                Produto produto = new Produto();
                produto.setNome(partes[0]);
                produto.setCusto(Double.parseDouble(partes[1]));
                produto.setPreco(Double.parseDouble(partes[2]));
                produto.setCor(partes[3]);
                
                produtos.add(produto);
            }
        }
        return produtos;
    }
}
