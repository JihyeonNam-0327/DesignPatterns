
public class CurrentConditionDisplay implements Observer, DisplayElement {
	// WeatherData ��ü�κ��� ���� ������ �ޱ� ���ؼ� Observer�� �����մϴ�. 
	// API ������ ��� ���÷��� �׸񿡼� DisplayElement�� ������ display()�޼ҵ带 �����ϱ�� �߽��ϴ�.
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	// �����ڿ� WeatherData��� ���� ��ü�� ���޵Ǹ�, �� ��ü�� �Ἥ ���÷��� �������� ����մϴ�.
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	// update�� WeatherData���� ȣ��Ǹ� ��°� ������ �����ϰ� display()�� ȣ���մϴ�.
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	// display() �޼ҵ忡���� ���� �ֱٿ� ���� ��°� ������ ����մϴ�.
	public void display() {
		System.out.println("���� �µ��� ȭ��" + temperature 
			+ "F �׸��� " + humidity + "%�� ���� �Դϴ�.");
	}
}
