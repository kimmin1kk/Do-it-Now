import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rock = sc.nextInt();
        int cnt = 0;
        while (rock != 0) {
            if (rock % 3 == 0) {
                rock -= 3;
                cnt++;
            } else {
                rock -= 1;
                cnt++;
            }
        }
        if (cnt % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}

