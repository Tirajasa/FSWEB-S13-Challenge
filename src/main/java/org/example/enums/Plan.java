package org.example.enums;

public enum Plan {

    BASIC("Donemlik",250),
    PREMIUM("Yillik",450),
    GOLD("Iki yillik",600),
    PLATINIUM("Uc yillik",800);


    private String name;
    private double price;

    Plan(String name,double price){
    this.name=name;
    this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public static Plan getBasic(){
        return BASIC;
    }

    public static Plan getPremium(){
        return PREMIUM;
    }

    public static Plan getGold(){
        return GOLD;
    }

    public static Plan getPlatinium(){
        return PLATINIUM;
    }
}
