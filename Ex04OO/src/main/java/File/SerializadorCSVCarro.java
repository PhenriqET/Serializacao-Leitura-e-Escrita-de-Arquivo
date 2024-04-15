package File;

import Classes.Carro;
import java.util.ArrayList;
import java.util.List;


public class SerializadorCSVCarro {
    public String toCSV(List<Carro> carros) {
        String csv = "Nome;Custo;Preco;\n";
        for (Carro carro : carros) {
            csv += carro.getMarca() + ";"
                + carro.getModelo() + ";"
                + carro.getAno() + ";"
                + carro.getPreco() + ";\n";
        }
        return csv;
    }
    
     public List<Carro> fromCSV(String Modelo) {
        List<Carro> carros = new ArrayList<>();
        
        String[] linhas = Modelo.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Carro carro = new Carro();
                carro.setMarca(partes[0]);
                carro.setModelo(partes[1]);
                carro.setAno(partes[2]);
                carro.setPreco(Double.parseDouble(Modelo));
                
                //apos montar um carro, adiciono na lista
                carros.add(carro);
            }
        }
        return carros;
    }
    
}
