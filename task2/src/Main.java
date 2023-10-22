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

        int i = 0;
        int wall = 0;

        while (wall < arr.length && i < arr.length) {
            if (arr[i] >= arr[wall]) {
                int indexToInsert = findIndexToInsert(arr, wall, arr[i]);
                insertElement(arr, i, indexToInsert);
                wall++;
                i = wall;
            } else {
                i++;
            }
        }

        int resultSum = 0;
        int coinCount = 0;

        for (int k = 0; k < arr.length; k++) {
            resultSum += arr[k];
            coinCount++;
            if (totalSum - resultSum < resultSum) {
                break;
            }
        }

        System.out.println(coinCount);
    }

    private static void insertElement(Integer[] arr, Integer indexFrom, Integer indexTo) {
        int element = arr[indexFrom];
        if (indexTo > indexFrom) {
            for (int i = indexFrom + 1; i <= indexTo; i++) {
                arr[i - 1] = arr[i];
            }
        } else {
            for (int i = indexFrom - 1; i >= indexTo; i--) {
                arr[i + 1] = arr[i];
            }
        }
        arr[indexTo] = element;
    }

    private static int findIndexToInsert(Integer[] arr, int wall, int element) {
        for (int i = 0; i < wall; i++) {
            if (arr[i] < element) {
                return i;
            }
        }

        return wall;
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