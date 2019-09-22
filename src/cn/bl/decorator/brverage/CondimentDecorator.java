package cn.bl.decorator.brverage;

/**
 * @Deacription 调料抽象类，也就是装饰者，相当于类图中的Decorator
 * 有抽象方法一定就是抽象类
 *
 * 首先，必须让Condiment Decorator能够取代Beverage
 * 所以将CondimentDecorator拓展自Beverage
 *
 * @Author BarryLee
 * @Date 2019/9/22 17:12
 */
public abstract class CondimentDecorator extends Beverage{

  public abstract String getDescription();

}
