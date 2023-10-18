import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        List<Integer[]> asToTask = new ArrayList<>();
        Integer[] a;

        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            line = scanner.nextLine();
            a = convertLineToIntArray(line);
            asToTask.add(a);
        }

        for (int i = 0; i < n; i++) {
            if (task(asToTask.get(i))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean task(Integer[] arr) {
        quickSort(arr, 0 , arr.length - 1);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                return false;
            }
        }

        return true;
    }

    public static void quickSort(Integer[] arr, int l, int r) {
        if (l < r) {
            int q = partition(arr, l, r);
            quickSort(arr, l, q);
            quickSort(arr, q + 1, r);
        }
    }

    public static int partition(Integer[] arr, int l, int r) {
        int v = arr[(l + r) / 2];
        int i = l;
        int j = r;

        while (i <= j) {
            while (arr[i] < v) {
                i++;
            }
            while (arr[j] > v) {
                j--;
            }
            if (i >= j) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return j;
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