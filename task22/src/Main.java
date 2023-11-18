import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String line = sn.nextLine();

        Integer[] arr = toIntArr(line);
        System.out.println(task(arr));
    }

    private static String task(Integer[] a) {
        int resultIndex = a.length - 1;
        boolean isError = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] < a[a.length - 1]) {
                    resultIndex = i;
                    isError = false;
                    break;
                }
                resultIndex = i;
                isError = false;
            }
        }
        int temp = a[resultIndex];
        a[resultIndex] = a[a.length - 1];
        a[a.length - 1] = temp;
        return toString(a, isError);
    }

    private static String toString(Integer[] a, boolean isError) {
        if (isError) {
            return "-1";
        }
        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            sb.append(i);
        }
        return sb.toString();
    }

    private static Integer[] toIntArr(String line) {
        String[] splitLine = line.split("");
        Integer[] res = new Integer[splitLine.length];
        for (int i = 0; i < line.length(); i++) {
            res[i] = Integer.parseInt(splitLine[i]);
        }
        return res;
    }
}