
public class SimpleRemoteControl {
	Command slot;
	//Ŀ�ǵ带 ������� ����
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
