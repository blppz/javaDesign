package cn.bl.observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @Deacription observer
 * @Author BarryLee
 * @Date 2019/9/15 10:02
 */
public class MyObserver implements Observer {
  private int value;
  private Observable o;

  public MyObserver(Observable o) {
    this.o = o;
    o.addObserver(this);

  }

  @Override
  public void update(Observable o, Object arg) {
    if(o instanceof MyObservable) {
      this.value = (int)arg;
      display();
    }
  }

  /**
   * 展示监听到的数据
   */
  private void display() {
    System.out.println("display = " + value);
  }
}
