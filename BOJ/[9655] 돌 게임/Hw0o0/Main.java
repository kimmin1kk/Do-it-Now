import java.util.Scanner;

public class Rock9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 2) == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
