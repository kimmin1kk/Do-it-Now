# [14659] 한조서열정리하고옴ㅋㅋ
 
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
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] result = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            //arr[i+num] = arr[i];
        }
        for(int i=0;i<num;i++){
            int count = 0;
            for(int j=i+1;j<num;j++){
                if(arr[j]<arr[i]){
                    count++;
                }else {
                    break;
                }
            }
            result[i] = count;
        }
        Arrays.sort(result);
        System.out.println(result[num-1]);
    }

}
 ```
 
 - 산 봉우리의 높이값을 배열에 저장하고 for문을 돌면서 출발한 산봉우리의 높이보다 낮으면 count에 1을 더하고 더 높은 산을 만나면 break로 탈출한다.
 모두 반복한 후 가장 높은 count값을 찾아서 출력한다.
 
 ## :black_nib: **Review**
 
 - 처음에 문제를 잘못 읽고 출발한 산보다 높은 산을 만날때 까지 배열을 계속 반복해서 돌아도 되게 만들어야 하는줄 알아서 틀렸었다. 난이도는 쉬운편
 ---