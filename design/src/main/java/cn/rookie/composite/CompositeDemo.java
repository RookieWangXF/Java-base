package cn.rookie.composite;

public class CompositeDemo {

	public static void main(String[] args) {

		
	}

}

abstract class Company{
	String name;
	public Company(String name){
		this.name=name;
	}
	public abstract void Add(Company c);//增加
	public abstract void Remove(Company c);//移除
	public abstract void Display(int depth);//显示
	public abstract void LineOfDuty();//履行职责
}
/*class ConcreteCompany extends Company{


	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		children.add(c);
	}

	@Override
	public void Remove(Company c) {
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		
	}
}*/