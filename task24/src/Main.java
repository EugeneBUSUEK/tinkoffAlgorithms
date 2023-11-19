import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);

        sn.nextLine();
        String line = sn.nextLine();
        short[] a = toShortArr(line);
        line = sn.nextLine();
        short[] b =toShortArr(line);
        System.out.println(task(a, b));
    }

    private static int task(short[] a, short[] b) {
        int count = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] == b[i]) {
                i++;
                continue;
            } else if (i + 1 < a.length && isSwap(a[i], a[i + 1], b[i + 1])){
                short temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            } else {
                a[i] = flip(a[i]);
            }
            count++;
            i++;
        }

        return count;
    }

    private static boolean isSwap(int a1, int a2, int b2) {
        if (a2 != b2 && a2 != a1) {
            return true;
        }
        return false;
    }

    private static short flip(short a) {
        return (short) (a == 1 ? 0 : 1);
    }

    private static short[] toShortArr(String line) {
        String[] splitLine = line.split("");
        short[] arr = new short[splitLine.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Short.parseShort(splitLine[i]);
        }
        return arr;
    }
}