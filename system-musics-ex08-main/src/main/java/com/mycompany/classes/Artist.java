/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class Artist {
    private String name;
    List<Album> listAlbum;
    
    public Artist() {
        this.name = "";
        this.listAlbum = new ArrayList<>();
    }

    public Artist(String name) {
        this.name = name;
        this.listAlbum = new ArrayList<>();
    }
    
    public void setArtist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }
    
    public void addAlbum(Album newAlbum) {
        this.listAlbum.add(newAlbum);
    }
    
      public void addMusicInAlbum(String nameAlbum, Music music) {
    for (Album alb : listAlbum) {
        if (alb.getName().equals(nameAlbum)) {
            if (alb.getListMusic() == null) {
                alb.setListMusic(new ArrayList<>()); // Inicialize a lista de músicas se for nula
            }
            alb.getListMusic().add(music);
        }
    }
}

    @Override
    public String toString() {
        return "Artist{" + "name=" + name + 
                ", listAlbuns=" + listAlbum + '}';
    }
}
