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