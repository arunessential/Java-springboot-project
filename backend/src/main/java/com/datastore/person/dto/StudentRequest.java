package com.datastore.person.dto;

import javax.validation.constraints.NotNull;

public class StudentRequest {

    @NotNull
    private String name;

    @NotNull
    private int age;

    public StudentRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
