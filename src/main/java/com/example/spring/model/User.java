package com.example.spring.model;

public class User {
	private int id;
    private String name;
    private String designation;

    public User(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }	

}


