public class CocktailLayer {
    private String name; // название слоя
    private int count; // количество слоев
    private char symbol; // символ для отображения слоя

    public CocktailLayer(String name, int count, char symbol) {
        this.name = name;
        this.count = count;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public char getSymbol() {
        return symbol;
    }
}
