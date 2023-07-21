# [2455] 지능형 기차

## :pushpin: **Algorithm**

알고리즘
- 수학
- 구현
- 사칙연산
## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0,person = 0;
        for(int cnt =0;cnt<4;cnt++){
            int output = sc.nextInt(); int input = sc.nextInt();
            total-=output;
            total+=input;
            if(person < total){
                person = total;
            }
        }
        System.out.println(person);
    }
}
 ```

- 1~4번역마다 내리거나 탄 사람 수를 계산하여 담을수 있는 total,기차에 사람이 가장 많을 떄의 사람 수를 담는 person을 선언한다.
- 반복문에서 역에서 내리거나 탄 사람의 수를 계산하고 조건문을 통해 기차에 사람이 가장 많을 때를 찾아서 repo에 저장한 뒤 출력한다
## :black_nib: **Review**

- 별 문제없이 금방 해결했던 것 같다.