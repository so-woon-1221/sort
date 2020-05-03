import java.util.Scanner;

public class sort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count[num[i]]++;
        }

        for (int i = 1; i < n; i++) {
            if (count[i] != 0)
                count[i] = count[i] + count[i - 1];
        }
        for (int i = 0; i < n; i++) {
            if (count[i] != 0)
                System.out.println(count[i]);
        }
    }
}
