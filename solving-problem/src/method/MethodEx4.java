package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            printMessage();
            int menu = choiceMenu(scanner);

            if (menu == 1) {
                balance = deposit(scanner, balance);
            } else if (menu == 2) {
                balance = withdraw(scanner, balance);
            } else if (menu == 3) {
                checkBalance(balance);
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴를 잘 못 입력하였습니다.");
            }
        }
    }

    public static void printMessage() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
    }

    public static int choiceMenu(Scanner scanner) {
        System.out.print("선택: ");
        int menu = scanner.nextInt();
        scanner.nextLine();

        return menu;
    }

    public static int deposit(Scanner scanner,int balance) {
        System.out.print("입금액을 입력하세요: ");

        int amount = scanner.nextInt();
        balance += amount;
        System.out.println(amount +"원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdraw(Scanner scanner,int balance) {
        System.out.print("출금액을 입력하세요: ");

        int amount = scanner.nextInt();
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

    public static void checkBalance(int balance){
        System.out.println("현재 잔액: " + balance + "원");
    }
}
