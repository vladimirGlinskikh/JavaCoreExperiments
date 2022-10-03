package stackoverflowAnswers.arrayObjects;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Category> buyProducts;

    public Basket(List<Category> buyProducts) {
        this.buyProducts = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "buyProducts=" + buyProducts +
                '}';
    }
}
