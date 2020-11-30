package sk.mamrakm;

public class Gimpl<T> implements InterfaceG<T>{
    @Override
    public T getValue() {
        return (T) "Gimpl";
    }
}
