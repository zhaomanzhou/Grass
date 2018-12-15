package com.qqmy.entity;

public class SiLiao {
    double price;
    double weight;



    double protein;
    double ME;
    double Ca;
    double AvailPhos;
    double Na;
    double Cl;
    double DigLys;
    double DigMet;
    double Lin;
    double totalLysine;
    double totalMet;
    double dryMatter;

    public static SiLiao YuMi = new SiLiao(740, 1, 7.9, 3.350, 0.02, 0.117, 0.03, 0.04, 0.1832, 0.1494);
    public static SiLiao FuPi = new SiLiao(800, 1, 15.7, 2.7526, 0.11, 0.3036, 0.07, 0.07, 0.3944, 0.3750);
    public static SiLiao DouPo = new SiLiao(1870, 1, 46, 3.0234, 0.3, 0.3180, 0.03, 0.05, 2.4514, 0.5643);
    public static SiLiao MianPo = new SiLiao(1200, 1, 42, 2.7117, 0.25, 0.41, 0.05, 0.04, 1.0624, 0.45);
    public static SiLiao DaMai = new SiLiao(700, 1, 11, 2.9343, 0.09, 0.196, 0.02, 0.14, 0.2886,0);
    public static SiLiao MuXuFen = new SiLiao(16800, 1, 14.3, 0, 1.42, 0.43, 0.17, 0.46, 0.7742,0.1663);
    public static SiLiao CaiPo = new SiLiao(1870, 1, 34, 2.4, 0.65, 0.33, 0.02, 0.01, 0.8987,0.5009);
    public static SiLiao ShiYan = new SiLiao(40, 60);
    public static SiLiao CaHp = new SiLiao(1,23,17);
    public static SiLiao LaiAnSuan = new SiLiao(78.8);
    public static SiLiao DanAnSuan = new SiLiao();
    public static SiLiao NiaoSu = new SiLiao();
    public static SiLiao LinSuanYiGai = new SiLiao();




    public SiLiao(double totalLysine) {
        this.totalLysine = totalLysine;
    }

    public SiLiao(double weight, double ca, double lin) {
        this.weight = weight;
        Ca = ca;
        Lin = lin;
    }

    public SiLiao(double na, double cl) {
        Na = na;
        Cl = cl;
    }



    public SiLiao() {
        DanAnSuan.setTotalMet(98);
        NiaoSu.setProtein(278);
        LinSuanYiGai.setDryMatter(98);
        LinSuanYiGai.setCa(17);
        LinSuanYiGai.setLin(26);
    }


    public SiLiao(double price, double weight, double protein, double ME, double ca, double availPhos, double na, double cl, double digLys, double digMet) {
        this.price = price;
        this.weight = weight;
        this.protein = protein;
        this.ME = ME;
        Ca = ca;
        AvailPhos = availPhos;
        Na = na;
        Cl = cl;
        DigLys = digLys;
        DigMet = digMet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getME() {
        return ME;
    }

    public void setME(double ME) {
        this.ME = ME;
    }

    public double getCa() {
        return Ca;
    }

    public void setCa(double ca) {
        Ca = ca;
    }

    public double getAvailPhos() {
        return AvailPhos;
    }

    public void setAvailPhos(double availPhos) {
        AvailPhos = availPhos;
    }

    public double getNa() {
        return Na;
    }

    public void setNa(double na) {
        Na = na;
    }

    public double getCl() {
        return Cl;
    }

    public void setCl(double cl) {
        Cl = cl;
    }

    public double getDigLys() {
        return DigLys;
    }

    public void setDigLys(double digLys) {
        DigLys = digLys;
    }

    public double getDigMet() {
        return DigMet;
    }

    public void setDigMet(double digMet) {
        DigMet = digMet;
    }

    public double getLin() {
        return Lin;
    }

    public void setLin(double lin) {
        Lin = lin;
    }

    public double getTotalLysine() {
        return totalLysine;
    }

    public void setTotalLysine(double totalLysine) {
        this.totalLysine = totalLysine;
    }

    public double getTotalMet() {
        return totalMet;
    }

    public void setTotalMet(double totalMet) {
        this.totalMet = totalMet;
    }

    public static SiLiao getYuMi() {
        return YuMi;
    }

    public static void setYuMi(SiLiao yuMi) {
        YuMi = yuMi;
    }

    public static SiLiao getFuPi() {
        return FuPi;
    }

    public static void setFuPi(SiLiao fuPi) {
        FuPi = fuPi;
    }

    public static SiLiao getDouPo() {
        return DouPo;
    }

    public static void setDouPo(SiLiao douPo) {
        DouPo = douPo;
    }

    public static SiLiao getMianPo() {
        return MianPo;
    }

    public static void setMianPo(SiLiao mianPo) {
        MianPo = mianPo;
    }

    public static SiLiao getDaMai() {
        return DaMai;
    }

    public static void setDaMai(SiLiao daMai) {
        DaMai = daMai;
    }

    public static SiLiao getMuXuFen() {
        return MuXuFen;
    }

    public static void setMuXuFen(SiLiao muXuFen) {
        MuXuFen = muXuFen;
    }

    public static SiLiao getCaiPo() {
        return CaiPo;
    }

    public static void setCaiPo(SiLiao caiPo) {
        CaiPo = caiPo;
    }

    public static SiLiao getShiYan() {
        return ShiYan;
    }

    public static void setShiYan(SiLiao shiYan) {
        ShiYan = shiYan;
    }

    public static SiLiao getCaHp() {
        return CaHp;
    }

    public static void setCaHp(SiLiao caHp) {
        CaHp = caHp;
    }

    public static SiLiao getLaiAnSuan() {
        return LaiAnSuan;
    }

    public static void setLaiAnSuan(SiLiao laiAnSuan) {
        LaiAnSuan = laiAnSuan;
    }

    public static SiLiao getDanAnSuan() {
        return DanAnSuan;
    }

    public static void setDanAnSuan(SiLiao danAnSuan) {
        DanAnSuan = danAnSuan;
    }


    public double getDryMatter() {
        return dryMatter;
    }

    public void setDryMatter(double dryMatter) {
        this.dryMatter = dryMatter;
    }

    public static SiLiao getNiaoSu() {
        return NiaoSu;
    }

    public static void setNiaoSu(SiLiao niaoSu) {
        NiaoSu = niaoSu;
    }

    public static SiLiao getLinSuanYiGai() {
        return LinSuanYiGai;
    }

    public static void setLinSuanYiGai(SiLiao linSuanYiGai) {
        LinSuanYiGai = linSuanYiGai;
    }
}
