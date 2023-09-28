package com.workintech.polymorphism.model;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name, int cylinders) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true      ;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String startEngine(){
        System.out.println("Classname: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }
public String accelerate(){
    System.out.println("Classname: " + getClass().getSimpleName());
        return "the car is accelerating";
}
public String brake(){
    System.out.println("Classname: " + getClass().getSimpleName());
    return "the car is braking";
}
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

 
}
