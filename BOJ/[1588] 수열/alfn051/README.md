# [1588] 수열 [오답노트]
 
 ## :pushpin: **Algorithm**
 
 - 재귀
 - 분할정복
 
 ## :round_pushpin: **Logic**
 
 ```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int n;
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        divide(first, 0);
        int count1=0, count2=0, count3=0;
        for(int i = left; i<=right; i++){
            switch (list.get(i)){
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
            }
        }
        System.out.println(count1 + " " + count2 + " " + count3);
    }

    public static void divide(int num, int count){
        count++;
        if(count <= n){
            switch (num) {
                case 1 :
                    divide(1, count);
                    divide(3, count);
                    divide(2, count);
                    break;
                case 2 :
                    divide(2, count);
                    divide(1, count);
                    divide(1, count);
                    break;
                case 3 :
                    divide(2, count);
                    divide(3, count);
                    divide(2, count);
                    break;
            }
        }else {
            list.add(num);
        }
    }
}
 ```
 
 - 재귀를 통해 반복하는 횟수만큼 1은 132로 2는 211로 3은 232로 바꾸어 최종 수열을 만들어서 list에 저장한다.
 - list에서 left와 right 사이의 인덱스안에 있는 값중에서 1, 2, 3 의 개수를 세서 출력한다.
 
 ## :black_nib: **Review**
 
 - 재귀를 이용해 문제를 풀 수 있는 로직까지는 구현하였지만, 반복하는 횟수 n이 커질수록 재귀의 총 반복 회수는 3^n 까지 커지게 되어 큰 수를 n에 넣게 되면 메모리 오버플로우 오류가 뜨게 된다.
 - 재귀를 반복할때 마지막에 만들어질 수열의 인덱스를 미리 계산하고 left와 right 사이에 해당하는 부분만 반복하도록 하여서 총 반복을 줄인다면 해결할 수 있을 것 같다.
 ---