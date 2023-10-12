package ru.vsu.cs.gasstation.data.dto;

import java.util.Date;

public class OrderCreateDto {
    private int fuelId;
    private int clientId;
    private String date;
    private int liters;
    private float sum;

    public OrderCreateDto(int fuelId, int clientId, String date, int liters, float sum) {
        this.fuelId = fuelId;
        this.clientId = clientId;
        this.date = date;
        this.liters = liters;
        this.sum = sum;
    }

    public OrderCreateDto() {
    }

    public int getFuelId() {
        return fuelId;
    }

    public void setFuelId(int fuelId) {
        this.fuelId = fuelId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
}
