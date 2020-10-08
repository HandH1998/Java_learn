package collection.generic;

public class GenericInterfaceImpl2<E> implements GenericInterface<E> {
    @Override
    public void method(E i) {
        System.out.println(i);
    }
}
