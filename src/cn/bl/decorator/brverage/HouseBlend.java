package cn.bl.decorator.brverage;

/**
 * @Deacription 混合咖啡，相当于ConcreteComponent
 * @Author BarryLee
 * @Date 2019/9/22 17:28
 */
public class HouseBlend extends Beverage{

  public HouseBlend() {
    description = "house blend coffee";
  }

  @Override
  public double cost() {
    return .89;
  }
}
