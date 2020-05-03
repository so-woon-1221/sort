import java.util.Scanner;

public class backtracking1 {
    static int n;
    static int m;
    static int[] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ans = new int[m];
        backtracking1 bc = new backtracking1();

        for (int i = 1; i <= n; i++) {
            ans[0] = i;

            bc.godown(1);
        }
    }

    void godown(int row) {
        if (row < m) {
            for (int i = 1; i <= n; i++) {
                int count = 0;
                for (int j = 0; j < row; j++) {
                    if (ans[j] >= i) {
                        count++;
                    }
                }
                if (count == 0) {
                    ans[row] = i;
                    godown(row + 1);
                }
            }
        } else {
            for (int i = 0; i < m; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
