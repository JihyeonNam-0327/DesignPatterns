import java.util.Observable;
import java.util.Observer;

public class ForecastDisplayObserver implements Observer, DisplayElement {

	private float currentPressure = 29.9f;
	private float lastPressure;
	
	public ForecastDisplayObserver(Observable observable) {
		observable.addObserver(this); // 옵저버로 등록
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("기상예보 : ");
		if (currentPressure > lastPressure) {
			System.out.println("날씨가 좋아지고 있어요!");
		} else if (currentPressure == lastPressure) {
			System.out.println("비슷한 날씨일 것으로 예상되네요.");
		} else if (currentPressure < lastPressure) {
			System.out.println("추워질 수 있으니 조심하세요, 비 조심하시구요.");
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
