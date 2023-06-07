package src;

import java.util.ArrayList;
import java.util.List;

public class Cake {
    private final List<Filling> fillings;

    public Cake() {
        this.fillings = new ArrayList<>();
    }

    public void addFilling(Filling filling) {
        System.out.println("Adding filling: " + filling.getRecipe());
        fillings.add(filling);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cake with fillings:");
        for (Filling filling : fillings) {
            sb.append(" ");
            sb.append(filling.getRecipe());
        }
        return sb.toString();
    }
}
