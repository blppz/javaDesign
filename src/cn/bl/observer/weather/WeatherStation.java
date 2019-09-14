package cn.bl.observer.weather;

/**
 * @Deacription 测试一下效果如何
 * @Author BarryLee
 * @Date 2019/9/13 22:09
 */
public class WeatherStation {
  public static void main(String[] args) {
    // observable
    // 首先我们需要一个主题的实例
    WeatherData weatherData = new WeatherData();

    // observer
    // 然后需要一个报告版，将这个主题的实例放进去
    new CurrentConditionsDisplay(weatherData);

    // test
    // 最后就可以模拟新的气象测量
    weatherData.setMeasurements(1.1F, 2.1F, 3.1F);
    weatherData.setMeasurements(1.2F, 2.2F, 3.2F);
    weatherData.setMeasurements(1.3F, 2.3F, 3.3F);
  }
}
