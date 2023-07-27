# [3052] 나머지

## :pushpin: **Algorithm**

알고리즘
- 수학
- 사칙연산
## :round_pushpin: **Logic**

 ```java
import java.util.HashSet;
import java.util.Scanner;

public class Rest3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> rest = new HashSet<>();
        for (int x = 0; x <10 ; x++) {
            int a = sc.nextInt();
            if (!rest.contains(a%42)){
                rest.add(a%42);
            }
        }
        System.out.println(rest.size());
    }
}


 ```

- 반복문을 통해 10번의 입력이 이루어지고 입력된 숫자를 42로 나누었을때 나머지 값들이 중복되지 않는 수만 들어갈수있게 HashSet인 rest안에 넣는다.
- HashSet의 크기를 출력한다. 
## :black_nib: **Review**

- 엄청 금방 해결했던 것 같다.