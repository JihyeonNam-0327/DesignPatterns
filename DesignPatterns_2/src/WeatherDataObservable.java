import java.util.Observable;
import java.util.Observer;

// 옵저버들을 직접 챙기고 등록/탈퇴 등을 직접 관리하지 않아도 되기 때문에
// 등록, 추가, 연락 등을 위한 코드는 전부 뺐습니다.
// (수퍼 클래스 - Observable)에서 전부 다 해주니까요.
public class WeatherDataObservable extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;
	
	// 생성자에서 옵저버들을 저장하기 위한 자료 구조를 만들 필요가 없습니다.
	public WeatherDataObservable() { }
	
	public void measurementsChanged() {
		setChanged();	// notifyObservers()를 호출하기 전에 setChanged()를 호출해서 상태가 바뀜을 알립니다.
		notifyObservers();	// 데이터 객체를 매개변수로 보내지 않습니다. 풀 모델을 사용하고 있다는 거죠.
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
