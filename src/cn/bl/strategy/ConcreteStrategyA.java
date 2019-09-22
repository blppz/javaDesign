package cn.bl.strategy;

/**
 * @Deacription 具体策略类A
 * @Author BarryLee
 * @Date 2019/9/22 16:21
 */
public class ConcreteStrategyA implements Strategy{
  @Override
  public void algorithm() {
    System.out.println("strategy A");
  }
}
