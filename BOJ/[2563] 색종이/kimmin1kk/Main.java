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