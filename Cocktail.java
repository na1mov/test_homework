import java.util.List;

public class Cocktail {
    private List<CocktailLayer> layers; // список слоев коктейля

    public Cocktail(List<CocktailLayer> layers) {
        this.layers = layers;
    }

    public List<CocktailLayer> getLayers() {
        return layers;
    }
}
