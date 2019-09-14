package cn.bl.observer.weather;

/**
 * 目前状况报告版
 * @Deacription 此报告版根据weatherData对象显示当前观察值
 * @Author BarryLee
 * @Date 2019/9/14 16:34
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;

  // 为什么要保存一个引用呢，好像构造完了以后就用不着了
  // 答：的确如此，但是以后我们可能想要取消注册，有了引用就比较方便
  private Subject subject;

  public CurrentConditionsDisplay(Subject subject) {
    this.subject = subject;
    // 报告版注册监听
    subject.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("目前状况报告版, T = " + temperature + "H = " + humidity);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }
}
