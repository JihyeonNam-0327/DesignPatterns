import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();	// Observer 객체들을 저장하기 위해 ArrayList를 추가했습니다.
										// 그리고 생성자에서 그 객체를 생성합니다.
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o); // 옵저버가 등록을 하면 목록 맨 뒤에 추가하기만 하면 됩니다.
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i); // 마찬가지로, 옵저버가 탈퇴를 신청하면 목록에서 빼기만 하면 됩니다.
		}
	}

	@Override
	public void notifyObservers() {
		// 상태에 대해 모든 옵저버에게 알려주는 부분. 모두 Observer Interface를 구현하는,
		// 즉, update() 메소드가 있는 객체들이므로 손 쉽게 알려줄 수 있습니다.
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		// 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알립니다.
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
