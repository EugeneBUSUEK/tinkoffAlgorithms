import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int a1 = sn.nextInt();
        int a2 = sn.nextInt();

        int count = 0;

        while (a1 > 0 && a2 > 0) {
            if (a1 == 1 && a2 == 1) break;
            if (a1 >= a2 || a2 == 1) {
                a2 += 1;
                a1 -= 2;
            } else {
                a1 += 1;
                a2 -= 2;
            }
            count++;
        }
        System.out.println(count);
    }
}