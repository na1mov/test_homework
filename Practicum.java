
import java.util.*;
import java.util.stream.Collectors;

public class Practicum {
    public static void main(String[] args) {
        List<String> tokens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (tokens.size() < 2) {
            tokens.add(scanner.nextLine());
        }
        scanner.close();

        int strLength = Integer.parseInt(tokens.get(0));
        List<String> strList = tokens.get(1).codePoints()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.toList());

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        List<Integer> cList = new ArrayList<>();
        List<Integer> dList = new ArrayList<>();

        for (int i = 0; i < strList.size(); i++) {
            switch (strList.get(i)) {
                case "a":
                    aList.add(i);
                    break;
                case "b":
                    bList.add(i);
                    break;
                case "c":
                    cList.add(i);
                    break;
                case "d":
                    dList.add(i);
            }
        }

        System.out.println(aList);
        System.out.println(bList);
        System.out.println(cList);
        System.out.println(dList);
    }
}