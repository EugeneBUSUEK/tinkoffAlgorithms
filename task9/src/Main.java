import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int k = 0; k < t; k++) {
            String line = scanner.nextLine();
            Integer[] params = convertLineToIntArray(line);
            line = scanner.nextLine();
            Integer[] a = convertLineToIntArray(line);
            System.out.println(task(a, params[2]));
        }
    }


    private static int task(Integer[] a, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int k = 0; k < d; k++) {
            map.put(a[k], map.getOrDefault(a[k], 0) + 1);
        }

        if (d == a.length) {
            return map.keySet().size();
        }

        int i = 1;
        int j = d;

        while (i < a.length - d + 1 && j < a.length) {
            if (map.get(a[i - 1]) - 1 == 0) {
                map.remove(a[i -1]);
            } else {
                map.put(a[i - 1], map.get(a[i - 1]) - 1);
            }
            map.put(a[j], map.getOrDefault(a[j], 0) + 1);

            if (map.keySet().size() < min) {
                min = map.keySet().size();
            }

            i++;
            j++;
        }

        return min;
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
