package File;

import Classes.Animal;
import java.util.ArrayList;
import java.util.List;


public class SerializadorCSVAnimal {
    
    public String toCSV(List<Animal> animais){
        String csv = "Codigo;Especie;Raca;Idade;Peso;" + "\n";
            for(Animal a1 : animais){
                csv += a1.getCod() + ";"
                    + a1.getEspecie() + ";"
                    + a1.getRaca() + ";"
                    + a1.getIdade() + ";"
                    + a1.getPeso() + ";";
            }
        return csv;
    }
    
    public List<Animal> fromCSV(String data){
        List<Animal> animais = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for(int i = 1; i < linhas.length; i++){
            String[] partes = linhas[i].split(";");
            if(partes.length >= 5){
                Animal animal = new Animal();
                animal.setCod(partes[0]);
                animal.setEspecie(partes[1]);
                animal.setRaca(partes[2]);
                animal.setIdade(Integer.parseInt(partes[3]));
                animal.setPeso(Double.parseDouble(partes[4]));
                
                animais.add(animal);
            }
        }
        return animais;
    }
    
}
