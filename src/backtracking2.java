import java.io.*;
import java.util.StringTokenizer;

public class backtracking2 {
    static int n;
    static int m;
    static int[] ans;
    static String ans2;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        String prob = br.readLine();
        StringTokenizer token = new StringTokenizer(prob);
        n = Integer.parseInt(token.nextToken());
        m = Integer.parseInt(token.nextToken());
        ans = new int[m];
        backtracking2 bc = new backtracking2();

        bc.godown(0);
    }

    void godown(int row) throws IOException {
        if (row < m) {
            for (int i = 1; i <= n; i++) {
                ans[row] = i;
                godown(row + 1);
            }
        } else {
            for (int i = 0; i < m; i++) {
                bw.write(Integer.toString(ans[i])+" ");
            }
            bw.flush();
            bw.newLine();
        }
    }
}
