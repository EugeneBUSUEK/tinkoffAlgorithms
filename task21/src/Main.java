import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sn.nextInt();
        }
        Arrays.sort(t);

        System.out.println(task(t));
    }

    private static int task(int[] a) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= sum) {
                count++;
                sum += a[i];
            }

        }

        return count;
    }
}