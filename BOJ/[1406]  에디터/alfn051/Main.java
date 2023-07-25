import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Character> sf = new Stack<>();
    static Stack<Character> sb = new Stack<>();

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
        StringBuilder stb = new StringBuilder();
        while (!sf.empty())sb.push(sf.pop());
        while (!sb.empty())stb.append(sb.pop());
        System.out.println(stb);

    }
    public static void moveFront(){
        if(!sf.empty()) sb.push(sf.pop());
    }
    public static void moveBack(){
        if(!sb.empty()) sf.push(sb.pop());
    }
    public static void delete() {
        if(!sf.empty()) sf.pop();
    }

    public static void input(char c) {
        sf.push(c);
    }
}