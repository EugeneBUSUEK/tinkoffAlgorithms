import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++){
            String line = scanner.nextLine();
            Integer[] params = convertLineToIntArray(line);
            System.out.println(task(params[0], params[1]));
        }
    }

    private static String task(int n, int k) {
        int l = 1;
        int r = n;
        int m = 0;
        while (r - l > 1) {
            m = l + (r - l) / 2;
            if (k > sumRow(1, n - m, 1)) {
                r = m;
            } else {
                l = m;
            }
        }

        long b2 = l + (sumRow(1, n - l , 1) - k) + 1;
        long b1 = l;


        return createString(b1, b2, n);
    }

    private static String createString(long b1, long b2, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == b1 - 1 || i == b2 - 1) {
                sb.append('b');
            } else {
                sb.append('a');
            }
        }
        return sb.toString();
    }

    private static long sumRow(int a, int n, int d) {
        double ad = (double) a;
        double nd = (double) n;
        double dd = (double) d;
        return Math.round(((2 * ad + dd * (nd - 1)) / 2) * nd);
    }

    public static Integer[] convertLineToIntArray(String line) {
        String[] chars = line.split(" ");
        Integer[] resultArr = new Integer[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultArr[i] = Integer.parseInt(chars[i]);
        }
        return resultArr;
    }
}