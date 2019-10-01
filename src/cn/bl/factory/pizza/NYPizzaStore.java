package cn.bl.factory.pizza;

/**
 * @Deacription 加盟店，纽约风味的披萨店
 * @Author BarryLee
 * @Date 2019/9/25 23:07
 */
public class NYPizzaStore extends PizzaStore{
  @Override
  Pizza createPizza(String type) {
    if("cheese".equals(type)) {
      return new NYStyleCheesePizza();
    } else if("veggie".equals(type)) {
      return null;
    }

    return null;
  }
}
