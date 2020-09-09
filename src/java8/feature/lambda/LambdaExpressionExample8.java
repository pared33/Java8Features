package java8.feature.lambda;

import java8.feature.lambda.interfaces.Sayable2;

public class LambdaExpressionExample8 {
    public static void main(String[] args) {

        // You can pass multiple statements in lambda expression
        Sayable2 person = (message)-> {
            String str1 = "I would like to say, ";
            return str1 + message;
        };
        System.out.println(person.say("time is precious."));
    }
}
