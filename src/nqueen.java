import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class nqueen {
    static int n;
    static int[] pan;
    static int ans;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        nqueen nq = new nqueen();

        n = sc.nextInt();
        pan = new int[n];
        ans = 0;
        for(int i = 0;i<n;i++)
            pan[i] = 0;
        nq.godown(0);
        System.out.println(ans);
    }

    void godown(int row) throws IOException {
        if (row < n) {
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < row; j++) {
                    if (pan[j] == i || pan[j]+(row-j) == i || pan[j]-(row-j)==i) {
                        count++;
//                        System.out.println(row+"번째 줄" + i+"에선" + j+"번째 줄" + pan[j]+"에서 겹침");
                    }
                }
                if (count == 0) {
//                    System.out.println(row+"에선" + i+"에 놓음");
                    pan[row] = i;
                    godown(row + 1);
                }
            }
        } else if(row==n) {
//            System.out.println("한번 끝");
            ans++;
        }
    }
}
