package cn.rookie.command;

public class Invoker {
	private Command command;
	public Invoker(Command command) {
		this.command = command;
		
	}
	public void setCommand(Command command){
		this.command=command;
	}
	public void doInvokerAction(){
		command.execute();
	} 
}
