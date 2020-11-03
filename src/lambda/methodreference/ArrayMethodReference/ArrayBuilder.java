package lambda.methodreference.ArrayMethodReference;

@FunctionalInterface
public interface ArrayBuilder {
    //定义一个创建int类型数组的方法
    int[] builderArray(int length);
}
