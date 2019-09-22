package cn.bl.decorator.brverage;

/**
 * @Deacription 泡泡调料，相当于ConcreteDecorator
 * @Author BarryLee
 * @Date 2019/9/22 23:12
 */
public class Whip extends CondimentDecorator{
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", whip";
  }

  @Override
  public double cost() {
    return beverage.cost() + .22;
  }
}
