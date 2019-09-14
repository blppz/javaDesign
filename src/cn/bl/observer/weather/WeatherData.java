package cn.bl.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @Deacription 主题实现对象
 * @Author BarryLee
 * @Date 2019/9/14 13:01
 */
public class WeatherData implements Subject{
  // 所有的观察者
  private List<Observer> observerList = new ArrayList<>();
  // 温度
  private float temperature;
  // 湿度
  private float humidity;
  // 气压
  private float pressure;

  @Override
  public void registerObserver(Observer o) {
    // 当观察者需要注册，只需要将它添加到observerList中即可
    observerList.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    if(observerList.indexOf(o) >= 0) {
      // 当观察者想取消注册，只需要将它从observerList中移除就可以了
      observerList.remove(o);
    }
  }

  @Override
  public void notifyObserver() {
    // 在这里，我们把状态高数每一个观察者，因为观察者都实现了update()方法
    // 所以，我们知道如何通知它们
    observerList.forEach(observer ->
        observer.update(temperature, humidity, pressure));
  }

  /**
   * 调用通知
   */
  private void measurementsChanged() {
    notifyObserver();
  }

  /**
   * 设置参数
   * @param temperature 温度
   * @param humidity 湿度
   * @param pressure 气压
   */
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    // 得到了新的数据之后调用
    measurementsChanged();
  }

}
