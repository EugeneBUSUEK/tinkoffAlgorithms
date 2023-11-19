import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String line = sn.nextLine();
        Integer[] params = toIntArr(line);
        System.out.println(task(params[0], params[1]));
    }

    private static int task(int n, int m) {
        int count = 0;
        int o = n;
        int y = m;
        while (o > 0 && y > 0) {
            if ((o == 1 && y < 2) ||
                    (y == 1 && o < 2)
            ) {
                break;
            }
            if (isATeam(o, y)) {
                o -= 1;
                y -= 2;
            } else if (isBTeam(o, y)) {
                o -= 2;
                y -= 1;
            } else {
                return -1;
            }
            count++;
        }
        
        return count;
    }
    
    private static boolean isATeam(int n, int m) {
        if (n <= m) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isBTeam(int n, int m) {
        if (n >= m) {
            return true;
        } else {
            return false;
        }
    }

    private static Integer[] toIntArr(String line) {
        String[] splitLine = line.split(" ");
        Integer[] res = new Integer[splitLine.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(splitLine[i]);
        }
        return res;
    }
}