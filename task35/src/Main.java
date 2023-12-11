import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sn.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sn.nextInt();
            }
            returnDeep(0, a.length, a, 0);
        }
    }

    private static void returnDeep(int from, int to, int[] a, int deep) {
        if (from == to - 1) {
            System.out.print(deep + " ");
            return;
        } else if (from == to || from > to) {
            return;
        }
        int indexMax = from;
        for (int i = from; i < to; i++) {
            if (a[i] > a[indexMax]) {
                indexMax = i;
            }
        }
        returnDeep(from, indexMax, a, deep + 1);
        System.out.print(deep + " ");
        returnDeep(indexMax + 1, to, a, deep + 1);
    }
}