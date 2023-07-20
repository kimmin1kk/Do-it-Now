# [9658] 돌 게임 4

## :pushpin: **Algorithm**

+ 게임 이론
+ 다이나믹 프로그래밍

## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;
public class Main{
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int rock = sc.nextInt();
        System.out.println((rock % 7 == 1 || rock % 7 == 3 ? "CY" : "SK"));
    }
}
 ```
- (선공 기준) 1 3 8 10 15 17 19 -> 필패 | 2 4 5 6 7 9 11 12 13 14 16 18 -> 필승 | 이 안에 패턴이 숨어있다..

## :black_nib: **Review**

- 머리가 안좋아서 직접 쳐가면서 패턴을 찾느라 오래 걸렸다..