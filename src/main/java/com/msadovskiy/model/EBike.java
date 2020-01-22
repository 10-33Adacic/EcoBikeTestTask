package com.msadovskiy.model;

public class EBike {

    private String brand;
    private int maxSpeed;
    private int weight;
    private boolean lights;
    private int batteryCap;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public int getBatteryCap() {
        return batteryCap;
    }

    public void setBatteryCap(int batteryCap) {
        this.batteryCap = batteryCap;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
