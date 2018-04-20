import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplayObserver implements Observer, DisplayElement{
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	
	public StatisticsDisplayObserver(Observable observable) {
		observable.addObserver(this); // 옵저버로 등록
	}
	
	public void display() {
		System.out.println("평균/최고/최저 기온 = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherDataObservable) {
			WeatherDataObservable wdo = (WeatherDataObservable) obs;
			tempSum += wdo.getTemperature();
			numReadings++;

			float temp = wdo.getTemperature();
			
			if (temp > maxTemp) {
				maxTemp = temp;
			}
	 
			if (temp < minTemp) {
				minTemp = temp;
			}

			display();
		}
		
		
	}
}
