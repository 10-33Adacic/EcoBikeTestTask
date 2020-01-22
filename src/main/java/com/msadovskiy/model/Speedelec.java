package com.msadovskiy.model;

import java.math.BigDecimal;

public class Speedelec extends AbstractBike {

    private String brand;
    private int maxSpeed;
    private int weight;
    private boolean lights;
    private int batteryCap;
    private String color;
    private BigDecimal price;

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean isLights() {
        return lights;
    }

    @Override
    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public int getBatteryCap() {
        return batteryCap;
    }

    public void setBatteryCap(int batteryCap) {
        this.batteryCap = batteryCap;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
