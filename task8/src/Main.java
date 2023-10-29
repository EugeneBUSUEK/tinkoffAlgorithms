import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();
        Integer[] a = convertLineToIntArray(line);

        int ser = 0;
        int dim = 0;

        int i = 0;
        int j = t - 1;
        boolean turnSwitcher = false;
        int temp = 0;

        while (i <= j) {
            if (a[i] > a[j]) {
                temp = a[i];
                i ++;
            } else {
                temp = a[j];
                j --;
            }

            if (turnSwitcher) {
                dim += temp;
            } else {
                ser += temp;
            }

            turnSwitcher = !turnSwitcher;
        }

        System.out.println(ser + " " + dim);
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