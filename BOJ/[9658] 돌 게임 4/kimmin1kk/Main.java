import java.util.Scanner;
public class Main{
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int rock = sc.nextInt();
        System.out.println((rock % 7 == 1 || rock % 7 == 3 ? "CY" : "SK"));
    }
}