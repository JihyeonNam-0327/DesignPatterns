
public interface Observer {
	// 기상 정보가 변경되었을 때 옵저버한테 전달되는 상태 값들 입니다.
	public void update(float temp, float humidity, float pressure);
	// Observer Interface는 모든 옵저버 클래스에서 구현해야 합니다.
	// 따라서 모든 옵저버는 update()메소드를 구현해야 합니다.
	// 여기에서는 메리와 수가 얘기했던 대로 옵저버한테 측정한 값들을 전달합니다.
	
	// 기상 정보가 변경되었는지 어떻게 알 수 있을까...?
	// 이전 값이랑 지금 값이랑 비교하나...?
}
