## :pushpin: **Algorithm**

- 가장 가까운 같은 글자

## :round_pushpin: **Logic**

```java
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            if(i != 0){
                int index = s.substring(0,i).lastIndexOf(s.charAt(i));
                if(index != -1){
                    answer[i] = i - index;
                }else{
                    answer[i] = index;
                }
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}
```

- String 함수의 lastIndexOf를 이용하여 인덱스의 문자를 비교

## :black_nib: **Review**

- String 함수를 이용하니 금방 해결한 문제
