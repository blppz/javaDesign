package cn.bl.observer.pullObserver;

/**
 * @Deacription test
 * @Author BarryLee
 * @Date 2019/9/15 10:38
 */
public class Example {
  public static void main(String[] args) {
    SimpleObservable observable = new SimpleObservable();
    new SimpleDisplay(observable);
    observable.setValue(1);
    observable.setValue(2);
    observable.setValue(3);
  }
}
