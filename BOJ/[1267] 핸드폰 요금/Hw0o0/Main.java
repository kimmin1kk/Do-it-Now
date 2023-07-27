import java.util.Scanner;

public class PhoneBee1267 {
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
