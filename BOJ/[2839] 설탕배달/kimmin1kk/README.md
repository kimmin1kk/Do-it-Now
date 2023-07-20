# [2839] 설탕배달

## :pushpin: **Algorithm**

+ Greedy Algorithm

## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;
public class Main{
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (sugar % 5 == 0) {
                cnt += sugar / 5;
                break;
            }
            sugar = sugar - 3;
            cnt++;

            if (sugar == 0) {
                break;
            }
            if (sugar < 0) {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}
 ```

- 상근이가 배달하는 봉지의 최소 개수를 구하는 것이기 때문에 sugar가 5로 딱 떨어질 때 while문을 탈출. 그 외에는 0일 때(다 담았을 때)와 sugar가 음수가 됐을 때(봉지에 딱 맞게 담을 수 없을 때) 탈출
- 5로 딱 떨어질 때가 최적의 경로이고 딱 떨어지지 않을 땐 sugar에 -3을 해주면서 5에 딱 떨어지는 수를 찾아가는 로직이다.

## :black_nib: **Review**

- 더 큰 수의 테스트케이스가 있었다면 좋았을 거 같다. (처음 짰던 로직은 세 자릿 수 부터(ex: 112) 한번씩 -1이 뜨는걸 확인할 수 있었다..)