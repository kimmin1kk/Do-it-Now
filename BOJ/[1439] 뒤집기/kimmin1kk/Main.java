import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = new String[str.length()];

        int cnt = 0;
        int cnt2 = 0;

        boolean check = false;

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, 1 + i);
        }

        // 0 뒤집었을 때
        for (int j = 0; j < str.length(); j++) {
            if (arr[j].equals("0")) {
                check = true;

                if (arr[j].equals(arr[str.length() - 1])) {
                    cnt++;
                } else {
                    continue;
                }

            }

            if (check) {
                cnt++;
                check = false;
            }

        }
        // 1 뒤집었을 때
        for (int k = 0; k < str.length(); k++) {
            if (arr[k].equals("1")) {
                check = true;

                if (arr[k].equals(arr[str.length() - 1])) {
                    cnt2++;
                } else {
                    continue;
                }

            }

            if (check) {
                cnt2++;
                check = false;
            }

        }

        System.out.println(Math.min(cnt, cnt2));
    }
}