package java8.feature.functionalinterface;

public interface Doable {
    default void doIt(){
        System.out.println("Do it now");
    }
}
