package com.msadovskiy.model;

import java.math.BigDecimal;

public class FoldingBike extends AbstractBike {

    private String brand;
    private int wheelsSize;
    private int numberOfGears;
    private boolean lights;
    private int weight;
    private String color;
    private BigDecimal price;

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean isLights() {
        return lights;
    }

    @Override
    public void setLights(boolean lights) {
        this.lights = lights;
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

    public int getWheelsSize() {
        return wheelsSize;
    }

    public void setWheelsSize(int wheelsSize) {
        this.wheelsSize = wheelsSize;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

}
