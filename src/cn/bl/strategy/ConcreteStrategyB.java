package cn.bl.strategy;

/**
 * @Deacription 具体策略类B
 * @Author BarryLee
 * @Date 2019/9/22 16:22
 */
public class ConcreteStrategyB implements Strategy{
  @Override
  public void algorithm() {
    System.out.println("strategy B");
  }
}
