import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);

        int n = sn.nextInt();
        String a = sn.next();
        String b = sn.next();

        int count = 0;
        int i = 0;
        while (i < n) {
            if (a.charAt(i) != b.charAt(i)) {
                if (i + 1 < n && a.charAt(i) != a.charAt(i + 1) && a.charAt(i + 1) != b.charAt(i + 1)) {
                    i++;
                }
                count++;
            }
            i++;
        }

        System.out.println(count);;
    }
}