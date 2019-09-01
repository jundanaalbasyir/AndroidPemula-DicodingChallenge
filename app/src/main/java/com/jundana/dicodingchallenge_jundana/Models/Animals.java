package com.jundana.dicodingchallenge_jundana.Models;

import java.io.Serializable;

public class Animals implements Serializable {
    private int photo;
    private String animalsName;
    private String animalsDetail;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getAnimalsName() {
        return animalsName;
    }

    public void setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
    }

    public String getAnimalsDetail() {
        return animalsDetail;
    }

    public void setAnimalsDetail(String animalsDetail) {
        this.animalsDetail = animalsDetail;
    }
}
