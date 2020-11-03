package lambda.methodreference.ConstructorMethodReference;

@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法，根据名字建一个Person类对象
    Person builderPerson(String name);
}
