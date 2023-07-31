import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long x = sc.nextLong();
        long a = x;
        long b = 0;
        for (long i = 1; x >= (i * (i + 1) / 2); i++) {
            a -= i;
            b = i;
        }
        if (a == 0) {
            if (b % 2 == 0) {
                System.out.println(b + "/1");
            } else {
                System.out.println("1/" + b);
            }
        } else {
            if (b % 2 == 0) {
                b++;
                System.out.println((b - a + 1) + "/" + a);
            } else {
                b++;
                System.out.println(a + "/" + (b - a + 1));
            }
        }
    }
}