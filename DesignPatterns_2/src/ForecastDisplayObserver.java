import java.util.Observable;
import java.util.Observer;

public class ForecastDisplayObserver implements Observer, DisplayElement {

	private float currentPressure = 29.9f;
	private float lastPressure;
	
	public ForecastDisplayObserver(Observable observable) {
		observable.addObserver(this); // �������� ���
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("��󿹺� : ");
		if (currentPressure > lastPressure) {
			System.out.println("������ �������� �־��!");
		} else if (currentPressure == lastPressure) {
			System.out.println("����� ������ ������ ����ǳ׿�.");
		} else if (currentPressure < lastPressure) {
			System.out.println("�߿��� �� ������ �����ϼ���, �� �����Ͻñ���.");
		}
	}

	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherDataObservable) {
			WeatherDataObservable wdo = (WeatherDataObservable) obs;
			lastPressure = currentPressure;
			currentPressure = wdo.getPressure();
			display();
		}
	}
	

}
