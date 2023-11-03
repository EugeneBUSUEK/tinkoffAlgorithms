import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++){
            String line = scanner.nextLine();
            Integer[] params = convertLineToIntArray(line);
            System.out.println(task(params[0], params[1], params[2]));
        }

    }

    private static int task(int str, int inj, int exp) {
        int l = 0;
        int r = exp;
        int m = 0;
        while (r >= l) {
            m = l + (r - l) / 2;
            if (str + (exp - m) > inj + m) {
                l = m + 1;
            } else {
                if (r == l) {
                    break;
                }
                r = m;
            }
        }

        return calculateResult(str, inj, l - 1, exp);
    }

    private static int calculateResult(int str, int inj, int additionalInj, int exp) {
        if (str + (exp - additionalInj) <= inj + additionalInj) {
            return 0;
        } else {
            return additionalInj + 1;
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
