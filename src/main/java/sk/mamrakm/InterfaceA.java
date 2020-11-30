package sk.mamrakm;

public interface InterfaceA {
    default void func() {
        System.out.println("InterfaceA");
    }
}
