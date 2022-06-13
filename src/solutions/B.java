package solutions;

import java.util.Scanner;

public class B {
    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() {
        int n = scanner.nextInt();
        int[] a = new int[n + n];
        for (int i = 0; i < n; ++i) {
            a[i] = a[i + n] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i] = scanner.nextInt();
        }
        int id = -1, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            int total = 0;
            for (int j = i; j < i + n; ++j) {
                int diff = b[j - i] - a[j];
                total += a[j] > b[j - i] ? 0 : diff <= 100 ? diff / 2 : 30;
            }
            if (min > total) {
                id = i + 1;
                min = total;
            }
        }
        System.out.println(id + " " + min);
    }
}
