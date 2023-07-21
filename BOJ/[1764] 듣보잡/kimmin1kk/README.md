# [1764] 듣보잡

## :pushpin: **Algorithm**

+ 정렬
+ 해시를 사용한 집합과 맵

## :round_pushpin: **Logic**

 ```java
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

 ```

- 첫 반복문에서 `HashSet`에 듣도 못한 사람을 추가한 후 두 번째 반복문에서 `HashSet`에 있는 듣도 못한 사람과 보도 못한 사람을 비교후 일치할 경우 `ArrayList`에 추가한다.
- 이후 `Collections`를 이용해 정렬한다.

## :black_nib: **Review**

- 문제를 제대로 읽지 않아 HashSet을 쓰지 않다가 시간초과를 겪었다...