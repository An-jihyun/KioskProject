package com.example.kiosk;

import java.util.Scanner;

public class Kiosk {
    private Menu menu = new Menu();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menu.getItems().size(); i++) {
                MenuItem item = menu.getItems().get(i);
                System.out.printf("%d. %s\n", i + 1, item);
            }
            System.out.println("0. 종료\t  | 종료");

            System.out.print("번호를 입력하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                running = false;
            } else if (choice >= 1 && choice <= menu.getItems().size()) {
                MenuItem selected = menu.getItem(choice - 1);
                System.out.printf("선택한 메뉴: %s (W %.1f)\n", selected.getName(), selected.getPrice());
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
