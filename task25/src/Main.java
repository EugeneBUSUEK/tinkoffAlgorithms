import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int m = sn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sn.nextInt();
        }
        Set<Integer> s = new HashSet<>();
        for (int i = a.length - 1; i >= 0; i--) {
            s.add(a[i]);
            a[i] = s.size();
        }
        int l = 0;
        for (int i = 0; i < m; i++) {
            l = sn.nextInt() - 1;
            System.out.println(a[l]);
        }
    }
}