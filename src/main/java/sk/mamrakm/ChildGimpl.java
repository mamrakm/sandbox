package sk.mamrakm;

public class ChildGimpl<T> implements InterfaceChildG<T>{
    @Override
    public T differentGetValue() {
        return (T) new Jedi();
    }

    @Override
    public T getValue() {
        return (T) new Sith();
    }
}
