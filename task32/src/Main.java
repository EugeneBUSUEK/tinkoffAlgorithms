import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int t = sn.nextInt() - 1;
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sn.nextInt();
        }
        boolean couldFind = find(0, t, a);
        if (couldFind) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean find(int start, int find, int[] a) {
        if (start + a[start] == find) {
            return true;
        }

        if (start + a[start] >= a.length) {
            return false;
        }

        return find(start + a[start], find, a);
    }
}