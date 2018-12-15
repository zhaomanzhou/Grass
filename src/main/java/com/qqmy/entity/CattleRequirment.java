package com.qqmy.entity;

public class CattleRequirment {
    private double energy;
    private double ga;
    private double lin;
    private double salt;
    private double protein;
    private double laiAnSuan;
    private double danAnSuan;
    private double na;
    private double cl;

    public static CattleRequirment getRequirment(Cattle cattle)
    {
        //能量
        double energy = 0;
        CattleRequirment requirment = new CattleRequirment();
        energy += 0.356*cattle.getWeight();
        if(cattle.getTemperature() < 18)
        {
            energy += (18 -cattle.getTemperature())*0.365*cattle.getWeight();
        }
        switch (cattle.getParity())
        {
            case 1 : energy *= 1.2; break;
            case 2 : energy *= 1.1; break;
        }
        //TODO  产奶需要

        switch (cattle.getPregnancy())
        {
            case 6 : {
                energy += 4.184;
                break;
            }
            case 7 : {
                energy += 7.113;
                break;
            }
            case 8 : {
                energy += 12.55;
                break;
            }
            case 9 : {
                energy += 20.92;
                break;
            }
        }
        requirment.setEnergy(energy);

        //钙磷
        requirment.setGa(cattle.getChanNaiLiang()*1.2);
        requirment.setLin(cattle.getChanNaiLiang()*0.95);

        //食盐
        double salt = 0;
        salt += (cattle.getWeight()/100)*5;
        salt += cattle.getChanNaiLiang()*1.75;

        requirment.setSalt(salt);

        //蛋白质
        double protein = 0;
        protein += 5.6*cattle.getWeight();
        protein += cattle.getChanNaiLiang()*0.03;
        //TODO

        requirment.setProtein(protein);
        requirment.getCalculateUngive();

        return requirment;
    }


    public void getCalculateUngive()
    {
        this.laiAnSuan = protein*0.052;
        this.danAnSuan = protein*0.013;
    }
    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getGa() {
        return ga;
    }

    public void setGa(double ga) {
        this.ga = ga;
    }

    public double getLin() {
        return lin;
    }

    public void setLin(double lin) {
        this.lin = lin;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
    public void decreaseProtein(double num)
    {
        this.protein -= num;
    }

    public void decreaseEnergy(double num)
    {
        this.energy -= num;
    }

    public void decreaseGa(double num)
    {
        this.energy -= num;
    }

    public void decreaseLin(double num)
    {
        this.ga -= num;
    }

    public void decreaseSalt(double num)
    {
        this.lin -= num;
    }

    public double getLaiAnSuan()
    {
        return laiAnSuan;
    }

    public void setLaiAnSuan(double laiAnSuan)
    {
        this.laiAnSuan = laiAnSuan;
    }

    public double getDanAnSuan()
    {
        return danAnSuan;
    }

    public void setDanAnSuan(double danAnSuan)
    {
        this.danAnSuan = danAnSuan;
    }

    public void decreaseLaiAnSuan(double num)
    {
        this.laiAnSuan -= num;
    }

    public void decreaseDanAnSuan(double num)
    {
        this.danAnSuan -= num;
    }
}
