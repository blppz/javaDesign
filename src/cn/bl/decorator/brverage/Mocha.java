package cn.bl.decorator.brverage;

/**
 * @Deacription 摩卡调料，是一个具体的装饰者，所以它拓展自CondimentDecorator，相当于ConcreteDecorator
 * @Author BarryLee
 * @Date 2019/9/22 22:57
 */
public class Mocha extends CondimentDecorator{
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", mocha";
  }

  @Override
  public double cost() {
    return beverage.cost() + .20;
  }
}
