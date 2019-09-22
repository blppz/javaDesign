package cn.bl.decorator.brverage;

/**
 * @Deacription 饮料抽象类，相当于Conponent
 * @Author BarryLee
 * @Date 2019/9/22 17:10
 */
public abstract class Beverage {
  String description = "Unknown description";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
