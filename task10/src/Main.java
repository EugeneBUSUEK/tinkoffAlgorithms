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


    private static int task(Integer[] a, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int i = 0;
        int j = a.length - 1;
        int dash = 2;

        while (dash != a.length - 1){
            while (i + dash < j && j - dash > i) {
                if (a[i + dash] - a[i] <= d) {
                    count = count + (dash - 1);
                }
                if (a[j] - a[j - dash] <= d) {
                    count = count + (dash - 1);
                }
                i++;
                j--;
            }
            dash++;
            i = 0;
            j = a.length - 1;
        }

        if (a[a.length - 1] - a[0] <= d) {
            count = count + (dash - 1);
        }

        return count;
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
