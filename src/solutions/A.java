package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() {
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(
                s <= a[0] ? a[n - 1] - s : a[n - 1] <= s ? s - a[0] :
                a[n - 1] - a[0] + Math.min(s - a[0], a[n - 1] - s)
        );
    }
}
