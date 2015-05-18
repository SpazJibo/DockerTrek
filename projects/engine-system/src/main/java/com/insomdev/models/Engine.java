package com.insomdev.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Engine {
    @Id
    private String id;

    @Indexed(unique=true, dropDups=true)
    private String engineType;
    private int fuel;

    public Engine() {
    }

    public Engine(String engineType, int fuel){
        this.engineType = engineType;
        this.fuel = fuel;
    }

    public String getEngineType () {
        return this.engineType;
    }

    public int getFuel() {
        return this.fuel;
    }
}
