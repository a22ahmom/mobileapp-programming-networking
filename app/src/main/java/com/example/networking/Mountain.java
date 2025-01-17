package com.example.networking;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    @SerializedName("size")
    private int meter;
    @SerializedName("cost")
    private int feet;
    private Auxdata auxdata;

    public Mountain(String name){
        this.name = name;
    }

    public Mountain(String ID, String name, String type, String company, String location, String category, int meter, int feet){
        this.ID = ID;
        this.name = name;
        this. type = type;
        this.company = company;
        this.location = location;
        this.category = category;
        this.meter = meter;
        this.feet = feet;
    }


    public void setID(String id) {
        this.ID = id;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Auxdata getAuxdata() {
        return auxdata;
    }

    @NonNull
    @Override
    public String toString() { return name; }

}