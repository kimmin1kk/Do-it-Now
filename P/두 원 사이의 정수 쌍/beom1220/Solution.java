class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

        long y;

        for (long i = 1; i <= r2; i++) {
            y = (long) Math.sqrt(Math.pow(r2, 2) - Math.pow(i, 2)) + 1;
            answer += y;
        }

        for (long i = 1; i < r1; i++) {
            y = (long) Math.ceil(Math.sqrt(Math.pow(r1, 2) - Math.pow(i, 2)));
            answer -= y;
        }

        answer *= 4;

        return answer;
    }
}