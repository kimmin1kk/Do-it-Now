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