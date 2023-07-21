# [2839] 설탕 배달

## :pushpin: **Algorithm**

알고리즘
- 수학
- 다이나믹 프로그래밍
- 그리디 알고리즘
## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bag = sc.nextInt();
        int totalBag;
        int bigRest = bag%5;
        int bigShare = bag/5;
        int smallShare = bag%3;
        int smallRest = bag/3;

        if (bigRest == 0){
            System.out.println(bigShare);
            return;
        }
        else if(bigRest !=0 ||smallShare!=0) {
            for (int x = bigShare; 0 <= x; x--) {
                int y = bag - (x * 5);
                if (y % 3 == 0) {
                    totalBag = x + y / 3;
                    System.out.println(totalBag);
                    return;
                }
            }
        }
        else if(smallShare == 0){
            System.out.println(smallRest);
            return;
        }
        System.out.println(-1);
    }
}
 ```

- 편하게 식을 짜기 위해 변수들을 먼저 선언한다.
- 최소한의 봉지 수를 구하는 것이기 때문에 if문 사용해 가장 큰 5로 딱 나눠질때 종료한다.
- 5로 딱 나누어지지 않았을때 else if문 안의 반복문을 통해 5를 최대한 사용하고 3으로 딱 나눠질때 종료한다.
- else if문을 한번 더 사용하여 2개의 방법이 안되지만 3으로는 딱 맞아 떨어질때 종료한다.
- 위의 3개의 방법이 다 되지 않을때 -1을 출력해주고 종료해준다.
## :black_nib: **Review**

- 두번째 else if문을 마지막에 선언해두고 "왜 안되지 하면서" 계속 수정해서 시간을 많이 낭비했었다.
- "맞는거 같은데 왜 안되지" 라고 생각하지말고 천천히 자신의 코드를 한번 더 보는게 좋을 것 같다.