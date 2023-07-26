import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.nextLine();
        // 문자 하나씩 분리.
        String[] s = input.split("");

        // 컬렉션의 List로 옮김.
        List<String> list = new ArrayList<>();
        for (String ss : s) {
            list.add(ss);
        }

        // 사전 순 정렬.
        Collections.sort(list);

        // 이차원 배열을 이용하여 각 문자마다 분리. ex) AAA BB CCCC
        List<List<String>> div = new ArrayList<>();
        String pre = list.get(0);
        List<String> temp = new ArrayList<>();
        temp.add(pre);

        for (int i = 1; i < list.size(); i++) {
            if (!pre.equals(list.get(i))) {
                div.add(temp);
                temp = new ArrayList<>();
                pre = list.get(i);
                temp.add(pre);
            } else {
                temp.add(pre);
            }
        }
        div.add(temp);

        // 홀수개인 문자가 2개 이상이면 팰린드롬을 만들 수 없으므로 검사.
        boolean isEven = false;
        int evenNum = -1;
        for (int i = 0; i < div.size(); i++) {
            if (div.get(i).size() % 2 != 0) {
                if (!isEven) {
                    isEven = true;
                    evenNum = i;
                } else {
                    System.out.println("I'm Sorry Hansoo");
                    System.exit(0);
                }
            }
        }

        // 대칭 앞부분 출력
        for (int i = 0; i < div.size(); i++) {
            for (int j = 0; j < (int) Math.floor((div.get(i).size()) / 2); j++) {
                System.out.print(div.get(i).get(0));
            }
        }
        // 홀수개인 문자를 맨 가운데 하나 출력
        if (isEven) {
            System.out.print(div.get(evenNum).get(0));
        }
        // 대칭 뒷부분 출력
        for (int i = div.size()-1; i >= 0; i--) {
            for (int j = 0; j < (int) Math.floor((div.get(i).size()) / 2); j++) {
                System.out.print(div.get(i).get(0));
            }
        }
    }
}
