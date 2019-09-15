package cn.bl.observer.pullObserver;

/**
 * @Deacription TODO
 * @Author BarryLee
 * @Date 2019/9/15 10:43
 */
public class SimpleDisplay implements Display, Observer {
  private int value;
  private SimpleObservable observable;

  public SimpleDisplay(Observable observable) {
    this.observable = (SimpleObservable) observable;
    observable.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("value = " + value);
  }

  @Override
  public void update() {
    value = observable.getValue();
    display();
  }
}
