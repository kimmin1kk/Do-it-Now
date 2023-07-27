# [1267] 핸드폰 요금

## :pushpin: **Algorithm**

알고리즘
- 수학
- 사칙연산
## :round_pushpin: **Logic**

 ```java
import java.util.Scanner;

public class PhoneBee1267 { // 1267
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minshare, minrest, youngshare, repo1, repo2, youngrest, mintotal = 0, youngtotal = 0;
        int N = Integer.parseInt(String.valueOf(sc.nextInt()));
        for (int a = 0; a < N; a++) {
            int b = sc.nextInt();
            youngshare = b / 30;
            youngrest = b % 30;
            minshare = b / 60;
            minrest = b % 60;
            repo1 = b - 59;
            repo2 = b - 119;

            if (59 < b) {
                youngtotal = youngtotal + 20 + repo1 / 30 * 10;
                if (repo1 % 30 != 0) {
                    youngtotal += 10;
                }
            } else {
                youngtotal = youngtotal + youngshare * 10;
                if (youngrest != 0) {
                    youngtotal += 10;
                }
            }
            if (119 < b) {
                mintotal = mintotal + 30 + repo2 / 60 * 15;
                if (repo2 % 60 != 0) {
                    mintotal += 15;
                }
            } else {
                mintotal = mintotal + minshare * 15;
                if (minrest != 0) {
                    mintotal += 15;
                } else if (b == 60) {
                    mintotal += 15;
                }
            }
        }
        if (youngtotal < mintotal) {
            System.out.println("Y " + youngtotal);
        } else if (mintotal < youngtotal) {
            System.out.println("M " + mintotal);
        } else if (mintotal == youngtotal) {
            System.out.println("Y M " + mintotal);
        }
    }
}


 ```

- 반복문을 통해 첫 if문에서  30초부터 59초 사이로 통화를 했으면 20원이 청구되는 금액을 구한다.
- else에서 60초 밑으로 통화 했으면 30초당 10원이 청구되는 금액을 구한다..
- 두번째 if문에서는 60초부터 119초 사이로 통화를 했으면 30원이 청구되는 금액을 구한다
- else에서 120초 밑으로 통화 했으면 60초당 15원이 청구되는 금액을 구한다.
## :black_nib: **Review**

- 문제를 제대로 이해하지 못하고 계속 주먹구구식 방식으로 하다가 시간을 낭비했다. 