package java8.feature.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample10 {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.getName().compareTo(p2.getName());
        });
        for(Product p:list){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }

    }
}
