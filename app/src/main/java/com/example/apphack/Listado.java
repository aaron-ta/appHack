package com.example.apphack;

import java.io.Serializable;

public class Listado implements Serializable{
    public String username;
    public double score;
    public String[] keywords = new String[3];
    public String title;
    public String text;
    public float id;
    public int imageId, imageF1, imageF2;

    public Listado(String username, double score, String[] keywords, String title, String text, float id, int imageId){
        this.username = username;
        this.score = score;
        this.keywords = keywords;
        this.title = title;
        this.text = text;
        this.id = id;
        this.imageId = imageId;
        this.imageF1 = R.drawable.list_1;
        this.imageF2 = R.drawable.list_2;
    }
}
