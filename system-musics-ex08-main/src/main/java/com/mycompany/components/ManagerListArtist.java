/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.components;

import com.mycompany.classes.Album;
import com.mycompany.classes.Artist;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Windows
 */
public class ManagerListArtist {
    private List<Artist> listArtist;
    
    public ManagerListArtist() {
        this.listArtist = new ArrayList<>();
    }

    public List<Artist> getListArtist() {
        return listArtist;
    }

    public void setListArtist(List<Artist> listArtist) {
        this.listArtist = listArtist;
    }
    
    public void addArtist(Artist artist) {
        this.listArtist.add(artist);
    }
    
    public Artist ArtistMoreAlbuns() {
        Map<Artist, Integer> countAlbunsForArtist = new HashMap<>();
        
        for(Artist artist : listArtist) {
            int numAlbuns = artist.getListAlbum().size();
            countAlbunsForArtist.put(artist, numAlbuns);
        }
        
        int maxAlbuns = 0;
        Artist artistMoreAlbuns = null;
        
        for(Map.Entry<Artist, Integer> entry :  countAlbunsForArtist.entrySet()) {
            if(entry.getValue() > maxAlbuns) {
                maxAlbuns = entry.getValue();
                artistMoreAlbuns = entry.getKey();
            }
        }
        return artistMoreAlbuns;
    }
    
    public Album AlbumMoreMusics() {
        Album albumMoreMusic = null;
        int  maxMusics = 0;
        
        for(Artist artist : listArtist) {
            for(Album album : artist.getListAlbum()) {
                int numMusics = album.getListMusic().size();
                if(numMusics > maxMusics) {
                    maxMusics = numMusics;
                    albumMoreMusic = album;
                }
            }
        }
        return albumMoreMusic;
    }
}
