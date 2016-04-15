package cn.rookie.command;

/*
 * 接受者角色，知道如何操作。
 */
class AudioPlayer {
	public void play(){
		System.out.println("播放...");
	}
	public void rewind(){
		System.out.println("倒带...");
	}
	public void stop(){
		System.out.println("停止...");
	}
}
/*
 * 抽象命令角色
 */
/*interface Command {
	public void execute();
}*/

/*
 * 具体命令
 */
class PlayCommand implements Command{

	private AudioPlayer myAudio;

	public PlayCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}
	@Override
	public void execute() {
		myAudio.play();
	}
}

class RewindCommand implements Command {
	private AudioPlayer myAudio;

	public RewindCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}
	@Override
	public void execute() {
		myAudio.rewind();
	}
}

class StopCommand implements Command {
	private AudioPlayer myAudio;
	public StopCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}
	@Override
	public void execute() {
		myAudio.stop();
	}

}

/*
 * 请求者角色，由键盘类扮演
 */
class Keypad {

	private Command playCommand;
	private Command rewindCommand;
	private Command stopCommand;

	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}

	public void play(){
		playCommand.execute();
	}
	public void rewind(){
		rewindCommand.execute();
	}
	public void stop(){
		stopCommand.execute();
	}
}

public class CommandDemo01 {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer(); //����һ�������߶����Ǿ���ִ�������ʵ��
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);
		
		Keypad keypad = new Keypad();
		keypad.setPlayCommand(playCommand);
		keypad.setRewindCommand(rewindCommand);
		keypad.setStopCommand(stopCommand);
		
		keypad.play();
		keypad.rewind();
		keypad.play();
		keypad.rewind();
		keypad.stop();
	}

}
