# [1110] 더하기 사이클

## :pushpin: **Algorithm**

알고리즘
- 수학
- 구현
## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;

public class PlusCycle1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sto, cnt = 0, share, rest;
        int input = sc.nextInt();
        sto = input;

        while (true) {
            cnt++;
            share = sto / 10; //몫
            rest = sto % 10; //나머지
            int total = share + rest;
            sto = rest * 10 + total % 10;
            if (input == sto) {
                break;
            }
        }
        System.out.println(cnt);
    }
}


 ```

- 반복문을 통해 10의 자리수 와 1의 자리수를 share,rest 변수에 대입하고 10의 자리에는 sto의 나머지 *10이 들어가고 1의 자리수에는 두수의 합의 나머지가 들어가는데 조건문을 통해서 처음 넣었던 input값과 같으면  반복문을 끝낸다.
## :black_nib: **Review**

- 엄청 간단히 풀었던 것 같다.
- 코드가 쓸데없이 길어서 다시 리팩토링했다.