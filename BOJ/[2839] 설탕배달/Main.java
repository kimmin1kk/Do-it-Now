import java.util.Scanner;
public class Main{
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (sugar % 5 == 0) {
                cnt += sugar / 5;
                break;
            }
            sugar = sugar - 3;
            cnt++;

            if (sugar == 0) {
                break;
            }
            if (sugar < 0) {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}