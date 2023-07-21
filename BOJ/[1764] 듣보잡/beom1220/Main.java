import java.util.*;

public class Main {
    static int n, m, both;
    static String newMan;
    static Scanner sc = new Scanner(System.in);
    static HashSet<String> set = new HashSet<>();
    static List<String> bothList = new ArrayList<>();

    public static void main(String[] args) {
        both = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n + m; i++) {
            newMan = sc.nextLine();
            if (!set.add(newMan)) {
                both++;
                bothList.add(newMan);
            }
        }
        Collections.sort(bothList);
        System.out.println(both);
        for (String man : bothList) {
            System.out.println(man);
        }
    }
}
