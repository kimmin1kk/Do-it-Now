# [1764] 듣보잡

## :pushpin: **Algorithm**

알고리즘
- 정렬
- 해시를 사용한 집합과 맵
## :round_pushpin: **Logic**

 ```java
 import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> noHearPerson = new HashSet<>();
        TreeSet<String> sort = new TreeSet<>();

        int cnt = 0;
        int sumPerson = sc.nextInt() + sc.nextInt();
        while (cnt < sumPerson) {
            String name = sc.nextLine();
            if(3<=cnt) {
                if (noHearPerson.contains(name)) {
                    sort.add(name);
                }
            }
            noHearPerson.add(name);
            cnt++;
        }
        System.out.println(sort.size());
        for (String sort : sort){
            System.out.println(sort);
        }
    }
}

 ```

- 첫번쨰 반복문에서 먼저 듣도 못한 사람의 수만큼 `HashSet`인 **noHearPerson**에 넣고 보도 못한 사람이 입력이 들어올때 바로 듣도 못한 사람과 비교 후 일치할 경우 `TreeSet`에 추가한다. 
- 이후 `TreeSet`인 **sort**에 있는 듣보잡의 수를 출력하고, 두번째 반복문에서 듣보잡의 명단을 사전순으로 출력한다.

## :black_nib: **Review**

- 문제를 제대로 숙지하지 못한 상태에서 알고리즘 풀다가 시간을 낭비했다.