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
        int leftBlock = 0;
        int rightBlock = n * k;
        int mid = 0;
        int counter = 0;

        while (rightBlock - leftBlock > n) {
            mid = leftBlock + (((rightBlock / n) - (leftBlock / n)) / 2) * n;
            counter = mid / n;
            if ((mid + 1) - counter > k) {
                rightBlock = mid;
            } else {
                leftBlock = mid;
            }
        }
        if (n == k) {
            return k + 1;
        }

        return k + counter;
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