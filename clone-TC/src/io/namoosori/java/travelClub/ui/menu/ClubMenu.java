package io.namoosori.java.travelClub.ui.menu;

import io.namoosori.java.travelClub.ui.console.ClubConsole;

import java.util.Scanner;

public class ClubMenu {
    private Scanner scanner;
    private ClubConsole clubConsole;

    public ClubMenu() {
        this.scanner = new Scanner(System.in);
        this.clubConsole = new ClubConsole();
    }
    public void show() {
        int inputNumber = 0;

        while (true) {
            displayMenu();
            inputNumber = selectMenu();

            switch (inputNumber) {
                case 1:
                    clubConsole.register();
                    break;
                case 2:
                    clubConsole.findAll();
                    break;
                case 3:
                    clubConsole.findById();
                    break;
                case 4:
                    clubConsole.findByName();
                    break;
                case 5:
                    clubConsole.modify();
                    break;
                case 6:
                    clubConsole.remove();
                    break;
                case 0:
                    System.out.println("Session closed.");
                    return;
                default:
                    System.out.println("Choose again!");
            }
        }
    }

    // out view
    private void displayMenu() {
        System.out.println("-------------------------");
        System.out.println("Club Menu");
        System.out.println("-------------------------");
        System.out.println("1. Register");
        System.out.println("2. Find(All)");
        System.out.println("3. Find(ID)");
        System.out.println("4. Find(Name)");
        System.out.println("5. Modify");
        System.out.println("6. Remove");
        System.out.println("-------------------------");
        System.out.println("0. Previous");
        System.out.println("-------------------------");
    }

    // in view
    private int selectMenu() {
        System.out.print("Select : ");
        int menuNumber = scanner.nextInt();

        if (menuNumber >= 0 && menuNumber <= 6) {
            // 버퍼에 남아있는 입력값의 끝을 지우기 위해 사용
            scanner.nextLine();
            return menuNumber;
        } else {
            System.out.println("It's is invalid number -->" + menuNumber);
            return -1;
        }
    }
}
