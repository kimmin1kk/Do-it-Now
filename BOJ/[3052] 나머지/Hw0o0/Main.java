import java.util.HashSet;
import java.util.Scanner;

public class Rest3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> rest = new HashSet<>();
        for (int x = 0; x <10 ; x++) {
            int a = sc.nextInt();
            if (!rest.contains(a%42)){
                rest.add(a%42);
            }
        }
        System.out.println(rest.size());
    }
}
