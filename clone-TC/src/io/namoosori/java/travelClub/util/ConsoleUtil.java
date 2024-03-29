package io.namoosori.java.travelClub.util;

import java.util.Scanner;

public class ConsoleUtil {
    private Scanner scanner;

    public ConsoleUtil() {
        this.scanner = new Scanner(System.in);
    }

    // label: name, id 등 입력받을 문구
    public String getValueOf(String label) {
        System.out.print(label + " : ");
        String inputStr = scanner.nextLine();
        // trim : 문자열 외 공백 삭제 -> enter 제거
        inputStr = inputStr.trim();

        return inputStr;
    }
}
