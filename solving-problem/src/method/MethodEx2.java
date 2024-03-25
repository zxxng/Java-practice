package method;

public class MethodEx2 {
    public static void main(String[] args) {
        repeatPrint(7, "Hello, world!");
    }

    public static void repeatPrint(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
