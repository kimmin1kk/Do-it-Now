import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, n, remain, result = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();

        remain = a % b;
        for (int i = 0; i < n; i++) {
            result = (remain * 10) / b;
            remain = (remain * 10) % b;
        }

        System.out.println(result);
    }
}