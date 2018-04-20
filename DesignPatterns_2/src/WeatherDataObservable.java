import java.util.Observable;
import java.util.Observer;

// ���������� ���� ì��� ���/Ż�� ���� ���� �������� �ʾƵ� �Ǳ� ������
// ���, �߰�, ���� ���� ���� �ڵ�� ���� �����ϴ�.
// (���� Ŭ���� - Observable)���� ���� �� ���ִϱ��.
public class WeatherDataObservable extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;
	
	// �����ڿ��� ���������� �����ϱ� ���� �ڷ� ������ ���� �ʿ䰡 �����ϴ�.
	public WeatherDataObservable() { }
	
	public void measurementsChanged() {
		setChanged();	// notifyObservers()�� ȣ���ϱ� ���� setChanged()�� ȣ���ؼ� ���°� �ٲ��� �˸��ϴ�.
		notifyObservers();	// ������ ��ü�� �Ű������� ������ �ʽ��ϴ�. Ǯ ���� ����ϰ� �ִٴ� ����.
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
