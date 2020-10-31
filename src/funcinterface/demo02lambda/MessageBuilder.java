package funcinterface.demo02lambda;

@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接消息的方法
    public abstract String builderMessage();
}
