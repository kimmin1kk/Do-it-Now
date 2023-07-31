# [20115] 에너지 드링크
 
 ## :pushpin: **Algorithm**
 
- 그리디 알고리즘
 
 ## :round_pushpin: **Logic**
 
 ```java
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        double max = arr[count-1];
        double sum = 0;
        for(int num : arr){
            sum+=num;
        }
        double result = max + (sum - max)/2.0;
        System.out.println(result);
    }
}
 ```
 
 - 배열에 에너지 드링크의 양을 저장하고 정렬해서 가장 큰값을 구한다.
 - 가장 큰값을 제외한 모든 양을 합친 후 2로 나누어 가장 큰 값에 더한다.
 
 ## :black_nib: **Review**
 
 - 문제자체는 쉬웠지만 stream()을 사용하여 풀어보려 했는데 ide에서는 정답이 다 맞게 출력되지만 백준 채점에서는 틀렸다고 나와서 그냥 for문 사용해서 풀었다.
 ---