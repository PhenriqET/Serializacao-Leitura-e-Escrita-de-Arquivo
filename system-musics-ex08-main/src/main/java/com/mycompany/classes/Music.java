/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;
/**
 *
 * @author Windows
 */
public class Music {
    private String title;
    private double duration;
    
    public Music() {
        this.title = "";
        this.duration = 0.0; 
    }
    
    public Music(String title, double duration) {
        this.title = title;
        this.duration = duration;
        
    }
    
    public Music(Music orig) {
        this.title = orig.getTitle();
        this.duration = orig.getDuration();
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music{" + "title=" + title + 
                ", duration=" + duration +  '}';
    }
}
