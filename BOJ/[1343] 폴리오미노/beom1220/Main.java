import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.nextLine();

        String[] result = input.split("\\.");
        for (String r : result) {
            if (r.length() % 2 != 0) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        input = input.replace("XXXX", "AAAA");
        input = input.replace("XX", "BB");

        System.out.println(input);
    }
}
