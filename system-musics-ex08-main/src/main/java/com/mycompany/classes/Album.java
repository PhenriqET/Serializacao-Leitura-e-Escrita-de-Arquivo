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
public class Album {
    private String name;
    private Integer releaseYear;
    List<Music> listMusic;
    
    public Album() {
        this.name = "";
        this.releaseYear = 0;
        this.listMusic = new ArrayList<>();
    }
    
    public Album(String name, Integer releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }
    
    public Album(Album orig) {
        this.name = orig.getName();
        this.releaseYear = orig.getReleaseYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Music> getListMusic() {
        return listMusic;
    }

    public void setListMusic(List<Music> listMusic) {
        this.listMusic = listMusic;
    }
    
    public void addMusic(Music newMusic) {
        this.listMusic.add(newMusic);
    }

    @Override
    public String toString() {
        return "Music{" + "name=" + name + 
                ", releaseYear=" + releaseYear + 
                ", listMusics=" + listMusic + '}';
    }
}
