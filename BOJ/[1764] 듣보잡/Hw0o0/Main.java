import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> no = new HashSet<>();
        TreeSet<String> noHearPerson = new TreeSet<>();

        int cnt = 0;
        int sumPerson = sc.nextInt() + sc.nextInt();
        while (cnt < sumPerson) {
            String name = sc.nextLine();
            if(3<=cnt) {
                if (no.contains(name)) {
                    noHearPerson.add(name);
                }
            }
            no.add(name);
            cnt++;
        }
        System.out.println(noHearPerson.size());
        for (String sort : noHearPerson){
            System.out.println(sort);
        }
    }
}
