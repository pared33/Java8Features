package java8.feature.lambda;

import java8.feature.lambda.interfaces.Sayable2;

public class LambdaExpressionExample4 {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable2 s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable2 s2= name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}
