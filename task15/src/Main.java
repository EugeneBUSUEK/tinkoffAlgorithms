import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        String line;
        for (int i = 0; i < t; i++) {
            line = scanner.nextLine();
            Integer[] params = convertLineToIntArray(line);
            System.out.println(task(params[0], params[1]));
        }
    }

    private static int task(int n, int k) {
        int l = 0;
        int r = Integer.MAX_VALUE;
        int m = 0;

        while (r > l + 1) {
            m = l + (r - l) / 2;
            if (m - (m / n) > k ) {
                r = m;
            } else {
                l = m;
            }
        }

        return l % n == 0 ? l - 1 : l;
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