package com.example.kiosk;

import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItem> items;

    public Menu(String categoryName, List<MenuItem> items) {
        this.categoryName = categoryName;
        this.items = items;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}