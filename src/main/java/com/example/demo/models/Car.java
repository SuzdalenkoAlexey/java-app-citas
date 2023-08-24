package com.example.demo.models;

@Entity
public class Car {
    // atributos
    private Long id;
    private String name;
    private String model;

    // constructores
    public Car() {}

    public Car(Long id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
