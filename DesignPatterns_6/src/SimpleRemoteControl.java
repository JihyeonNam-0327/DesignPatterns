
public class SimpleRemoteControl {
	Command slot;
	//커맨드를 집어넣을 슬롯
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
