import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String a = sn.next();

        int lastI = a.length() - 1;
        int resultIndex = -1;
        for (int i = 0; i < lastI; i++) {
            if (a.charAt(i) % 2 == 0) {
                if (a.charAt(i) < a.charAt(lastI)) {
                    resultIndex = i;
                    break;
                }
                resultIndex = i;
            }
        }
        if (resultIndex == -1) {
            System.out.println("-1");;
        } else {
            char[] v = a.toCharArray();
            lastI = v.length - 1;
            char temp = v[resultIndex];
            v[resultIndex] = v[lastI];
            v[lastI] = temp;
            System.out.println(v);
        }
    }
}