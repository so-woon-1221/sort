import java.util.Scanner;

public class backtracking2 {
    static int n;
    static int m;
    static int[] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ans = new int[m];
        backtracking2 bc = new backtracking2();

        for (int i = 1; i <= n; i++) {
            ans[0] = i;

            bc.godown(1);
        }
    }

    void godown(int row) {
        if (row < m) {
            for (int i = 1; i <= n; i++) {
                ans[row] = i;
                godown(row + 1);
            }
        } else {
            for (int i = 0; i < m; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
