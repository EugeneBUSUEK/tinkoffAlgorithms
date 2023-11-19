import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);

        sn.nextLine();
        String line = sn.nextLine();
        String a = line;
        line = sn.nextLine();
        String b = line;
        System.out.println(task(a, b));
    }

    private static int task(String a, String b) {
        int count = 0;
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) != b.charAt(i)) {
                if (i + 1 < a.length() && a.charAt(i) != a.charAt(i + 1) && a.charAt(i + 1) != b.charAt(i + 1)) {
                    i++;
                }
                count++;
            }
            i++;
        }

        return count;
    }
}