import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());
        String line;
        for (int i = 0; i < t; i++) {
            line = scanner.nextLine();
            Integer[] a = convertLineToIntArray(line);
            System.out.println(task(a[0], a[1]) ? "YES" : "NO");
        }
    }

    private static boolean task(int n, int d) {
        if (d <= n) {
            return true;
        }
        int left = 0;
        int right = n;
        int mid = (right - left) / 2;
        int funcRes = 0;
        int compareResult = d;
        while (right - left > 1) {
            funcRes = func(mid, d);
            if (funcRes <= n) {
                return true;
            }
            if (funcRes < compareResult) {
                right = mid;
            } else {
                left = mid;
            }
            if (funcRes < compareResult) {
                compareResult = funcRes;
            }
            mid = left + (right - left) / 2;
        }
        return false;
    }

    private static boolean ternarySearchMin(int n, int d) {
        if (d <= n) {
            return true;
        }
        int left = 0;
        int right = n;
        int a = 0;
        int b = 0;
        while (right - left > 2) {
            a = (left * 2 + right) / 3;
            b = (left + right * 2) / 3;
            if (func(a, d) < func(b, d)) {
                right = b;
            } else {
                left = a;
            }
        }
        return func(left, d) <= n || func(right, d) <= n;
    }

    private static int func(double x, double d) {
        return (int) (x + Math.ceil(d / (x + 1)));
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