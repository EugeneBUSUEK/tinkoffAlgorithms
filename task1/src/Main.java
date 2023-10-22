import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Integer[] arr = convertLineToIntArray(line);

        Integer[] subArr = new Integer[] {0, 0, 0};

        for (int i : arr) {
            subArr[i - 1] = subArr[i - 1] + 1;
        }

        int i = 0;
        int j = 0;
        int repeat = subArr[j];
        while (repeat != 0) {
            arr[i] = j + 1;
            i++;
            repeat--;

            if (repeat == 0 && j < subArr.length - 1) {
                j++;
                repeat = subArr[j];
            }
        }

        System.out.print(arr[0]);
        for (int k = 1; k < arr.length; k++) {
            System.out.print("+" + arr[k]);
        }
    }

    public static Integer[] convertLineToIntArray(String line) {
        String[] chars = line.split("\\+");
        Integer[] resultArr = new Integer[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultArr[i] = Integer.parseInt(chars[i]);
        }
        return resultArr;
    }
}