import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String twoWords = line;
        line = scanner.nextLine();
        twoWords += line;
        line = scanner.nextLine();
        char[] seq = line.toCharArray();
        char[] words = twoWords.toCharArray();

        if (seq.length != words.length) {
            System.out.print("NO");
            return;
        }

        words = sortCharArray(words);
        seq = sortCharArray(seq);

        for (int i = 0; i < seq.length; i++) {
            if (words[i] != seq[i]) {
                System.out.print("NO");
                return;
            }
        }

        System.out.print("YES");
    }

    public static char[] sortCharArray(char[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }
        char[] firstArrHalf = Arrays.copyOfRange(arr, 0, arr.length / 2);
        char[] secondArrHalf = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        firstArrHalf = sortCharArray(firstArrHalf);
        secondArrHalf = sortCharArray(secondArrHalf);

        return merge(firstArrHalf, secondArrHalf);
    }

    public static char[] merge(char[] firstArr, char[] secondArr) {
        char[] resultArr = new char[firstArr.length + secondArr.length];

        int firstPos = 0;
        int secondPos = 0;
        for (int i = 0; i < firstArr.length + secondArr.length; i++) {
            if (firstPos == firstArr.length) {
                resultArr[i] = secondArr[secondPos];
                secondPos++;
            } else if (secondPos == secondArr.length) {
                resultArr[i] = firstArr[firstPos];
                firstPos++;
            } else if (firstArr[firstPos] < secondArr[secondPos]) {
                resultArr[i] = firstArr[firstPos];
                firstPos++;
            } else {
                resultArr[i] = secondArr[secondPos];
                secondPos++;
            }
        }

        return resultArr;
    }
}