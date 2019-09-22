package cn.bl.decorator.brverage;

/**
 * @Deacription 这是咖啡店，也是测试代码
 * @Author BarryLee
 * @Date 2019/9/22 17:05
 */
public class Main {
  public static void main(String[] args) {
    Beverage b1 = new Espresso();
    System.out.println(b1.getDescription() + ": " + b1.cost());

    Beverage b2 = new HouseBlend();
    b2 = new Mocha(b2);
    b2 = new Whip(b2);
    System.out.println(b2.getDescription() + ": " + b2.cost());
  }
}
