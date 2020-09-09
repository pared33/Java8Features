package java8.feature.methodreference;

import java.util.function.BiFunction;

public class InstanceMethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add2;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
