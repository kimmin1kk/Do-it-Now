import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, result, two, five;
    public static void main(String[] args) {
        n = sc.nextInt();
        result = 1;
        two = 0;
        five = 0;
        for (int i = 1; i <= n; i++) {
            checkFive(i);
            checkTwo(i);
        }
        if (two > 0 && five > 0) {
            if (two <= five) {
                System.out.println(two);
            } else {
                System.out.println(five);
            }
        } else {
            System.out.println(0);
        }
    }

    public static void checkTwo(int i) {
        while (true) {
            if (i % 2 == 0) {
                i /= 2;
                two++;
            } else {
                break;
            }
        }
    }

    public static void checkFive(int i) {
        while (true) {
            if (i % 5 == 0) {
                i /= 5;
                five++;
            } else {
                break;
            }
        }
    }
}
