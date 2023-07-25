import java.lang.Math;
class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

        answer = answer + r2 - r1 + 1;

        for(int i=1; i<r2; i++){
            answer = answer + (long)Math.floor(Math.sqrt(Math.pow(r2, 2)-Math.pow(i, 2)));
        }
        for(int i=1; i<r1; i++){
            double y2 = Math.sqrt(Math.pow(r1, 2)-Math.pow(i, 2));
            if(y2%1.0==0.0)answer++;
            answer = answer - (long)Math.floor(y2);
        }

        answer=answer*4;

        return answer;
    }
}
