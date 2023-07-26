# [20115] 에너지 드링크

## :pushpin: **Algorithm**

+ 그리디 알고리즘

## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double[] arr = new double[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);


        double sum = arr[num-1];

        for (int i = 0; i < num - 1; i++) {
            sum += arr[i] / 2;
        }

        System.out.println(sum);
    }
}
 ```
- 정렬 후, 제일 큰 수(인덱스 마지막에 있는 수) 를 `sum`에 넣는다
- 제일 큰 수 앞까지 for문을 돌리면서 `sum` += `인덱스에 있는 값 / 2`

## :black_nib: **Review**

- 푸는데 5분 걸려서 양심이 찔렸다. 