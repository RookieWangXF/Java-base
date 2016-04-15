package cn.rookie.command;

public class Client {

	public static void main(String[] args) {
		///需要有一个接受者，厨子-负责炒菜的人
		Receiver receiver = new Receiver();
		//可以设置多个命令，根据用户的需求，在命令中指定对应的接受者
		Command command = new ConcreteCommand(receiver);
		Command command2 = new ConcreteCommand2(receiver);
		
		Invoker invoker = new Invoker(command);
		
		invoker.doInvokerAction();
		invoker.setCommand(command2);
		invoker.doInvokerAction();
	}

}
