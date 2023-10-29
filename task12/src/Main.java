import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Integer[] params = convertLineToIntArray(line);
        List<TaskObj> objs = new ArrayList<>(params[0]);
        for (int i = 0; i < params[0]; i++) {
            line = scanner.nextLine();
            Integer[] a = convertLineToIntArray(line);
            objs.add(new TaskObj(a[0], a[1]));
        }

        objs.sort(Comparator.comparingLong(o -> o.money));
        System.out.println(task(objs, params[1]));

    }

    private static long task(List<TaskObj> a, int d) {
        int i = 0;
        int j = 0;
        long count = 0;
        long max = Integer.MIN_VALUE;

        count += a.get(j).status;
        j++;
        while (i < a.size() && i <= j) {
            while (j < a.size() && a.get(j).money - a.get(i).money < d) {
                count += a.get(j).status;
                j++;
            }
            if (count > max) {
                max = count;
            }
            if (i + 1 > j) {
                j++;
            } else {
                count -= a.get(i).status;
            }
            i++;
        }

        return max;
    }

    private static class TaskObj {
        long money;
        long status;

        public TaskObj(long money, long status) {
            this.money = money;
            this.status = status;
        }
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