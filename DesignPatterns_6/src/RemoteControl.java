
public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot]; //사용자가 무슨 버튼이든 일단 눌르면은!
										//우선 해당 커맨드 객체의 execute()메소드를 호출한 다음
										//그 객체의 레퍼런스를 undoCommand 인스턴스 변수에 저장합니다.
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();				//사용자가 undo 버튼을 누르면 undoCommand에 저장되어있던
										//커맨드 객체의 undo()메소드를 호출합니다. 
										//그러면 마지막으로 했던 작업이 취소됩니다. 우와 대박 헐 쩐다.
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----------remoteControl----------\n");
		for(int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot "+i+"] " + onCommands[i].getClass().getName()
					+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();	//각 슬롯별 명령이 나오도록 함!
	}
}
