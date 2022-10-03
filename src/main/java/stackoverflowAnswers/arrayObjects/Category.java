package stackoverflowAnswers.arrayObjects;

import java.util.List;

public class Category {
    List<Product> arrayProducts;
    private String categoryName;

    public Category(String categoryName, List<Product> arrayProducts) {
        this.categoryName = categoryName;
        this.arrayProducts = arrayProducts;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getArrayProducts() {
        return arrayProducts;
    }

    public void setArrayProducts(List<Product> arrayProducts) {
        this.arrayProducts = arrayProducts;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", arrayProducts=" + arrayProducts +
                '}';
    }
}
