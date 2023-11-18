import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String line = sn.nextLine();
        line = sn.nextLine();
        Integer[] arr = convertLineToLongArray(line);
        System.out.println(task(arr));
    }

    private static int task(Integer[] a) {
        int sum = 0;
        int tempSum = 0;
        LOOP1: for (int i = 0; i < a.length; i++) {
            if (a[i] < sum) {
                tempSum = 0;
                int j = 0;
                while (j < i) {
                    if (a[i] >= tempSum) {
                        tempSum += a[j];
                        j++;
                    } else {
                        j--;
                        sum += a[i];
                        insertInto(a, i, j);
                        continue LOOP1;
                    }
                }
            }
            sum += a[i];
        }

        return countCondition(a);
    }

    private static int countCondition(Integer[] a){
        int c = 0;
        int sum = 0;
        for (int e : a) {
            if (e >= sum) {
                c++;
            }
            sum += e;
        }
        return c;
    }

    private static void insertInto(Integer[] a, int indexFrom, int indexTo) {
        int element = a[indexFrom];
        for (int i = indexFrom; i > indexTo; i--) {
            a[i] = a[i-1];
        }
        a[indexTo] = element;
    }

    public static Integer[] convertLineToLongArray(String line) {
        String[] chars = line.split(" ");
        Integer[] resultArr = new Integer[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultArr[i] = Integer.parseInt(chars[i]);
        }
        return resultArr;
    }
}