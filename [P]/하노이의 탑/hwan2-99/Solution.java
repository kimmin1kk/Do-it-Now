import java.util.*;
class Solution {
    private List<int[]>arr = new ArrayList<>();

    public List<int[]> solution(int n) {
        hanoi(1,2,3,n);

        return arr;
    }

    public void hanoi(int first, int second, int third,int n){
        int[] move = {first,third};

        if(n == 1){
            arr.add(move);
            return;
        }else{
            hanoi(first,third,second,n-1);
            arr.add(move);
            hanoi(second,first,third,n-1);
        }
    }
}