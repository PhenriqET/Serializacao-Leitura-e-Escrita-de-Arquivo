package com.mycompany.classes;

import java.util.List;


public class SerializadorCSVMusica {
    
    public String toCSV(List<Music> music){
        String csv = "Titulo;Duracao;\n";
        for(Music m : music){
            csv += m.getTitle() + ";"
                + m.getDuration() + ";\n";
        }
        return csv;
    }
    
    Public List<Music> fromCSV(String data){
        List<Music> music = new ArrayList<>();
        
        
    }
    
}
