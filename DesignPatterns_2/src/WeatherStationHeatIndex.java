
public class WeatherStationHeatIndex {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StaticDisplay statisticsDisplay = new StaticDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("----------------------------------------");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("----------------------------------------");
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
