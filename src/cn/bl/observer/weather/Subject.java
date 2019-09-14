package cn.bl.observer.weather;

/**
 * @Deacription 主题对象抽象接口
 * @Author BarryLee
 * @Date 2019/9/14 12:55
 */
public interface Subject {
  /**
   * 注册观察者
   * 需要一个观察者作为变量
   */
  public abstract void registerObserver(Observer o);

  /**
   * 移除观察者
   * 也需要一个观察者作为变量
   */
  public abstract void removeObserver(Observer o);

  /**
   * 通知观察者
   * 当该主题对象改变时，这个方法会被调用，以通知所有的观察者
   */
  public abstract void notifyObserver();
}
