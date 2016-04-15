package cn.rookie.command;

public class ConcreteCommand2 implements Command{
	private Receiver receiver;
	public ConcreteCommand2() {
	}
	public ConcreteCommand2(Receiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.doAction2();
	}
	
}
