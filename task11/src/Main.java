import java.util.HashMap;
import java.util.Map;
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

    private static int task(Integer[] a, int t) {
        int freeTime = t;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while (i < a.length && i <= j) {
            while (j < a.length && freeTime - a[j] >= 0) {
                freeTime -= a[j];
                j++;
                count++;
            }
            if (count > max) {
                max = count;
            }
            if (i + 1 > j) {
                j++;
            } else {
                freeTime += a[i];
                count--;
            }
            i++;

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