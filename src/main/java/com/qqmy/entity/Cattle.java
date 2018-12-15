package com.qqmy.entity;

public class Cattle {
    private double weight;
    /**
     * 胎次
     */
    private int parity;
    private double ruZhiLv;
    private double chanNaiLiang;
    private double temperature;
    private int pregnancy;

    public Cattle() {
    }

    public Cattle(double weight, int parity, double ruZhiLv, double chanNaiLiang, double temperature, int pregnancy) {
        this.weight = weight;
        this.parity = parity;
        this.ruZhiLv = ruZhiLv;
        this.chanNaiLiang = chanNaiLiang;
        this.temperature = temperature;
        this.pregnancy = pregnancy;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(int parity) {
        this.parity = parity;
    }

    public double getRuZhiLv() {
        return ruZhiLv;
    }

    public void setRuZhiLv(double ruZhiLv) {
        this.ruZhiLv = ruZhiLv;
    }

    public double getChanNaiLiang() {
        return chanNaiLiang;
    }

    public void setChanNaiLiang(double chanNaiLiang) {
        this.chanNaiLiang = chanNaiLiang;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(int pregnancy) {
        this.pregnancy = pregnancy;
    }
}
