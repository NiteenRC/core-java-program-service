package practice;


@FunctionalInterface
public interface Test1<A, B, C> {
    C apply(A a, B b);

    default void printString() {
        System.out.println("softwaretestinghelp");
    }
}
