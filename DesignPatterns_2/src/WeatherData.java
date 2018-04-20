import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();	// Observer ��ü���� �����ϱ� ���� ArrayList�� �߰��߽��ϴ�.
										// �׸��� �����ڿ��� �� ��ü�� �����մϴ�.
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o); // �������� ����� �ϸ� ��� �� �ڿ� �߰��ϱ⸸ �ϸ� �˴ϴ�.
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i); // ����������, �������� Ż�� ��û�ϸ� ��Ͽ��� ���⸸ �ϸ� �˴ϴ�.
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
