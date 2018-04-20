
public class WeatherStation {
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData(); // 우선 weatherData 객체를 생성합니다.
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StaticDisplay staticDisplay = new StaticDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("----------------------------------------");
		weatherData.setMeasurements(27, 30, 28.0f);
		System.out.println("----------------------------------------");
		weatherData.setMeasurements(120, 59, 40.2f);
		
		System.out.println();
		System.out.println("---------------java.util.Observable----------------");
		System.out.println();
		
		WeatherDataObservable wdo = new WeatherDataObservable();
		CurrentConditionsDisplayObserver currentDisplayObservable = 
				new CurrentConditionsDisplayObserver(wdo);
		StatisticsDisplayObserver sdo = new StatisticsDisplayObserver(wdo);
		ForecastDisplayObserver fdo = new ForecastDisplayObserver(wdo);
		
		wdo.setMeasurements(88, 100, 20.0f);
		System.out.println("----------------------------------------");
		wdo.setMeasurements(70, 20, 20.0f);
		System.out.println("----------------------------------------");
		wdo.setMeasurements(75, 60, 35.8f);
	}
}
