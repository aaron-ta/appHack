package com.example.apphack;

import java.io.Serializable;

public class DonorInfo implements Serializable{
    public String username;
    public int imageId;

    public DonorInfo(String username, int imageId){
        this.username = username;
        this.imageId = imageId;
    }
}
