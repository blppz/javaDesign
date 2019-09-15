package cn.bl.observer.pullObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/9/15 10:44
 */
public class SimpleObservable implements Observable {
  private List<Observer> observers = new ArrayList<>();
  private int value;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    if(observers.indexOf(observer) >= 0) {
      observers.remove(observer);
    }
  }

  @Override
  public void notifyObserver() {
    for(Observer o: observers) {
      o.update();
    }
  }

  void setValue(int value) {
    this.value = value;
    notifyObserver();
  }

  int getValue() {
    return value;
  }
}
