import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int n = 0;
        int m = 0;

        for(int i = 0; i <= 4; i++) {
            String input = sc.nextLine();
            if (input.contains("FBI")) {
                arr[i] = Integer.toString(i + 1);
            } else {
                arr[i] = null;
            }
        }
        for(int j = 0; j <= 4; j++) {
            if (n == 3 && j == 3 && arr[j] == null) {
                System.out.println("HE GOT AWAY!");
            } else if (arr[j] == null) {
                n = n + 1;
            } else {
                if (m != 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[j]);
                m = m + 1;
            }
        }
    }
}