import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Integer[] params = convertLineToIntArray(line);
        line = scanner.nextLine();
        Integer[] a = convertLineToIntArray(line);
        System.out.println(task(a, params[1]));
    }

    private static double task(Integer[] a, int l) {
        Arrays.sort(a, Integer::compareTo);
        double max = a[0];
        double diff = Double.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            diff = ((double) (a[i] - a[i - 1])) / 2;
            if (diff > max) {
                max = diff;
            }
        }
        diff = l - a[a.length - 1];
        if ( diff > max) {
            max = diff;
        }

        return max;
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