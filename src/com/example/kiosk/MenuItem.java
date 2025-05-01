package com.example.kiosk;

public class MenuItem {
    //속성
    private String name;
    private double price;
    private String description;

    //생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //기능
    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%s\t| W %.1f | %s", name, price, description);
    }
    //%s:문자열, %.1f:소수점 한 자리까지 실수, \t:탭 (예쁘게 정렬용)
}
