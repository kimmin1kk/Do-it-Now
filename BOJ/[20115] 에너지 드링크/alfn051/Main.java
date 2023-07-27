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