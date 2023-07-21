import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        HashSet<String> map = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<t;i++){
            String str = br.readLine();
            if(!map.contains(str)){
                map.add(str);
            }else {
                list.add(str);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(String s:list){
            System.out.println(s);
        }
    }
}
