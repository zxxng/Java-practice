package array;

import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int count = scanner.nextInt();

        int[][] score = new int[count][3];
        String[] subject = { "국어", "영어", "수학" };
        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(subject[j] + "점수: ");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < score.length; i++) {
            int total = 0;
            for (int j = 0; j < score[i].length; j++) {
                total += score[i][j];
            }
            double average = (double) total / score[i].length;
            System.out.println((i+1)+"번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
