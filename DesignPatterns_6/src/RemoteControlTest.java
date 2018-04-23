
public class RemoteControlTest {
	public static void main(String args[]) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("거실");
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand doorUp = new GarageDoorOpenCommand(door);
		
		remote.setCommand(lightOn);
		// 커맨드 객체(LightOnCommand의 객체)를 인보커(호출자)한테 전달해 줍니다.
		remote.buttonWasPressed();
		System.out.println("-----------구분----------");
		remote.setCommand(doorUp);
		remote.buttonWasPressed();
	}
}
