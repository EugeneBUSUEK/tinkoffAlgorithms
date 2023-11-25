import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();
        int k = sn.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sn.next());
        }

        int minCount = 0;

        for (int i = 0; i < k; i++) {
            minCount += h[i];
        }

        int j = 0;
        int count = minCount;
        for (int i = k; i < h.length; i++) {
            count = (count - h[i - k]) + h[i];
            if (count < minCount) {
                minCount = count;
                j = i - (k - 1);
            }
        }

        System.out.println(j + 1);
    }
}