import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t =sn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sn.nextInt();
            int[] a = new int[n];
            boolean isUnique = false;
            for (int j = 0; j < n; j++) {
                a[j] = sn.nextInt();
                if (a[0] != a[j]) {
                    isUnique = true;
                }
            }

            if (!isUnique) {
                System.out.println("NO");
                continue;
            } else {
                System.out.println("YES");
            }

            int differIndex = 0;
            for (int k = 1; k < a.length; k++) {
                if (a[0] != a[k]) {
                    System.out.println(1 + " " + (k + 1));
                    differIndex = k;
                }
            }

            for (int q = 1; q < a.length; q++) {
                if (a[q] == a[0]) {
                    System.out.println((differIndex + 1) + " " + (q + 1));
                }
            }
        }
    }
}