import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int cnt = 0;
        long sum = 0;
        while (num > sum) {
            cnt++;
            sum+=cnt;
        }
        if (num == sum) {
            System.out.println(cnt);
        }else {
            cnt--;
            System.out.println(cnt);
        }
    }
}