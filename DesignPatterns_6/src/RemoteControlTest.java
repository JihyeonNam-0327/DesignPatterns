
public class RemoteControlTest {
	public static void main(String args[]) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("�Ž�");
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand doorUp = new GarageDoorOpenCommand(door);
		
		remote.setCommand(lightOn);
		// Ŀ�ǵ� ��ü(LightOnCommand�� ��ü)�� �κ�Ŀ(ȣ����)���� ������ �ݴϴ�.
		remote.buttonWasPressed();
		System.out.println("-----------����----------");
		remote.setCommand(doorUp);
		remote.buttonWasPressed();
	}
}
