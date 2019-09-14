package cn.bl.observer.weather;

/**
 * @Deacription 观察者接口
 * 所有的气象组件都实现观察者接口，这样，主题在需要通知观察者时
 * 有了一个共同的接口
 * @Author BarryLee
 * @Date 2019/9/14 13:03
 */
public interface Observer {
  /**
   * 数据有更新啦
   * 当气象观测值改变时，主题会把这些状态值作为方法的参数，传送给观察者
   * 所有的观察者都必须实现update()方法，以实现观察者接口，在这里
   * 我们把观测值传入观察者中，（这样其实不太好，因为这些观测值的种类和个数在未来有可能改变）
   */
  void update(float temp, float humidity, float pressure);
}
