import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++){
            String line = scanner.nextLine();
            Integer[] params = convertLineToLongArray(line);
            task(params[0]);
        }
    }

    private static void task(int n) {
        double d = 0.0;
        int a = 2;
        int b = 3;
        while (a < Math.sqrt(n) && b < Math.sqrt(n / a)) {
            if (n % a != 0) {
                a++;
                continue;
            }
            if ((n / a) % b != 0 || (n / a) / b == a || b == a || (n / a) / b == 1) {
                b++;
                continue;
            }
            if (n % (a * b) == 0 && n / (a * b) != a && n / (a * b) != b && n / (a * b) != 1) {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + n / (a * b));
                return;
            } else {
                break;
            }

        }
        System.out.println("NO");
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
