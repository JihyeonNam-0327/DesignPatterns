import java.util.Observable;
import java.util.Observer;

// ���⿡�� �����ϴ� Observer Interface�� java.util ��Ű���� ����ִ� Interface�Դϴ�.
public class CurrentConditionsDisplayObserver implements Observer, DisplayElement{

	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplayObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver(this); 
		// �١��߿�١�  observable �� ���ڷ� �޾Ƶ��̰� ���۷����� �Ἥ �������� ����մϴ�.
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
		System.out.println("���� �µ��� ȭ�� " + temperature + "F �׸��� ������ "
				+ humidity + "% �Դϴ�.");
	}
	
}
