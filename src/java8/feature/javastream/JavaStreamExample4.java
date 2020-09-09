package java8.feature.javastream;

import java8.feature.lambda.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample4 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getName()));
    }
}
