import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++){
            String line = scanner.nextLine();
            Long[] params = convertLineToLongArray(line);
            System.out.println(task(params[0], params[1], params[2], params[3]));
        }
    }

    private static long task(long k, long n, long a, long b) {
        long l = 0;
        long r = n;
        long m = 0;
        while (r >= l) {
            m = l + (r - l) / 2;
            if (m * a + (n - m) * b < k) {
                l = m + 1;
            } else {
                if (r == l) {
                    break;
                }
                r = m;
            }
        }

        if (l == 0) {
            return l * a + (n - l) * b >= k ? -1 : l;
        }

        return l - 1;
    }

    public static Long[] convertLineToLongArray(String line) {
        String[] chars = line.split(" ");
        Long[] resultArr = new Long[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultArr[i] = Long.parseLong(chars[i]);
        }
        return resultArr;
    }
}