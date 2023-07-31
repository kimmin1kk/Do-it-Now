# [9655] 돌 게임

## :pushpin: **Algorithm**

알고리즘
- 수학
- 다이나믹 프로그래밍
- 게임 이론
## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;

public class Rock9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 2) == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}


 ```

- 돌의 갯수가 홀수이면 처음 던진 사람이 게임을 이기고 짝수이면 다음 던지사람이 이기게 된 게임입니다.
## :black_nib: **Review**

- 알고리즘 이해하는데 시간을 조금 낭비했다.