package cn.rookie.command;

public class ConcreteCommand implements Command{
	//指定一个receiver,接收命令
    private Receiver receiver;
    public ConcreteCommand() {
	}
    public ConcreteCommand(Receiver receiver) {
    	this.receiver = receiver;
	}
	//执行receiver中的烤肉
	@Override
	public void execute() {
		receiver.doAction();
	}
	
}
