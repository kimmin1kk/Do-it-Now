# 소수 만들기

## :pushpin: **Algorithm**

+ 해시 맵

## :round_pushpin: **Logic**

 ```kotlin
class Solution {
    fun solution(record: Array<String>): Array<String> {
        val map = HashMap<String, String>()
        val queue: Queue<Pair<String, String>> = LinkedList()
        for (r in record) {
            val strs = r.split(" ")

            if (r.startsWith("E")) {
                map[strs[1]] = strs[2]
                queue.offer(Pair(strs[1], "님이 들어왔습니다."))
            } else if (r.startsWith("L")) {
                queue.offer(Pair(strs[1], "님이 나갔습니다."))
            } else {
                map[strs[1]] = strs[2]
            }
        }

        return queue.map { "${map[it.first]}${it.second}" }.toTypedArray()
    }
}
```

- 입력으로부터 `uid`와 `닉네임`을 추출한 후 `Map`에 저장한 후, 만약 출력해야 할 메시지일 경우 (`uid`, `메시지`)쌍으로 메시지 큐에 저장한다.
- 큐를 돌면서 `Map`으로부터 해당 `uid`에 해당하는 `닉네임`을 조회하여 메시지와 합친후 배열로 바꾸어 반환한다.


## :black_nib: **Review**

- 처음에는 `while`문을 돌면서 `queue`에서 하나씩 poll()하려고 했는데 함수형으로 좀 바꾸고 나니까 굳이 `queue`를 썼어야 했나 싶다.
