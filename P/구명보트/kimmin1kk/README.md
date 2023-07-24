# 구명보트
 
 ## :pushpin: **Algorithm**
 
 - 그리디 알고리즘
 
 ## :round_pushpin: **Logic**
 
 ```java
import java.util.*;

class Solution {
 public int solution(int[] people, int limit) {
  int index = 0;
  int answer = 0;
  Arrays.sort(people);

  for (int i = people.length-1; i >= index; i--) {
   if (people[i] + people[index] <= limit) {
    index++;
    answer++;
   } else {
    answer++;
   }
  }
  return answer;
 }
}
 ```
- 제일 작은 수와 제일 큰 수를 비교하기 위해 정렬
- `작은 수 + 큰 수`의 값보다 `limit`이 크거나 같을 경우 그다음 `작은 수`로 넘어가면서 `튜브 수` +1
- 그 외에는 `두 수의 합`이 `limit`보다 크니 `튜브 수` +1
 
 ## :black_nib: **Review**
 
 - 오전 시간대에 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없다는 조건을 못 봤어서 시간을 허비했다..

 ---