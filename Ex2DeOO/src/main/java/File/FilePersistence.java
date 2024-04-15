package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FilePersistence {
    
    public void saveToFile(String texto, String filePath) throws IOException{
        FileWriter arq = new FileWriter(filePath);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.print(texto);
        arq.close();
    }
    
    public String loadFromFile(String filePath) throws FileNotFoundException{
        String conteudoLido = "";
        
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        
        scanner.useDelimiter("\\Z");//Ler ate o final da linha
        while(scanner.hasNext()){
            conteudoLido += scanner.next();
        }
        return conteudoLido;
    }
}
