import java.util.HashMap;

public class Glass {
    private int width;
    private int height;
    private char[][] matrix;

    public Glass(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height][width];
    }

    public void addCocktail(String name, int row, int column, int amount, char symbol) {
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (row >= height || column + i >= width) {
                break;
            }
            matrix[row][column + i] = c;
        }
        for (int i = 0; i < amount; i++) {
            if (row + i >= height) {
                break;
            }
            matrix[row + i][column] = symbol;
        }
    }

    public void print() {
        for (char[] row : matrix) {
            for (char c : row) {
                if (c == 0) {
                    System.out.print(".");
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.nextLine();
        Glass glass = new Glass(width, height);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int amount = scanner.nextInt();
            char symbol = scanner.next().charAt(0);
            scanner.nextLine();
            int row = 0;
            int column = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == '/') {
                        row++;
                        column = 0;
                    } else {
                        column++;
                    }
                }
            }
            glass.addCocktail(name, row, column, amount, symbol);
        }
        glass.print();
    }
}
