package cn.bl.factory.pizza;

import java.util.ArrayList;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/9/25 22:46
 */
public abstract class Pizza {
  String name; // 名称
  String dough; // 面团类型
  String sauce; // 酱料类型
  ArrayList toppings = new ArrayList();

  /**
   * 准备工作需要以特定的顺序进行，有一连串的步骤
   */
  void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough ...");
    System.out.println("Adding sauce ...");
    System.out.println("Adding toppings: ");
    for(int i = 0; i < toppings.size(); i++) {
      System.out.println("  " + toppings.get(i));
    }
  }

  /**
   * 烘烤
   */
  void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  /**
   * 切片
   */
  void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  /**
   * 装盒
   */
  void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }


}















