package cn.bl.strategy;

/**
 * @Deacription 使用策略
 * @Author BarryLee
 * @Date 2019/9/22 16:21
 */
public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    context.setStrategy(new ConcreteStrategyA());
    context.algorithm();

    context.setStrategy(new ConcreteStrategyB());
    context.algorithm();
  }
}
