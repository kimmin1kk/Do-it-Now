import java.util.Scanner;

public class PlusCycle1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sto, cnt = 0, share, rest;
        int input = sc.nextInt();
        sto = input;

        while (true) {
            cnt++;
            share = sto / 10; //몫
            rest = sto % 10; //나머지
            int total = share + rest;
            sto = rest * 10 + total % 10;
            if (input == sto) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
