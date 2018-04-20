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
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

}
