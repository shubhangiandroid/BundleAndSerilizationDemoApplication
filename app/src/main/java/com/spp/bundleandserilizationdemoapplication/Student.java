package com.spp.bundleandserilizationdemoapplication;

import java.io.Serializable;

public class Student implements Serializable {

    int id;
    String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
