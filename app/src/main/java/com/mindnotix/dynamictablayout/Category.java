package com.mindnotix.dynamictablayout;

/**
 * Created by Admin on 02-11-2017.
 */

public class Category {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;
}
