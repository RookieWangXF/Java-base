package cn.rookie.adapter;
abstract class Player{
	String name;
	public Player(String name){
		this.name = name;
	}
	public abstract void Attack();
	public abstract void Defence();
}

class Forwards extends Player{

	public Forwards(String name) {
		super(name);
	}
	@Override
	public void Attack() {
		System.out.println("qianfeng+jingong  "+name);
	}
	@Override
	public void Defence() {
		System.out.println("qianfeng+fangshou  "+name);
	}
	
}

class Centers extends Player{
	public Centers(String name){
		super(name);
	}
	@Override
	public void Attack() {
		System.out.println("zhongfeng+jingong  "+name);
	}
	@Override
	public void Defence() {
		System.out.println("zhongfeng+fangshou  "+name);
	}
	
}

class ForeignCenter{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void jingong(){
		System.out.println("进攻"+name);
	}
	public void fangshou() {
		System.out.println("防守"+name);
	}
}

//实际上类图中画的是实现客户端接口，继承foreignCenter类
//这里可以不用继承，用has a模式，
class Translator extends Player{
	private ForeignCenter foreignCenter = new ForeignCenter();
	public Translator(String name) {
		super(name);
		foreignCenter.setName(name);
		foreignCenter.getName();
	}
	//重写的目标类中的函数，当目标类要调用某个方法时，实际上调用的是适配者的一个方法。	@Override
	public void Attack() {
		foreignCenter.jingong();
	}

	@Override
	public void Defence() {
		foreignCenter.fangshou();
	}
	
}

public class AdapterBasketball {

	public static void main(String[] args) {

		Player aPlayer = new Forwards("maidi");
		aPlayer.Attack();
		aPlayer.Defence();
		Player bPlayer= new Centers("dengken");
		bPlayer.Attack();
		bPlayer.Defence();
		Player cPlayer = new Translator("yaoming");
		cPlayer.Attack();
		cPlayer.Defence();
		
		Player p1 = new Forwards("leilei");
		p1.Attack();
		Translator t1 = new Translator("leilei");
		t1.Attack();
	}

}
