import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] glass = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            for (int j = 0; j < m; j++) {
                glass[i][j] = row.charAt(j);
            }
        }

        int k = scanner.nextInt();
        Map<Character, String> ingredients = new HashMap<>();
        for (int i = 0; i < k; i++) {
            String name = scanner.next();
            int count = scanner.nextInt();
            char symbol = scanner.next().charAt(0);
            ingredients.put(symbol, name);
        }

        // find the bottom row of the glass
        int bottomRow = n - 1;
        while (bottomRow >= 0 && glass[bottomRow][0] != '_') {
            bottomRow--;
        }

        // draw the cocktail
        int currentRow = bottomRow - 1;
        int currentColumn = 0;
        boolean leftEdge = true;
        boolean rightEdge = false;
        while (currentRow >= 0) {
            if (glass[currentRow][0] == '|') {
                leftEdge = true;
            } else if (glass[currentRow][m - 1] == '|') {
                rightEdge = true;
            }
            if (leftEdge && rightEdge) {
                break;
            }
            currentRow--;
        }

        while (currentRow >= 0) {
            StringBuilder rowBuilder = new StringBuilder();
            boolean foundStart = false;
            for (int j = 0; j < m; j++) {
                if (!foundStart && glass[currentRow][j] != '.') {
                    foundStart = true;
                }
                if (foundStart) {
                    char c = glass[currentRow][j];
                    if (c == '/') {
                        rowBuilder.append('/');
                        currentColumn++;
                    } else if (c == '\\') {
                        rowBuilder.append('\\');
                        currentColumn--;
                    } else if (c == '|') {
                        rowBuilder.append('|');
                    } else if (c == '_') {
                        rowBuilder.append('_');
                    } else {
                        rowBuilder.append(ingredients.get(c).charAt(currentColumn));
                    }
                }
            }
            System.out.println(rowBuilder.toString());
            currentRow--;
        }
    }
}









