package cn.bl.observer.jdkObserver;

import java.util.Observable;

/**
 * 主题（被观察者）
 * @Deacription observable
 * @Author BarryLee
 * @Date 2019/9/14 23:00
 */
public class MyObservable extends Observable {
  private int value;

  public MyObservable() {};

  public void setValue(int value) {
    this.value = value;
    // 先将change设置为true
    setChanged();
    // 然后再做通知，因为Observable会先进行判断change是否为true
    notifyObservers(value);
  }

  public int getValue() {
    return value;
  }
}
