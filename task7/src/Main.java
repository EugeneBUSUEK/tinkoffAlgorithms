import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        List<Set<String>> result = new ArrayList<>(t);

        for (int i = 0; i < t; i++) {
            result.add(new TreeSet<>((o1, o2) -> {
                if (o1 == o2) {
                    return 0;
                }
                if (o1 == null) {
                    return -1;
                }
                if (o2 == null) {
                    return 1;
                }
                return o1.compareTo(o2);
            }));
        }

        int i = 0;
        for (Set<String> res : result) {
            String line = scanner.nextLine();
            String[] a = convertLineToIntArray(line);
            i = 0;
            while (i < a.length) {
                if (i == a.length - 1) {
                    res.add(a[i]);
                    i ++;
                    continue;
                }

                if (a[i].equals(a[i + 1])) {
                    i += 2;
                    continue;
                }

                res.add(a[i]);
                i ++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Set<String> res : result) {
            for (String s : res) {
                sb.append(s);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static String[] convertLineToIntArray(String line) {
        String[] chars = line.split("");
        String[] resultArr = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultArr[i] = chars[i];
        }
        return resultArr;
    }
}