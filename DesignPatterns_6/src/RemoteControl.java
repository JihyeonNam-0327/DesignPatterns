
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
		undoCommand = onCommands[slot]; //����ڰ� ���� ��ư�̵� �ϴ� ��������!
										//�켱 �ش� Ŀ�ǵ� ��ü�� execute()�޼ҵ带 ȣ���� ����
										//�� ��ü�� ���۷����� undoCommand �ν��Ͻ� ������ �����մϴ�.
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();				//����ڰ� undo ��ư�� ������ undoCommand�� ����Ǿ��ִ�
										//Ŀ�ǵ� ��ü�� undo()�޼ҵ带 ȣ���մϴ�. 
										//�׷��� ���������� �ߴ� �۾��� ��ҵ˴ϴ�. ��� ��� �� ¾��.
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----------remoteControl----------\n");
		for(int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot "+i+"] " + onCommands[i].getClass().getName()
					+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();	//�� ���Ժ� ����� �������� ��!
	}
}
