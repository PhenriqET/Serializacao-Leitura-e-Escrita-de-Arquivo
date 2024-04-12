/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise08;

import com.mycompany.classes.Album;
import com.mycompany.classes.Artist;
import com.mycompany.classes.Music;
import com.mycompany.components.ManagerListArtist;

/**
 *
 * @author Windows
 */
public class Exercise08 {
   
    public static void main(String[] args) {
        Artist artista1 = new Artist("Artist1");
        Album album1 = new Album("Álbum 1", 2020);
        Album album2 = new Album("Álbum 2", 2021);

        artista1.addAlbum(album1);
        artista1.addAlbum(album2);

        Music musica1 = new Music("Música 1", 3.30);
        Music musica2 = new Music("Música 2", 4.00);

        artista1.addMusicInAlbum("Álbum 1", musica1);
        artista1.addMusicInAlbum("Álbum 1", musica2); 

        ManagerListArtist manager = new ManagerListArtist();

        manager.addArtist(artista1);

        Artist artistMoreAlbuns = manager.ArtistMoreAlbuns();

        System.out.println("Artist com mais álbuns: " + artistMoreAlbuns.getName());

        Album albumMoreMusics = manager.AlbumMoreMusics();

        System.out.println("Álbum com mais músicas: " + albumMoreMusics.getName());
    }
}
