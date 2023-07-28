class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];

        for(int i=0; i<X.length(); i++) {
            x[X.charAt(i) - '0']++;
        }
        for(int i=0; i<Y.length(); i++) {
            y[Y.charAt(i) - '0']++;
        }

        for(int i=9; i>=0; i--) {
            for(int j=0; j<Math.min(x[i], y[i]); j++) {
                answer.append(i);
            }
        }

        if(answer.length() == 0){
            return "-1";
        }

        if(answer.charAt(0) == '0'){
            return "0";
        }

        return answer.toString();
    }
}