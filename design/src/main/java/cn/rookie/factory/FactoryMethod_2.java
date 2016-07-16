package cn.rookie.factory;
abstract class Gun{

	protected int killNum = 0;
	public abstract void OutLook();
	public abstract void Method();
	public abstract void Lethality(int num);
}

class ShouGun extends Gun{
	@Override
	public void OutLook() {
		System.out.println("这是手枪---");
	}
	@Override
	public void Method() {
		System.out.println("手枪杀伤力为"+this.killNum);
	}
	@Override
	public void Lethality(int num) {
		//设置杀伤力为500
		this.killNum = num;
	}
}

class ChongGun extends Gun{
	@Override
	public void OutLook() {
		System.out.println("这是冲锋枪");
	}
	@Override
	public void Method() {
		System.out.println("冲锋枪杀伤力为"+this.killNum);
	}
	@Override
	public void Lethality(int num) {
		//设置杀伤力为1000
		this.killNum = num;
	}
	
}

class JuGun extends Gun{
	@Override
	public void OutLook() {
		System.out.println("这是狙击枪---");
	}
	@Override
	public void Method() {
		System.out.println("狙击枪的杀伤力为"+this.killNum);
	}
	@Override
	public void Lethality(int num) {
		//设置杀伤力为2000
		this.killNum = num;
	}
}

//工厂类的实现
abstract class GunFactory{
	public abstract Gun produce();
}

class ShouFactory extends GunFactory{
	@Override
	public Gun produce() {
		return new ShouGun();
	}
}

class ChongFactory extends GunFactory{
	@Override
	public Gun produce() {
		return new ChongGun();
	}
}

class JuFactory extends GunFactory{
	@Override
	public Gun produce() {
		return new JuGun();
	}
}

public class FactoryMethod_2 {
	public static void main(String[] args) {
		Gun shouqiang=new ShouFactory().produce();
		shouqiang.Lethality(300);
		shouqiang.Method();
		Gun chongfengq=new ChongFactory().produce();
		chongfengq.Lethality(1000);
		chongfengq.Method();
		Gun juj = new JuFactory().produce();
		juj.Lethality(2000);
		juj.Method();
	}
}
