import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();
        int[] a = new int[n];
        int oneCount = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sn.nextInt();
            if (a[i] == 1) {
                oneCount++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = -1;
            }
        }

        int result = a[0];
        int sum = 0;
        int minSum = 0;
        int l = 0;
        int r = 0;
        int minPos = -1;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            int curr = sum - minSum;
            if (curr > result) {
                result = curr;
                l = minPos + 1;
                r = i;
            }
            if (minSum > sum) {
                minSum = sum;
                minPos = i;
            }
        }
        System.out.println(result + oneCount);
    }
}