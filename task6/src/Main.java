import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Integer[] a = convertLineToIntArray(line);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(a[2] - a[0]);
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