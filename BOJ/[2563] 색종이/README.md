# [2563] 색종이

## :pushpin: **Algorithm**

+ 구현
+ 2차원 배열

## :round_pushpin: **Logic**

 ```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean[][] boolArr = new boolean[100][100];
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j<x+10;j++){
                for (int k = y; k <y+ 10; k++) {
                    boolArr[j][k] = true;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(boolArr[i][j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

 ```

- 100x100 크기의 2차원 boolean형 배열 (도화지)를 선언한다. (boolean형으로 선언하는 이유는 1(true)과 0(false)만 있으면 되기 때문)
- 이후 색종이의 수 만큼 for문을 돌리고 그 안에 x값과 y값을 기반으로 돌아가는 중첩 for문 선언
- 조건에 맞는 인덱스는 true 값이 됨
- true 값을 전부 세어주면 그게 넓이임

## :black_nib: **Review**

- 제작자의 의도를 확실히 파악하고 그 의도에 맞게 구현했어야 하는데 괜히 오기부리다가 하루를 날려먹음..