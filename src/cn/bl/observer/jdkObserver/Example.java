package cn.bl.observer.jdkObserver;

/**
 * @Deacription 测试JDK自带观察者API
 * @Author BarryLee
 * @Date 2019/9/15 10:17
 */
public class Example {
  public static void main(String[] args) {
    MyObservable observable = new MyObservable();
    new MyObserver(observable);
    observable.setValue(1);
    observable.setValue(2);
    observable.setValue(3);
  }
}
