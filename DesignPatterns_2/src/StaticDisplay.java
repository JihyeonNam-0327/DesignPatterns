
public class StaticDisplay implements Observer, DisplayElement{

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StaticDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this); // 옵저버로 등록
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("평균/최고/최저 기온 = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
