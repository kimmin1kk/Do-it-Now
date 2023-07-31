 # [1406] 에디터
 
 ## :pushpin: **Algorithm**
 
- 자료구조
- 스택
 
 ## :round_pushpin: **Logic**
 
 ```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Character> sf = new Stack<>();//커서 앞 문자열
    static Stack<Character> sb = new Stack<>();//커서 뒤 문자열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toCharArray();
        for (char c : chArr) {
            sf.push(c);
        }
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i<count; i++){
            String str = br.readLine();
            if (str.equals("L")) {
                moveFront();
            } else if (str.equals("D")) {
                moveBack();
            } else if (str.equals("B")) {
                delete();
            } else {
                input(str.charAt(2));
            }
        }
        //스택 안의 char 문자열로 변환
        StringBuilder stb = new StringBuilder();
        while (!sf.empty())sb.push(sf.pop());
        while (!sb.empty())stb.append(sb.pop());
        System.out.println(stb);

    }
    public static void moveFront(){//커서 왼쪽으로 한칸
        if(!sf.empty()) sb.push(sf.pop());
    }
    public static void moveBack(){//커서 오른쪽으로 한칸
        if(!sb.empty()) sf.push(sb.pop());
    }
    public static void delete() {//커서 왼쪽 한글자 지우기
        if(!sf.empty()) sf.pop();
    }
    public static void input(char c) {//커서 왼쪽 한글자 추가
        sf.push(c);
    }
}
 ```
 
 - 커서를 기준으로 앞과 뒤의 문자열을 각각 stack에 담는다.
 - 커서가 앞으로 움직임 -> 앞 스택에서 pop() 하여 뒷스택에 push()
 - 커서가 뒤로 움직임 -> 뒷스택에서 pop() 하여 앞스택에 push()
 - 문자 삭제 -> 앞스택 pop()
 - 문자 추가 -> 앞스택 push(문자)
 - 위와 같은 방법으로 편집 명령어를 처리한 후 반복문을 통해 스택을 문자열로 변환한 뒤 출력
 
 ## :black_nib: **Review**
 
 - 처음에 문제를 보고 연결리스트로 풀지 스택을 사용해서 풀지 고민하다가 스택을 사용했는데 오랜만에 스택을 사용해 보아서 복습도 되고 좋았던거 같다.
 ---