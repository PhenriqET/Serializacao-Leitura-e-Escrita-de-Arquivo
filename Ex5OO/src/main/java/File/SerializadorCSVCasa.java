package File;

import Classes.Casa;
import java.util.ArrayList;
import java.util.List;


public class SerializadorCSVCasa {
    public String toCSV(List<Casa> casas){
        String csv = "Tipo;Quartos;Banheiro;Area;Preco;" + "\n";
            for(Casa casa : casas){
                csv += casa.getTipo() + ";"
                    + casa.getQuartos() + ";"
                    + casa.getBanheiros() + ";"
                    + casa.getArea() + ";"
                    + casa.getPreco() + ";";
            }
        return csv;
    }
    
    public List<Casa> fromCSV(String data){
        List<Casa> casas = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for(int i = 1; i < linhas.length; i++){
            String[] partes = linhas[i].split(";");
            if(partes.length >= 5){
                Casa casa = new Casa();
                casa.setTipo(partes[0]);
                casa.setQuartos(Integer.parseInt(partes[1]));
                casa.setBanheiros(Integer.parseInt(partes[2]));
                casa.setArea(Double.parseDouble(partes[3]));
                casa.setPreco(Double.parseDouble(partes[4]));
                
                casas.add(casa);
            }
        }
        return casas;
    }
    
}
