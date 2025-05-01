package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Kiosk() {
        // 메뉴 구성
        menus.add(new Menu("Burgers", List.of(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        )));
        menus.add(new Menu("Drinks", new ArrayList<>()));
        menus.add(new Menu("Desserts", new ArrayList<>()));
    }

    public void start() {
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("> ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= menus.size()) {
                showSubMenu(menus.get(choice - 1));
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void showSubMenu(Menu menu) {
        while (true) {
            System.out.printf("[ %s MENU ]\n", menu.getCategoryName().toUpperCase());
            List<MenuItem> items = menu.getItems();
            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, items.get(i));
            }
            System.out.println("0. 뒤로가기");
            System.out.print("> ");

            int choice = scanner.nextInt();

            if (choice == 0) break;

            if (choice >= 1 && choice <= items.size()) {
                MenuItem selected = items.get(choice - 1);
                System.out.printf("선택한 메뉴: %s\n", selected);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}