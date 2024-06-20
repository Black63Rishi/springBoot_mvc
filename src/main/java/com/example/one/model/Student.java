package com.example.one.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private int Mark1;
    private int Mark2;
    @NonNull
    @Column(unique = true)
    private int Mark3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark1() {
        return Mark1;
    }

    public void setMark1(int mark1) {
        Mark1 = mark1;
    }

    public int getMark2() {
        return Mark2;
    }

    public void setMark2(int mark2) {
        Mark2 = mark2;
    }

    public int getMark3() {
        return Mark3;
    }

    public void setMark3(int mark3) {
        Mark3 = mark3;
    }
}
