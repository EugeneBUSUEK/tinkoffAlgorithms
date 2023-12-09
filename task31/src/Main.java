import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] p = new int[n];
        int indexMax = 0;
        for (int i = 0; i < n; i++) {
            p[i] = sn.nextInt();
            if (p[i] > p[indexMax]) {
                indexMax = i;
            }
        }

        int maxCount = 0;
        int tempCount = 0;
        for (int i = 0; i < p.length; i++) {
            tempCount = countDeepFromIndex(i, p);
            if (tempCount > maxCount) {
                maxCount = tempCount;
            }
        }

        System.out.println(maxCount);
    }

    public static int countDeepFromIndex(int i, int[] p) {
        int count = 1;
        while (p[i] != -1) {
            count++;
            i = p[i] - 1;
        }
        return count;
    }
}