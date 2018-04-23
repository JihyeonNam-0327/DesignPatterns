
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.on();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ceilingFan.off();
	}
}
