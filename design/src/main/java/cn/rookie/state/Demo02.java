package cn.rookie.state;

/**
 * @author Rookie
 *	抽象的状态类
 */
interface State{
	public abstract void WriteProgram(Work w);
}

/*
 * 每一种时刻的工作状态是不一样的
 * 上午 中午 下午 晚间 睡眠状态
 */
class ForenoonState implements State{

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 12) {
			System.out.println("当前时间是："+w.getHour()+" 是这个点的状态ForenoonState");
		} else {
			w.setState(new NoonState());
			w.WriteProgram();
		}
	}

}

class NoonState implements State{

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 13) {
			System.out.println("当前时间是："+w.getHour()+" 是这个点的状态NoonState");
		} else {
			w.setState(new AfternoonState());
			w.WriteProgram();
		}
	}

}

class AfternoonState implements State{

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 17) {
			System.out.println("当前时间是："+w.getHour()+" 是这个点的状态AfternoonState");
		} else {
			w.setState(new EveningState());
			w.WriteProgram();
		}
	}

}

class EveningState implements State{

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 21) {
			System.out.println("当前时间是："+w.getHour()+" 是这个点的状态EveningState");
		} else {
			w.setState(new SleepingState());
			w.WriteProgram();
		}
	}

}

class SleepingState implements State{

	@Override
	public void WriteProgram(Work w) {
		System.out.println("当前时间是："+w.getHour()+" 下班了，洗洗睡吧!");
	}

}

/**
 * 本应该在工作类里做判断的内容，都转化为一个一个的状态，工作类获取状态就可以知道每个状态对应的方法是什么
 * @author Rookie
 *
 */
class Work{
	private State state;
	private double hour;
	public Work() {
		this.state = new ForenoonState();
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void WriteProgram(){
		state.WriteProgram(this);
	}
}


public class Demo02 {



	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(9);
		work.WriteProgram();
		work.setHour(12);
		work.WriteProgram();
		work.setHour(13);
		work.WriteProgram();
		work.setHour(17);
		work.WriteProgram();
		work.setHour(21);
		work.WriteProgram();
		work.setHour(22);
		work.WriteProgram();

	}

}
