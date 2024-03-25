package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int total = 0;
        double average;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        System.out.println("입력한 정수의 합계: " + total);
        average = (double) total / numbers.length;
        System.out.println("입력한 정수의 평균: " + average);

    }
}
