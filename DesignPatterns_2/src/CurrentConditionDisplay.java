
public class CurrentConditionDisplay implements Observer, DisplayElement {
	// WeatherData 객체로부터 변경 사항을 받기 위해서 Observer를 구현합니다. 
	// API 구조상 모든 디스플레이 항목에서 DisplayElement를 구현해 display()메소드를 구현하기로 했습니다.
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	// 생성자에 WeatherData라는 주제 객체가 전달되며, 그 객체를 써서 디스플레이 옵저버로 등록합니다.
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	// update가 WeatherData에서 호출되면 기온과 습도를 저장하고 display()를 호출합니다.
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	// display() 메소드에서는 가장 최근에 얻은 기온과 습도를 출력합니다.
	public void display() {
		System.out.println("현재 온도는 화씨" + temperature 
			+ "F 그리고 " + humidity + "%의 습도 입니다.");
	}
}
