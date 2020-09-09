package java8.feature.methodreference;

import java.util.function.BiFunction;

public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
