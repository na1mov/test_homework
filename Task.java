import java.util.*;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<String> tokens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (tokens.size() < 2) {
            tokens.add(scanner.nextLine());
        }
        scanner.close();

        int strLength = Integer.parseInt(tokens.get(0));
        List<Integer> listInt = Arrays.stream(tokens.get(1).split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Map<Integer, Integer> valueToAmount = new HashMap<>();

        for (Integer value : listInt) {
            if (!valueToAmount.containsKey(value)) {
                valueToAmount.put(value, 1);
            } else {
                valueToAmount.put(value, valueToAmount.get(value) + 1);
            }
        }

        int uniqueValue = valueToAmount.size();
        int repeatCount = valueToAmount.values().stream().sorted().collect(Collectors.toList()).get(0);

        System.out.println(uniqueValue*repeatCount);
    }
}

