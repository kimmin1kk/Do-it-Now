 # [1764] 듣보잡
 
 ## :pushpin: **Algorithm**
 
- 자료구조
- 정렬
 
 ## :round_pushpin: **Logic**
 
 ```java
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

 ```
 
 - 듣도 못한 사람과 보도 못한 사람의 명단 각각엔 중복되는 이름이 없기 때문에 전체 이름 명단 중 이름이 두번 나오는 사람을 찾으면 된다.
 - 첫째 줄에 나온 두 숫자를 합친 만큼 반복하며 이름을 하나씩 Set에 추가하고 이미 있으면 따로 list에 저장하여 length와 함께 출력한다.
 
 ## :black_nib: **Review**
 
 - 문제 페이지에 나와있는 알고리즘 분류에 '해시를 사용한 집합과 맵'을 보고 HashSet을 사용하였는데 알고보니깐 그냥 List를 사용하면 시간초과가 난다는 것을 알게 되었다.
 ---