package cn.bl.decorator.brverage;

/**
 * @Deacription 浓缩咖啡，饮料的具体实现，相当于ConcreteComponent
 * @Author BarryLee
 * @Date 2019/9/22 17:21
 */
public class Espresso extends Beverage {

  /**
   * 构造器，设置饮料的描述
   * description来自beverage
   */
  public Espresso() {
    description = "espresso coffee";
  }

  /**
   * 返回Espresso的价格
   * @return
   */
  @Override
  public double cost() {
    return 1.99;
  }
}
