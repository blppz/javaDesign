package cn.bl.strategy;

/**
 * @Deacription 环境类
 * @Author BarryLee
 * @Date 2019/9/22 16:21
 */
public class Context {

  // 策略是私有的
  private Strategy strategy;

  // 获取策略方法
  public Strategy getStrategy() {
    return strategy;
  }

  // 设置策略
  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  // 调用策略
  public void algorithm() {
    strategy.algorithm();
  }
}
