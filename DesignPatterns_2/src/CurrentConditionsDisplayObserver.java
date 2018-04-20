import java.util.Observable;
import java.util.Observer;

// 여기에서 구현하는 Observer Interface는 java.util 패키지에 들어있는 Interface입니다.
public class CurrentConditionsDisplayObserver implements Observer, DisplayElement{

	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplayObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver(this); 
		// ☆☆중요☆☆  observable 을 인자로 받아들이고 레퍼런스를 써서 옵저버를 등록합니다.
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherDataObservable) {
			WeatherDataObservable weatherData = (WeatherDataObservable) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("현재 온도는 화씨 " + temperature + "F 그리고 습도는 "
				+ humidity + "% 입니다.");
	}
	
}
