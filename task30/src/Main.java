import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();

        int sum = 0;
        int kidNumber = 0;
        int k = 0;
        List<Integer> kids = new ArrayList<>();

        while (sum < n) {
            kidNumber++;
            if ((sum + kidNumber) < n - kidNumber) {
                sum = sum + kidNumber;
                k++;
                kids.add(kidNumber);
            } else {
                kidNumber = n - sum;
                k++;
                kids.add(kidNumber);
                break;
            }
        }

        System.out.println(k);
        System.out.print(kids.get(0));
        for (int i = 1; i < kids.size(); i++) {
            System.out.print(" " + kids.get(i));
        }
    }
}