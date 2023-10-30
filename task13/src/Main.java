import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());
        String line;
        for (int i = 0; i < t; i++) {
            line = scanner.nextLine();
            Integer[] a = convertLineToIntArray(line);
            System.out.println(task(a[0], a[1]));
        }
    }

    private static String task(int n, int d) {
        if (d <= n) {
            return "YES";
        }
        double left = 0.0;
        double right = (double) n;
        double mid = (right - left) / 2;
        double funcRes = 0.0;
        double compareResult = (double) d;
        while (right - left > 0.5) {
            funcRes = func(mid, d);
            if (funcRes <= n) {
                return "YES";
            }
            if (funcRes < compareResult) {
                right = mid;
            } else {
                left = mid;
            }
            compareResult = funcRes;
            mid = (right - left) / 2;
        }
        return "NO";
    }

    private static double func(double x, double d) {
        return x + (d / (x + 1));
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