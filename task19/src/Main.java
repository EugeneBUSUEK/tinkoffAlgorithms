import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String line = sn.nextLine();
        long[] params = toLongArr(line);
        task(params[0], params[1]);
    }

    private static void task(long n, long m) {
        long min = findMin(n, m);
        long max = findMax(n, m);

        System.out.println(min + " " + max);
    }

    private static long findMax(long n, long m) {
        long c = n - (m - 1);
        long res = 0;
        res = (c * (c - 1)) / 2;

        return res;
    }

    private static long findMin(long n, long m) {
        long res = 0;
        long c = n / m;
        long b = n % m;
        long diff = m - b;
        long resTeamMost = 0;
        long resTeamLess = 0;
        resTeamLess = (c * (c - 1)) / 2;
        resTeamMost = resTeamLess + c;
        res = resTeamLess * diff + resTeamMost * (m - diff);
        return res;
    }

    private static long[] toLongArr(String line) {
        String[] splitLine = line.split(" ");
        long[] res = new long[splitLine.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Long.parseLong(splitLine[i]);
        }
        return res;
    }
}