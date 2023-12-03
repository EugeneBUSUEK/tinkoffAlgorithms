import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();
        int n = 0;
        int count = 0;
        for (int i = 0; i < t; i++) {
            n = sn.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sn.nextInt();
            }
            int oddNumIndex = -1;
            boolean isFirstOdd = true;
            count = 0;
            for (int k = 0; k < a.length; k++) {
                if (a[k] % 2 == 0) {
                    System.out.println(1);
                    System.out.println(k + 1);
                    oddNumIndex = -1;
                    break;
                }
                if (isFirstOdd){
                    oddNumIndex = k;
                    isFirstOdd = false;
                } else {
                    System.out.println(count + 1);
                    for (int q = oddNumIndex; q < k + 1; q++) {
                        System.out.print((q + 1) + " ");
                    }
                    System.out.println();
                    oddNumIndex = -1;
                    break;
                }

                count++;
            }
            if (oddNumIndex != -1) {
                System.out.println(-1);
            }
        }
    }
}