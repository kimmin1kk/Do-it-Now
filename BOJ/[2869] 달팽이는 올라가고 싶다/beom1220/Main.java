import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, v;
        a = sc.nextInt();
        b = sc.nextInt();
        v = sc.nextInt();

        int day = (int) Math.ceil((v-b) / (a-b));

        System.out.println(day);
    }
}
