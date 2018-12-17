package com.qqmy.entity;

public class SiLiao {
    double price;
    double weight;


    /**
     * 蛋白质
     */
    double protein;
    /**
     * 能量
     */
    double ME;
    /**
     * 钙
     */
    double Ca;
    /**
     * 鳞
     */
    double lin;
    /**
     * 钠
     */
    double Na;
    /**
     * 氯
     */
    double Cl;
    /**
     * 赖氨酸
     */
    double DigLys;
    /**
     * 蛋氨酸
     */
    double DigMet;


    public SiLiao(double price, double weight, double protein, double ME, double ca, double lin, double na, double cl, double digLys, double digMet) {
        this.price = price;
        this.weight = weight;
        this.protein = protein;
        this.ME = ME;
        this.Ca = ca;
        this.lin = lin;
        this.Na = na;
        this.Cl = cl;
        this.DigLys = digLys;
        this.DigMet = digMet;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getProtein()
    {
        return protein;
    }

    public void setProtein(double protein)
    {
        this.protein = protein;
    }

    public double getME()
    {
        return ME;
    }

    public void setME(double ME)
    {
        this.ME = ME;
    }

    public double getCa()
    {
        return Ca;
    }

    public void setCa(double ca)
    {
        Ca = ca;
    }

    public double getLin()
    {
        return lin;
    }

    public void setLin(double lin)
    {
        this.lin = lin;
    }

    public double getNa()
    {
        return Na;
    }

    public void setNa(double na)
    {
        Na = na;
    }

    public double getCl()
    {
        return Cl;
    }

    public void setCl(double cl)
    {
        Cl = cl;
    }

    public double getDigLys()
    {
        return DigLys;
    }

    public void setDigLys(double digLys)
    {
        DigLys = digLys;
    }

    public double getDigMet()
    {
        return DigMet;
    }

    public void setDigMet(double digMet)
    {
        DigMet = digMet;
    }

    public String toString1() {
        return
                price +
                "," + protein +
                "," + ME +
                "," + Ca +
                "," + lin +
                "," + Na +
                "," + Cl +
                "," + DigLys +
                "," + DigMet;
    }

    @Override
    public String toString() {
        return /*"SiLiao{" +
                "price=" + price +
                ", protein=" + protein +
                ", ME=" + ME +
                ", Ca=" + Ca +
                ", lin=" + lin +
                ", Na=" + Na +
                ", Cl=" + Cl +
                ", DigLys=" + DigLys +
                ", DigMet=" + DigMet +
                '}'*/"";
    }
}
