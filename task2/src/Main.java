import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String line = scanner.nextLine();
        Integer[] arr = convertLineToIntArray(line);

        int totalSum = 0;
        for (Integer i : arr) {
            totalSum += i;
        }

        int resultSum = arr[0];
        int coinCount = 1;
        if (totalSum - resultSum < resultSum) {
            System.out.println(coinCount);
            return;
        }

        for (int k = 1; k < arr.length; k++){
            resultSum += arr[k];
            coinCount += 1;
            int i = k;
            while (i > 0 && arr[i] > arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }

            if (totalSum - resultSum < resultSum) {
                System.out.println(coinCount);
                return;
            }
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