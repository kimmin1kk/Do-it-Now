# [1789] 수들의 합

## :pushpin: **Algorithm**

- 그리디 알고리즘

## :round_pushpin: **Logic**

 ```java
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
 ```

- `num`이 `sum`에 가까워질 때 까지 `cnt`를 하나씩 더해준다

## :black_nib: **Review**

- 정답률이 왜 50퍼 아랜가~ 했다..
 ---