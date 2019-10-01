package cn.bl.factory.pizza;

/**
 * @Deacription pizzaStore是一个抽象类，为何呢
 * @Author BarryLee
 * @Date 2019/9/25 22:45
 */
public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.cut();
    pizza.bake();

    return pizza;
  }

  abstract Pizza createPizza(String type);
}
