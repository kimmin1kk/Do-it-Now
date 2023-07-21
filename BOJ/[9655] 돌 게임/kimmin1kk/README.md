# [9655] 돌 게임

## :pushpin: **Algorithm**

+ 수학
+ 다이나믹 프로그래밍
+ 게임 이론

## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;
public class Main{
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int rock = sc.nextInt();
        int cnt = 0;
        while (rock != 0) {
            if (rock % 3 == 0) {
                rock -= 3;
                cnt++;
            } else {
                rock -= 1;
                cnt++;
            }
        }
        if (cnt % 2 == 0) {
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
 ```

- 서로 턴을 돌아가며 돌을 가져가는 게임인데 1개 또는 3개를 가져갈 수 있다.
- 완벽하게 떨어지게 하기 위해 3으로 나눠서 나머지가 0일 때 3개를 가져가게 했다.
- 그 외에는 1개를 가져가게 했고, 매 턴마다 cnt를 올려줬다.
- 게임은 상근이가 먼저 시작한다는 룰이 있었기에 cnt가 2로 맞아떨어지면 CY를, 그렇지 않으면 SK를 출력하게 했다.

## :black_nib: **Review**

- 한 3분 걸린 듯..ㅋㅋ