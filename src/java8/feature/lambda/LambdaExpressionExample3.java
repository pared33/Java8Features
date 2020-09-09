package java8.feature.lambda;

import java8.feature.lambda.interfaces.Sayable;

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
