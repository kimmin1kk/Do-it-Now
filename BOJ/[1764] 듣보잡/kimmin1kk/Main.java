import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int b = sc.nextInt();
        HashSet<String> hs = new HashSet<>();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i <= d; i++) {
            hs.add(sc.nextLine());
        }

        for (int j = 0; j < b; j++) {
            String answer = sc.nextLine();
            if (hs.contains(answer)) {
                arr.add(answer);
            }
        }
        System.out.println(arr.size());
        Collections.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
