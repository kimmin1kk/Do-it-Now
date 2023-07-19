# [1946] 과제명

## :pushpin: **Algorithm**

- 그리디 알고리즘
- 정렬

## :round_pushpin: **Logic**

 ```java
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[n];
        for(int i=0;i<n;i++){
            int m = Integer.parseInt(br.readLine());
            count[i] = m;
            int[] arr = new int[m];
            for(int j=0;j<m;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())-1] = Integer.parseInt(st.nextToken());
            }
            int num = arr[0];
            for(int j=1;j<m;j++){
                if(arr[j]>num){
                    count[i]--;
                }else{
                    num = arr[j];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(count[i]).append("\n");
        }
        System.out.println(sb);
    }


}
 ```

- 지원자를 서류심사 성적 순으로 오름차순 정렬 하고, 자신보다 서류심사 순위가 높은 지원자 중 면접 순위가 높은사람이 있는지 검사하고 높은사람이 있으면 채용에서 떨어지고 count가 1 줄어든다

## :black_nib: **Review**

- 처음엔 정렬하지 않고 이차원 배열과 이중 for문을 이용하여 풀었는데 출력은 정상적으로 잘 되지만 시간초과가 났다. 그래서 시간을 줄이기 위하여 우선 서류순위대로 정렬을하고 면접순위만 비교하도록 하였는데 여전히 시간초과가 나서 이유를 살펴보니 정렬을 내림차순으로 하고 이중 for문으로 비교하는데에서 시간이 많이 걸린 것을 알 수 있었고, 오름차순으로 정렬한 뒤 비교할 면접 순위를 변수에 따로 저장하여 for문 하나로 비교할 수 있도록 하였다. 
 ---